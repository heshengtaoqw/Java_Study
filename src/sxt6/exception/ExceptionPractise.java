package sxt6.exception;

import java.util.Scanner;

public class ExceptionPractise {
	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.isTriangle(3, 5, 7);
		//Student s = new Student();
		//s.averageScore();
	}
}


class Triangle{
	void isTriangle(int a,int b,int c) {
		try {
			if(a+b>c && b+c>a && a+c >b) {
				System.out.println("可以构成三角形，边长为" + a + "," + b +"," + c);
			}else {
				throw new Exception();
			}
		}catch(Exception e) {
			System.out.println("不能构成三角形");
			//e.printStackTrace();
		}


	}
}



class Student{
	public Double averageScore() {
		int stopFlag=0;
		int currentStu=1;
		int sum=0;
		int totalStu=0;
		int stuScore=0;
		double average;
		
		Scanner input = new Scanner(System.in);		
		while(true) {
			System.out.println("请输入学生数：");
			totalStu = input.nextInt();
			if(totalStu<=0) {
				System.out.println("输入的数字有误，请输入大于0的数");
			}else {
				System.out.println("当前学生数为：" + totalStu);	
				break;
			}
		}
		Scanner s2 = new Scanner(System.in);
		while(true) {
			System.out.print("请输入第" + currentStu + "学生分数：");
			try {
				stuScore = s2.nextInt();
				if(stuScore<0) {
					throw new Exception();
				}else {
					System.out.println("第" + currentStu + "的分数为" + stuScore);
					sum=stuScore+sum;
					stopFlag = stopFlag+1;
					currentStu++;
				}
			}catch(Exception e) {
				//e.printStackTrace();
				System.out.println("输入的数字有误，请输入大于0的数");
			}
			if(stopFlag==totalStu) {
				average = sum/totalStu;
				break;
			}
		}	
		if(totalStu>0) {
			System.out.println("总学生数为：" + totalStu + ", 平均分为：" + average);
			return average;
		}else {
			return 0.0;
		}
		
	}
}