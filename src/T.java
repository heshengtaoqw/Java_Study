
public class T {

	public static void main(String[] args) {
		int[] c = {46,651,64,465465546,46544,465564,645,65446,465,156,89,33,654,78,1213,548,789};
		T t = new T();
		t.find_max(c);
		t.find_min(c);
		t.order_max(c);
	} 
	
	public void find_max(int[] a) {
		int max = a[0];
		for(int i=0;i<a.length-1;i++) {
			if(a[i]>a[i+1]) {
				int temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
				max = a[i+1];
			}
		}
		System.out.println(max);
	}
	
	public void find_min(int[] a) {
		int min = a[0];
		for(int i=0;i<a.length-1;i++) {
			if(a[i]<a[i+1]) {
				int temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
				min = a[i+1];
			}
		}
		System.out.println(min);
	} 

	public void order_max(int[] a) {
		for (int row=1;row < a.length;row++) {
			for(int col=a.length-1;col>=row;col--) {
				if(a[col]>a[col-1]) {
					int temp = a[col];
					a[col] = a[col-1];
					a[col-1] = temp;
				}
			}
		}
		for(int b:a) {
			System.out.println(b11);
		}
	}

}
