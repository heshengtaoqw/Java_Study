import java.util.Scanner;

public class Study_2_Array {

	public static void main(String[] args) {
		xuanze_order();
	}
	
	public static void basic() {
			int[] array1 = new int[5];
			int[] array2 = new int[] {10,20,30};
			int[] array3 = {10,20,30,40,50};
			
			//��ǿforѭ��,����strong_array��������array�����е�ÿһ��ֵ
			for(int strong_array:array3) {
				System.out.println(strong_array);
			}
			
			//��������ؼ��洢���ǻ����������ͣ��洢����ֵ��һ�������ı䣬��һ��������Ÿı�
			//��������ռ�洢���������������ͣ��洢�������õ�ַ��һ�������ĵ�ַ�ı䣬��һ�����Ÿı�
			//int[] x={10,20,30} �൱�� int[]=new int[]{10,20,30}
			//new �����Ķ������ڶ��ڴ��У���������ķ���ջ�ڴ���
			//��int[] y = x,��ʵ�ǽ�xָ��ĵ�ַ��int[]y����x��y����ָ��int[]{10,20,30}
			//, ��y[0] = 100ʱ����ʵ�Ǹı��� int[]{},int[]{100,20,30},����x[0]=100;
			int[] x= {10,20,30};
			int[] y = x;
			y[0] = 100;
			System.out.println(x[0]);
		}
	
	//����һ�����飬�����洢1-100֮���ż��;
	public static void num_oushu() {
		int[] oushu = new int[50];
		for(int i=0;i<oushu.length;i++) {
				oushu[i]=2*i+2;
		}
		for(int j:oushu) {
			System.out.print(j + " ");
		}
	}
	
	//����һ�����飬�����洢1-100֮�������;
	public static void num_jishu() {
		int[] x = new int[50];
		for(int i=0;i<50;i++) {
			x[i] = 2*i+1;
		}
		for(int y:x) {
			System.out.print(y + " ");
		}
	}
	
	//����2�������λ��
	public static void num_switch() {
		int[] a = {1,2,3,4};
		int[] b = {5,6,7,8};
		int[] c = new int[4];
		for(int i=0;i<=3;i++){
			c[i] = a[i];
			a[i] = b[i];
			b[i] = c[i];
		}
		for(int x:a) {
			System.out.print(x+" ");
		}
		for(int x:b) {
			System.out.print(x+" ");
		}

	}

	//����һ�������Ԫ��ͷβ����
	public static void num_switch_head_tail() {
		int[] a= {1,2,3,4,5,6};
		int c;
		for(int i=0;i<=2;i++) {
			c = a[i];
			a[i] = a[5-i];
			a[5-i] = c;
		}
		for(int x:a) {
			System.out.print(x + " ");
		}
	}

	public static void num_average() {
		int[] a= {1,2,3,4,5,6,7};
		int total=0;
		for(int x=0;x<=a.length-1;x++) {
			total=total+a[x];
		}
		int average=total/a.length;
		System.out.println(average);
	}

	public static void num_max_min() {
		int[] a= {7,2,498,5,55,56,48,1365,456,78,16,5555,9965};
		int temp =0;
		int max =0;
		int min =0;
		
		for(int x=0;x<a.length-1;x++) {
			if(a[x]>a[x+1]) {
				temp = a[x];
				a[x] = a[x+1];
				a[x+1] = temp;
				max=a[x];
			}
			max=a[x+1];
		}
		
		for(int x=0;x<a.length-1;x++) {
			if(a[x]<a[x+1]) {
				temp = a[x];
				a[x] = a[x+1];
				a[x+1] = temp;
				min=a[x];
			}
			min=a[x+1];
		}
		
		System.out.println(max);
		System.out.println(min);
	}
	
	//�ϲ�2������
	public static void num_merge() {
		int[] a= {1,2,3};
		int[] b= {4,5,6,7,8};
		int[] c = new int[a.length+b.length];
		
		for(int x=0;x<a.length+b.length;x++) {
			if(x<a.length) {
				c[x] = a[x];
			}
			else{
				c[x] = b[x-a.length];
			}
		}
		for(int x:c) {
			System.out.print(x + " ");
		}
	}
	
	//�޳�0����
	public static void num_find_zero() {
		int[] a= {1,2,3,4,5,0,5,6,7,0,5,62,0,6,88,0,3,6,0,90};
		int count =0;
		int index =0;
		for(int x=0;x<a.length;x++) {
			if(a[x]!=0) {
				count++;
			}
		}
		
		int[] new_array=new int[count];
		for(int x=0;x<a.length;x++) {
			if(a[x]!=0) {
				new_array[index]=a[x];
				index++;
			}
		}
		
		for(int y:new_array) {
			System.out.print(y+" ");
		}

	}
	
	//������
	public static void num_find_sushu() {

		int count =0;

		for(int num=2;num<=100;num++) {
			boolean flag=true;
				for(int x=2;x<=num/2;x++) {
					if(num%x==0) {
						//System.out.println(num + "��������");
						flag=false;
						break;
					}
				
				}
				if(flag) {
					//System.out.println(num + "������");
					count++;
				}
			}
		
		int[] sushu_array = new int[count];
		int index=0;
		
		for(int num=2;num<=100;num++) {
			boolean flag=true;
				for(int x=2;x<=num/2;x++) {
					if(num%x==0) {
						//System.out.println(num + "��������");
						flag=false;
						break;
					}
				
				}
				if(flag) {
					//System.out.println(num + "������");
					sushu_array[index]=num;
					index++;
				}
			}
		for(int y:sushu_array) {
			System.out.print(y+" ");
		}
	}

	//ð������
	public static void num_bubble_ordder() {
		int[] a= {3,45,9,4,3,5,78,1,561,1548,61,648,15,6};
		for(int j=1;j<=a.length-2;j++) {//�����ҵ��ڶ�С������С����
			for(int i=a.length-1;i>=1;i--) {//ÿ��һ��ѭ�����ҵ��ô�ѭ����С�����������е����ϲ�
				if(a[i]<a[i-1]) {
					int c = a[i-1];
					a[i-1] = a[i];
					a[i] = c;
				}
			}
		}
		for(int x:a) {
			System.out.print(x + " ");
		}
	}

	//�û���¼
	public static void login() {
		String[] user = {"jack","tom","jerry"};
		int[] password = {123,456,789};
		boolean flag=false;
		
		Scanner input = new Scanner(System.in);
		System.out.println("�������û���:");
		String a = input.nextLine();
		System.out.println("����������:");
		int b = input.nextInt();
		
		for(int x=0;x<user.length;x++) {
			if(user[x].equals(a)) {
				if(password[x]==b) {
					System.out.println("�û�������������ȷ");
					flag=true;
				}
				break;
			}
		}
		if(!flag) {
			System.out.println("�û������������");
		}
	}

	public static void order() {
		int[] a = {1,2,456,456,2,345,25,456,456,2,2456,3467,25,24,2,1,3,5,6,4,3};
		
		for(int j=1;j<a.length;j++) {
			for(int i=a.length-1;i>=j;i--) {
				if(a[i]<a[i-1]) {
					int x = a[i];
					a[i] = a[i-1];
					a[i-1]	= x;
				}
			}	
		}
		
		for(int x:a) {
			System.out.print(x + " ");
		}
	}

	public static void xuanze_order() {
		int[] a= {1,3,4,7,2,0,5,6};
		
		for(int i=0;i<a.length-1;i++) {
				int min_index = i;
				for(int j=i+1;j<a.length;j++) {
					if(a[min_index]>a[j]) {
						min_index =j;
					}
				}	
			if(min_index!=i) {
					int swap = a[i];
					a[i] = a[min_index];
					a[min_index] = swap;
			}
		}	
		
		
		for(int x:a) {
			System.out.print(x + " ");
		}
	}
}
	
	

