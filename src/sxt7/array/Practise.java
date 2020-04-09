package sxt7.array;

import java.util.Scanner;

public class Practise {
	
	public static void main(String[] args) {
		String[] b = {"test1","test2","test3","test4","test5","test6","test7","test8","test9","test10"};
		int[] a = {13,4235,234,5,3456,4367,457};
		int[] c = {0,1,2,3,4,5,6,7,8};
		Practise p = new Practise();
		p.bubbleSearch(a);
		//p.findWord(b);
		p.findRandomMaxMin(600);
		p.arrayReorder(c);
		
	}
	
	public void bubbleSearch(int[] a) {
		for(int i=1;i<a.length;i++) {
			for(int j=a.length-1;j>=i;j--) {
				if(a[j]<a[j-1]) {
					int temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}
			}
		}
		
		for(int b:a) {
			System.out.println(b);
		}
	}
	
	public int findWord( String[] wordDefined) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入一个单词：");
		for(int i=0;i<wordDefined.length;i++) {
			if(s.nextLine().equals(wordDefined[i])){
				System.out.println("Yes");
				return 1;
			}else {
				System.out.println("No");
				return -1;
			}
		}
		return 0;
	}

	public void findRandomMaxMin(int a) {
		int[] randomNum = new int[50];
		int count=0;
		for(int i=0;i<randomNum.length;i++) {
			randomNum[i] = (int)(a*Math.random());
			if(randomNum[i]>=60) {
				count++;
			}
		}
		for(int i:randomNum) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println(count);
		
		int maxNum = randomNum[0];
		for(int i=1;i<randomNum.length;i++) {
			if(maxNum<randomNum[i]) {
				maxNum = randomNum[i];
			}
		}
		System.out.println(maxNum);
		
		int minNum = randomNum[0];
		for(int i=1;i<randomNum.length;i++) {
			if(minNum>randomNum[i]) {
				minNum = randomNum[i];
			}
		}
		System.out.println(minNum);
		
		
	}
	
	public void arrayReorder(int[] b) {
		for(int i:b) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		for(int i=0;i<=(b.length-1)/2;i++) {
			int temp = b[i];
			b[i] = b[b.length-1-i];
			b[b.length-1-i] = temp;
		}
		
		for(int i:b) {
			System.out.print(i+" ");
		}
	}
}
