package Study_4_class_method;
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
		
	//5 ���һ���������ϲ���������
	public void merge_array(int[] a,int[] b) {
		int[] c = new int[a.length+b.length];
		int d =c.length-a.length-1;
		
		System.out.println("�ϲ�ǰa����Ϊ��");
		for(int x:a) {
			System.out.print(x + " ");
		}
		System.out.println("");
		System.out.println("�ϲ�ǰb����Ϊ��");
		for(int x:b) {
			System.out.print(x + " ");
		}
		System.out.println("");
		
		for(int i=0;i<a.length;i++) {
			c[i] = a[i];
		}
		for(int i=0;i<b.length;i++) {
			c[d] = b[i];
			d++;
		}
		
		System.out.println("�ϲ���a+b����Ϊ��");
		for(int x:c) {
			System.out.print(x + " ");
		}
		
	}

	//6 ���һ���������������λ�ò��
	public void split_num(int[] a) {
		int max=0;
		int a2_index=0;
		for(int x:a) {
			System.out.print(x + " ");
		}
		System.out.println("");

		for(int i=1;i<a.length;i++) {
			if(a[max]<a[i]) {
				max=i;
			}	
		}
		
		int[] a1 = new int[max];
		int[] a2 = new int[a.length-max];
		
		for(int i=0;i<max;i++) {
			a1[i] = a[i];
		}
		for(int i=max;i<a.length;i++) {
			a2[a2_index] = a[i];
			a2_index++;
		}
		
		for(int x:a1) {
			System.out.print(x + " ");
		}
		System.out.println("");
		for(int x:a2) {
			System.out.print(x + " ");
		}
		
	}
	
	//7 ���һ������������ȥ�������е�0Ԫ��
	public int[] remove_zero(int[] a) {
		
		int count =0;
		int a1_index=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0) {
				count++;
			}
		}
		int[] a1 = new int[count];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0) {
				a1[a1_index] = a[i];
				a1_index++;
			}
		}
		return a1;
	}
	
	//8 ���һ�������������洢������Χ�ڵ�����(����Χ)
	public void find_sushu(int min,int max) {
		int count=max-min+1;
		int sushu_count=0;
		int[] a = new int[count];
		int index =0;
		for(int i=min;i<=max;i++) {
			a[index] = i;
			index++;
		}
			
		for(int i=0;i<a.length;i++) {
			boolean flag=true;
			for(int j=2;j<=a[i]/2;j++) {
				if(a[i]%j==0){
					System.out.println(a[i] + "��������");
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.println(a[i] + "������");
				sushu_count++;
			}
		}
		 
		int sushu_array[] = new int[sushu_count];
		int sushu_index=0;
		
		for(int i=0;i<a.length;i++) {
			boolean flag=true;
				for(int j=2;j<=a[i]/2;j++) {
					if(a[i]%j==0) {
						//System.out.println(num + "��������");
						flag=false;
						break;
					}
				
				}
				if(flag) {
					//System.out.println(num + "������");
					sushu_array[sushu_index]=a[i];
					sushu_index++;
				}
			}
		for(int y:sushu_array) {
			System.out.print(y+" ");
		}
		
	}
	
	//9 ð���������뽵�������
	public int[] order(int[] a, String order_method) {
		int u =a.length;
		for(int i=0;i<a.length-1;i++) {
			for(int j=a.length-1;j>i;j--) {
				if((order_method.equals("desc")&&a[j]<a[j-1]) || (order_method.equals("asc")&&a[j]>a[j-1])){
					{
						int swap = a[j];
						a[j] = a[j-1];
						a[j-1] = swap;
						}
				}
			}
		}
		return a;
	}
		
	//10 ��̬�����б� array(int... x), ���Դ������(0��)int���͵Ĳ���
	public void dynatic_array(int...x) {
		
	}
	
	
	public static void main(String[] args) {
		
		Study_4_method_practise s4 = new Study_4_method_practise();
		/* 0
			s4.drawStar(6,"left");
		*/
//------------------------------------------------------------------------------------------------
		/* 1
			int[] a= {1,2,3,4};
			int[] b= {5,6,7,8};
			s4.changeNum(a,b);
		*/
//------------------------------------------------------------------------------------------------
		/* 2
			int[] a= {1,2,3,4,6};
			s4.switchHead(a);
		*/
//------------------------------------------------------------------------------------------------
		/* 3
			int[] a= {200,1,2,3,4,6,5,9,7,5,10,90,100,101,92};
			s4.findMaxOrMin(a,"Min");
		*/
//------------------------------------------------------------------------------------------------
		/*	4
			int[] a= {200,1,2,3,4,6,5,9,7,5,10,90,100,101,92};
			System.out.println("������һ������");
			Scanner input = new Scanner(System.in);
			int num = input.nextInt();
			s4.findNum(a, num);
		*/
//-------------------------------------------------------------------------------------------------
		/*  5
			int[] a= {1,2,3};
			int[] b= {4,5,6,7};
			s4.merge_array(a,b);
		*/
//-------------------------------------------------------------------------------------------------
		/*  6	
			int[] a= {200,1,2,3,4,6,5,9,999,7,5,10,90,100,101,92};
			s4.split_num(a);
		*/
//-------------------------------------------------------------------------------------------------
		/*  7
			int[] a= {200,1,2,0,3,4,6,5,90,0,999,7,5,10,90,0,100,101,92};
			int[] b = s4.remove_zero(a);
			for(int x:b)
			{
				System.out.print(x + " ");
			}
		*/
//-------------------------------------------------------------------------------------------------
		/*  8
			s4.find_sushu(5, 53);
		*/
//-------------------------------------------------------------------------------------------------
		/* 9
			int[] a= {1,5,6,4};
			int[] b =s4.order(a, "desc");
			for(int x:b) {
				System.out.print(x + " ");
			}
		*/
//-------------------------------------------------------------------------------------------------
		/*
		 * s4.dynamic
		 */

	}
	
}
