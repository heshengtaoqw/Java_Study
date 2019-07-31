public class Study_4_class {
	
	public void print(int x) {//方法的定义在存储区，new出对象时拷贝到堆内存中，方法的使用在栈内存中
		System.out.println("当前a的值是" + x );
		x = 10;
		System.out.println("当前a的值是" + x );
	}
	
	public void print2(int[] x) {//方法的定义在存储区，new出对象时拷贝到堆内存中，方法的使用在栈内存中
		System.out.println("当前a的值是" + x[0] );
		x[0] = 20;
		System.out.println("当前a的值是" + x[0] );
	}
	
	//交换数组位置的值
	public void changeNum(int[] x,int[] y) {
		for(int i=0;i<x.length;i++) {
			int swap = x[i];
			x[i] = y[i];
			y[i] = swap;
		}
	}
	
	//交换数组位置的值方式2
	public int[][] changeNum2(int[] x,int[] y) {
		//下面方法只在栈内存换了x,y的位置，并未真正交换堆内存中指向的内存分配
		int[] swap = x;
		x = y;
		y = swap;
		//通过接收的方式，把调换好的数组返回给调用者
		int[][] result = {x,y};
		return result;
	}

	public static void main(String[] args) {
		
		/* Study_4_1_class
		Study_4_1_class s4 = new Study_4_1_class();
		s4.a = 4;
		s4.b = 5;
		Study_4_1_class s5 = s4;
		s5.a = 9;
		s5.b = 10;
		System.out.println(s4.a + " " + s4.b);//内存图
		System.out.println(s5.a + " " + s4.b);
		 */
		
		/* print
		Study_4_class s4 = new Study_4_class();
		int a = 20;
		s4.print(a);//方法的调用在栈内存中
		System.out.println("方法外a的值" + a); //20
		*/

		/* print2
		Study_4_class s4 = new Study_4_class();
		int[] a = {10,20};
		s4.print2(a);//方法的调用在栈内存中
		System.out.println("方法外a的值" + a[0]);//20
		*/
		
		/*changeNum
		int[] a = {1,2,3,4};
		int[] b = {5,6,7,8};
		Study_4_class s4c = new Study_4_class();
		s4c.changeNum(a, b);
		for(int i:a) {
			System.out.println(i);
		}
		System.out.println("--------------------------------------");
		for(int i:b) {
			System.out.println(i);
		}
		*/
			
		/*changeNum2
		int[] a = {1,2,3,4};
		int[] b = {5,6,7,8};
		Study_4_class s4c = new Study_4_class();
		int[][] result = s4c.changeNum2(a, b);
		for(int i:result[0]) {
			System.out.println(i);
		}
		System.out.println("--------------------------------------");
		for(int i:result[1]) {
				System.out.println(i);
		}
		*/
			
	}



}
 