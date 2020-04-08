package sxt7.array;

public class BubbleSort {

	public static void main(String[] args){
		int[] a = {5645,12345,7487,56,143,43,14,5,7,8,23,13,456};
		for(int i=1;i<a.length;i++) {
			for(int j=a.length-1;j>=i;j--) {
				if(a[j]<a[j-1]) {
					int temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}
			}
		}
		for(int s:a) {
			System.out.println(s);
		}
}
}
