public class Study_4_class {
	
	public void print(int x) {//�����Ķ����ڴ洢����new������ʱ���������ڴ��У�������ʹ����ջ�ڴ���
		System.out.println("��ǰa��ֵ��" + x );
		x = 10;
		System.out.println("��ǰa��ֵ��" + x );
	}
	
	public void print2(int[] x) {//�����Ķ����ڴ洢����new������ʱ���������ڴ��У�������ʹ����ջ�ڴ���
		System.out.println("��ǰa��ֵ��" + x[0] );
		x[0] = 20;
		System.out.println("��ǰa��ֵ��" + x[0] );
	}
	
	//��������λ�õ�ֵ
	public void changeNum(int[] x,int[] y) {
		for(int i=0;i<x.length;i++) {
			int swap = x[i];
			x[i] = y[i];
			y[i] = swap;
		}
	}
	
	//��������λ�õ�ֵ��ʽ2
	public int[][] changeNum2(int[] x,int[] y) {
		//���淽��ֻ��ջ�ڴ滻��x,y��λ�ã���δ�����������ڴ���ָ����ڴ����
		int[] swap = x;
		x = y;
		y = swap;
		//ͨ�����յķ�ʽ���ѵ����õ����鷵�ظ�������
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
		System.out.println(s4.a + " " + s4.b);//�ڴ�ͼ
		System.out.println(s5.a + " " + s4.b);
		 */
		
		/* print
		Study_4_class s4 = new Study_4_class();
		int a = 20;
		s4.print(a);//�����ĵ�����ջ�ڴ���
		System.out.println("������a��ֵ" + a); //20
		*/

		/* print2
		Study_4_class s4 = new Study_4_class();
		int[] a = {10,20};
		s4.print2(a);//�����ĵ�����ջ�ڴ���
		System.out.println("������a��ֵ" + a[0]);//20
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
 