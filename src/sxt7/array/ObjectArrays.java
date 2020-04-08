package sxt7.array;

import java.util.Arrays;

public class ObjectArrays {
	public static void main(String[] args) {
		int[] a = {7,9,3,5,2,8};
		int[] b = new int[6];
		System.out.println(a); // 打印数组引用的值；
        System.out.println(Arrays.toString(a)); // 打印数组元素的值；
        Arrays.sort(a);//排序
        System.out.println(Arrays.toString(a)); 
        System.out.println(Arrays.binarySearch(a, 8));//找到则返回0，否则返回负数
        Arrays.fill(a, 2, 4, 100);  //将2到4索引的元素替换为100;
	}
}
