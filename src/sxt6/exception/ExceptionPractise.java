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
				System.out.println("���Թ��������Σ��߳�Ϊ" + a + "," + b +"," + c);
			}else {
				throw new Exception();
			}
		}catch(Exception e) {
			System.out.println("���ܹ���������");
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
			System.out.println("������ѧ������");
			totalStu = input.nextInt();
			if(totalStu<=0) {
				System.out.println("����������������������0����");
			}else {
				System.out.println("��ǰѧ����Ϊ��" + totalStu);	
				break;
			}
		}
		Scanner s2 = new Scanner(System.in);
		while(true) {
			System.out.print("�������" + currentStu + "ѧ��������");
			try {
				stuScore = s2.nextInt();
				if(stuScore<0) {
					throw new Exception();
				}else {
					System.out.println("��" + currentStu + "�ķ���Ϊ" + stuScore);
					sum=stuScore+sum;
					stopFlag = stopFlag+1;
					currentStu++;
				}
			}catch(Exception e) {
				//e.printStackTrace();
				System.out.println("����������������������0����");
			}
			if(stopFlag==totalStu) {
				average = sum/totalStu;
				break;
			}
		}	
		if(totalStu>0) {
			System.out.println("��ѧ����Ϊ��" + totalStu + ", ƽ����Ϊ��" + average);
			return average;
		}else {
			return 0.0;
		}
		
	}
}