package sxt7.array;

import java.util.Arrays;

public class ObjectArrays {
	public static void main(String[] args) {
		int[] a = {7,9,3,5,2,8};
		int[] b = new int[6];
		System.out.println(a); // ��ӡ�������õ�ֵ��
        System.out.println(Arrays.toString(a)); // ��ӡ����Ԫ�ص�ֵ��
        Arrays.sort(a);//����
        System.out.println(Arrays.toString(a)); 
        System.out.println(Arrays.binarySearch(a, 8));//�ҵ��򷵻�0�����򷵻ظ���
        Arrays.fill(a, 2, 4, 100);  //��2��4������Ԫ���滻Ϊ100;
	}
}
