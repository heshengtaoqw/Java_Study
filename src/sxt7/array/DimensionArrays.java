package sxt7.array;

import java.util.Arrays;

public class DimensionArrays {
	public static void main(String[] args) {
		int[][] a = new int[1][2];
		a[0][0] = 3;a[0][1] = 4;
		//System.out.println(a.length);
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		
		int[][] b = {{5,6},{7,8}};
		//System.out.println(a.length);
		System.out.println(b[0][0]);
		System.out.println(b[0][1]);
		
		int[][] c = new int[3][];
		c[0] = new int[] {11};
		c[1] = new int[] {12,14};
		c[2] = new int[] {13,15,16};
		System.out.println(c[0][0]);
		System.out.println(c[1][1]);
		System.out.println(c[2][2]);
		//获取的二维数组第一维数组的长度。
		System.out.println(c.length);
		//获取第二维第一个数组长度。
		System.out.println(c[1].length);
		
		
		Object[] o1 = {"tom","19","man"};
		Object[] o2 = {"lucy","20","female"};
		Object[] o3 = {"jack","21","man"};
		Object[][] emp = new Object[3][];
		emp[0] = o1;
		emp[1] = o2;
		emp[2] = o3;
		System.out.println(Arrays.toString(emp[0]));
		System.out.println(Arrays.toString(emp[1]));
		System.out.println(Arrays.toString(emp[2]));
		
	} 
}
