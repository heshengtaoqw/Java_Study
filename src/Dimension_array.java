
public class Dimension_array {

	public static void main(String[] args) {
		dynamic_array();
	}
	
	public static void static_array() {
		int[][] a = {{1,2},{3,4},{5,6}};
		
		for(int[] i:a) {
			for(int j:i) {
				System.out.println(j);
			}
		}
	}
	
	public static void dynamic_array() {
		int[][] a = new int[3][2];
		int num =5;
		
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=1;j++) {
				a[i][j] = num;
				num++;
			}
		}
		for(int[] i:a) {
			for(int j:i) {
				System.out.println(j);
			}
		}
	}

	public static void error_array() {
		int[][] array = new int[3][];
		array[0][0] = 10;//这里会报空指针异常，因为int[][]第二个没有在堆内存中没有开辟控件，长量10无法指向堆内存空间
	}
	
	public static void space_array() {
		int[][] array = new int[3][2];
		array[0][0] = 10;
		array[0][1] = 20;
		array[1] = array[0];
		array[0] = new int[4];
		array[0][0] = 100;
		System.out.println(array[1][0]); //10
	}


}
