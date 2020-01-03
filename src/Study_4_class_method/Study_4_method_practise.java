package Study_4_class_method;
 import java.util.Scanner;

public class Study_4_method_practise {
	
	//0 设计一个方法，用来画星星，倒三角，行数不确定，方向不确定
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
	
	//1 设计一个方法，用来交换两个数组位置的元素值
	public void changeNum(int[] x, int[] y) {
		System.out.println("交换前a数组为：");
		for(int a:x) {
			System.out.print(a + " ");
		}
		System.out.println("");
		System.out.println("交换前b数组为：");
		for(int b:y) {
			System.out.print(b + " ");
		}
		System.out.println("");

		for(int i=0;i<x.length;i++) {
			int swap = x[i];
			x[i] = y[i];
			y[i] = swap;
		}
		
		System.out.println("交换后a数组为：");
		for(int a:x) {
			System.out.print(a + " ");
		}
		System.out.println("");
		System.out.println("交换后b数组为：");
		for(int b:y) {
			System.out.print(b + " ");
		}
	}
	
	//2 设计一个方法，用来交换一个数组头尾(1,2,3,4)->(4,3,2,1)
	public void switchHead(int[] a) {
		System.out.println("交换前数组排列：");
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
		
		System.out.println("交换前数组排列：");
		for(int x:a)
		{
			System.out.print(x + " ");
		}
	}
	
	//3 找数组中的极值(最大值或者最小值)
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
	
	//4 输入一个数，判断该数是否在数组中存在
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
			System.out.println(num + "在传入的数组中存在");
		}else {
			System.out.println(num + "在传入的数组中中不存在");
		}

	}
		
	//5 设计一个方法，合并两个数组
	public void merge_array(int[] a,int[] b) {
		int[] c = new int[a.length+b.length];
		int d =c.length-a.length-1;
		
		System.out.println("合并前a数组为：");
		for(int x:a) {
			System.out.print(x + " ");
		}
		System.out.println("");
		System.out.println("合并前b数组为：");
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
		
		System.out.println("合并后a+b数组为：");
		for(int x:c) {
			System.out.print(x + " ");
		}
		
	}

	//6 设计一个方法，按照最大位置拆分
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
	
	//7 设计一个方法，用来去掉数组中的0元素
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
	
	//8 设计一个方法，用来存储给定范围内的素数(给范围)
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
					System.out.println(a[i] + "不是素数");
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.println(a[i] + "是素数");
				sushu_count++;
			}
		}
		 
		int sushu_array[] = new int[sushu_count];
		int sushu_index=0;
		
		for(int i=0;i<a.length;i++) {
			boolean flag=true;
				for(int j=2;j<=a[i]/2;j++) {
					if(a[i]%j==0) {
						//System.out.println(num + "不是素数");
						flag=false;
						break;
					}
				
				}
				if(flag) {
					//System.out.println(num + "是素数");
					sushu_array[sushu_index]=a[i];
					sushu_index++;
				}
			}
		for(int y:sushu_array) {
			System.out.print(y+" ");
		}
		
	}
	
	//9 冒泡排序（输入降序或升序）
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
		
	//10 动态参数列表 array(int... x), 可以传任意个(0个)int类型的参数
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
			System.out.println("请输入一个数：");
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
