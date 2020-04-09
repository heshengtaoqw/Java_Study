package sxt7.array;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = {1,5465,8,3,6574,8,31,32456,7};
		int v = 54651;
		BinarySearch bs = new BinarySearch();
		bs.binarySearch(arr, v);
	}
	
	public void binarySearch(int[] array,int value) {
		Arrays.sort(array);
		System.out.println("排序完成，" + Arrays.toString(array));
		int low = 0;
		int high = array.length - 1;
		int middle;
		Boolean b = false;
		
		while(low<=high) {
			 middle = (low + high)/2;
			if(value > array[middle]) {
				low = middle+1;
			}else if(value < array[middle]){
				high = middle-1;
			}else {
				int index = middle +1;
				System.out.println("找到了,查找元素" + value + "在数组第" + index + "位置" );
				b = true;
				break;
			}
		}
		
		if(!b) {
			System.out.println("当前数组没有"+value);
		}
	}
}
