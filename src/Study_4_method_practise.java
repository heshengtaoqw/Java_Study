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
			System.out.println("请输入一个数：");
			Scanner input = new Scanner(System.in);
			int num = input.nextInt();
			s4.findNum(a, num);
	}
	
}
