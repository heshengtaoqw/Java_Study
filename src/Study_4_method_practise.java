import java.util.Scanner;

public class Study_4_method_practise {
	
	//0 ���һ�����������������ǣ������ǣ�������ȷ��������ȷ��
	public void drawStar(int x,String dir) {
		for(int i=x;i>=1;i--) {

			if(dir=="right")
			{
				for(int k=x-i;k>0;k--) {
					System.out.print(" ");
				}		
			}
			
			for(int j=i;j>=1;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//1 ���һ������������������������λ�õ�Ԫ��ֵ
	public void changeNum(int[] x, int[] y) {
		System.out.println("����ǰa����Ϊ��");
		for(int a:x) {
			System.out.print(a + " ");
		}
		System.out.println("");
		System.out.println("����ǰb����Ϊ��");
		for(int b:y) {
			System.out.print(b + " ");
		}
		System.out.println("");

		for(int i=0;i<x.length;i++) {
			int swap = x[i];
			x[i] = y[i];
			y[i] = swap;
		}
		
		System.out.println("������a����Ϊ��");
		for(int a:x) {
			System.out.print(a + " ");
		}
		System.out.println("");
		System.out.println("������b����Ϊ��");
		for(int b:y) {
			System.out.print(b + " ");
		}
	}
	
	//2 ���һ����������������һ������ͷβ(1,2,3,4)->(4,3,2,1)
	public void switchHead(int[] a) {
		System.out.println("����ǰ�������У�");
		for(int x:a)
		{
			System.out.print(x + " ");
		}
		System.out.println("");
		
		for(int x=0;x<a.length/2;x++) {
			int swap = a[x];
			a[x] = a[a.length-1-x];
			a[a.length-1-x] = swap;
		}
		
		System.out.println("����ǰ�������У�");
		for(int x:a)
		{
			System.out.print(x + " ");
		}
	}
	
	//3 �������еļ�ֵ(���ֵ������Сֵ)
	public int findMaxOrMin(int[] a,String MaxOrMin) {
		int max =0;
		int min =0;
		
		if(MaxOrMin.equals("Max")) {
			for(int i=1;i<a.length;i++) {
				if(a[max]<a[i]) {
					max=i;
				}	
			}
			System.out.println("Max num is " + a[max]);
			return max;
		}
		else if(MaxOrMin.equals("Min")){
			for(int i=1;i<a.length;i++) {
				if(a[min]>a[i]) {
					min=i;
				}
			}
			System.out.println("Min num is " + a[min]);
			return min;
		}
		else {
			return 1;
		}
		
	}
	
	//4 ����һ�������жϸ����Ƿ��������д���
	public void findNum(int[] array,int num) {
		boolean flag=false;
		for(int i=0;i<array.length;i++)
		{
			if(num==array[i]) {
				flag=true;
				break;
			}
		}
		
		if(flag) {
			System.out.println(num + "�ڴ���������д���");
		}else {
			System.out.println(num + "�ڴ�����������в�����");
		}

	}
		
		

	
	
	
	
	
	
	public static void main(String[] args) {
		
		Study_4_method_practise s4 = new Study_4_method_practise();
		/* 0
			s4.drawStar(6,"left");
		*/
//-----------------------------------------------------------------------------
		/* 1
			int[] a= {1,2,3,4};
			int[] b= {5,6,7,8};
			s4.changeNum(a,b);
		*/
//------------------------------------------------------------------------------
		/* 2
			int[] a= {1,2,3,4,6};
			s4.switchHead(a);
		*/
//-----------------------------------------------------------------------------
		/* 3
			int[] a= {200,1,2,3,4,6,5,9,7,5,10,90,100,101,92};
			s4.findMaxOrMin(a,"Min");
		*/
//-----------------------------------------------------------------------------
			int[] a= {200,1,2,3,4,6,5,9,7,5,10,90,100,101,92};
			System.out.println("������һ������");
			Scanner input = new Scanner(System.in);
			int num = input.nextInt();
			s4.findNum(a, num);
	}
	
}
