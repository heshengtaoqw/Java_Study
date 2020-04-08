package sxt3.practise;

public class Practise {
	
	
	public static void main(String[] args) {
		System.out.println(sum(7));
		System.out.println(jiecheng(6));
		System.out.println(jiecheng2(5));
	}
	
	public static int jiecheng2(int n) {
		int flag ;
		int b = 1;
		for(flag=n;flag>=1;flag--) {
			b=b*flag;
		}
		return b;
	}
	
	public static int jiecheng(int n) {
		if(n==1) {
			return 1;
		}else {
			return n*jiecheng(n-1);
		}
	}
	
	public static int sum(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return sum(n - 1) + sum(n - 2);
		}
	}
}
