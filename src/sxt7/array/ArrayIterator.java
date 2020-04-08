package sxt7.array;

public class ArrayIterator {
	public static void main(String[] args) {
		ArrayIterator ai = new ArrayIterator();
		ai.staticArray();
		System.out.println();
		ai.defaultArray();
		System.out.println();
		ai.dynamicArray();	
		System.out.println();
		ai.copyArray();
	}
	
	public void staticArray() {
		int[] s = {1,2,3,4,5};
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i] + " ");
		}
		System.out.println();
		for(int i1:s) {
			System.out.print(i1 + " ");
		}
	}
	
	public void dynamicArray() {
		int[] t = new int[5];
		t[0] = 6;t[1] = 7;t[2] = 8;t[3] = 9;t[4] = 10;
		for(int i=0;i<t.length;i++) {
			System.out.print(t[i] + " ");
		}
	}
	
	public void defaultArray() {
		int[] q = new int[5];
		for(int i=0;i<q.length;i++) {
			System.out.print(q[i] + " ");
		}
	}
	
	public void copyArray() {
		int[] s0 = {1,2,3,4,5};
		int[] s1 = new int[5];
		System.arraycopy(s0, 0, s1, 0, 4);
		for(int s:s1) {
			System.out.print(s + " ");
		}
	}
	
}
