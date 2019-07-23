import java.util.Scanner;


public class Basic_Grammar {
	
	public static void main(String args[]){
		while_sellwatermelon();
	}
	
	//����ת��
	public static void datatype_exchange() {
		int a = 8;
		float b = 1.5f;
		double c = 2.0;
		char d = '1';
		String e = "1234567890";
		double cc = (double)a;
		float aa = (int)a;
		System.out.println("����ת��");
		System.out.println(cc);
		System.out.println(aa);
	}
	
	//���ݵ���
	public static void data_exchange() {
		int aaa = 3;
		int bbb = 4;
		int ccc = aaa;
		aaa = bbb;
		bbb = ccc;
		System.out.println("���ݵ���"); 
		System.out.println(aaa);
		System.out.println(bbb);
		//&��&&�����𣬵���������ߵı��ʽ�Ľ����Ϊtrueʱ��������������Ϊtrue������ֻҪ��һ��Ϊfalse������Ϊfalse��&&�����ж�·�Ĺ��ܣ��������һ�����ʽΪfalse�����ټ���ڶ������ʽ
	}
	
	//if,switch
	public static void study_xunhuan(){
		System.out.println("������һ������");
		Scanner input = new Scanner(System.in);
		//int day = input.nextInt();
		int range = input.nextInt();

		
		switch(range/10) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("������");
			break;
		case 6:
			System.out.println("����");
			break;
		case 7:
			System.out.println("����");
			break;
		case 8:
			System.out.println("��");
			break;
		case 9:
			System.out.println("�ǳ���");
			break;
		case 10:
			System.out.println("����");
			break;
		default:
			System.out.println("error");
		}
		
		/*	
		String range;
		if (day >=60 && day <70 ) {
			range = "����";
		}
		else if(day >=70 && day <80 ) {
			range = "����";
		}
		else if(day >=80 && day <90 ) {
			range = "����";
		}
		else if(day >=90 && day <=100 ) {
			range = "�ǳ���";
		}
		else {
			range = "error";
		}
		
		switch(range) {
		case "����":
			System.out.println("����");
			break;//������ǰswitch
		case "����":
			System.out.println("����");
			break;
		case "����":
			System.out.println("����");
			break;
		case "�ǳ���":
			System.out.println("�ǳ���");
			break;
		default:
			System.out.println("��������");
			break;
		}
		*/
		}
	
	//for
	//���ұ����ĸ��˼ӹ����
	public static void for_jiagong() {
		//�ӹ����������Ϊ370������׼ӹ����������10������Ѽӹ����������20��������ӹ������������2��������ӹ������������2����4�˵ļӹ�����ȣ�����ұ����ӹ������
		
		for(int x=1;x<=370;x++) {
			if((x-10)+(x+20)+(x/2)+(x*2) ==370){
				System.out.println("�ҵ�x: " + x);
			}
		}
	}
	
	//����ͬ��
	public static void for_jitutonglong() {
		//���Ӽ�С��һ��50ֻ�������ȣ�4����С���ȹ�160֧�������Ӻ�С������
		for (int x=1;x<=50;x++) {
			if((2*x) + 4*(50-x) == 160) {
				System.out.println("�ҵ�x: " + x);
			}
		}
		
	}
	
	//Ѱ��ˮ�ɻ�
	public static void for_flower() {
		//����153����λ���ֵ�����+ʮλ���ֵ�����+��λ���ֵ����� = ����Ѱ��100-999֮���ˮ�ɻ�
		
		for(int x =100;x<=999;x++) {
			if((
				((x/100)*(x/100)*(x/100))+
				((x/10%10)*(x/10%10)*(x/10%10))+
				((x%10)*(x%10)*(x%10))) ==x) {
				System.out.println("�ҵ�x: " + x);
			}
		}
	}

	//����������
	public static void for_drawStar() {
		//********* 1      9
		//**** **** 2  4 + 1 + 4
		//***   *** 3  3 + 3 + 3
		//**     ** 4  2 + 5 + 2
		//*       * 5  1 + 7 + 1
		for(int i=1;i<=5;i++) {
			if(i==1) {
				System.out.println("*********");
			}
			else{
				for(int j=1;j<=6-i;j++) {
					System.out.print("*");
				}
				for(int j=1;j<=2*i-3;j++) {
					System.out.print(" ");
				}
				for(int j=1;j<=6-i;j++) {
						System.out.print("*");
				}
				System.out.println();
			}
		}
	}

	//���ֽ�����
	public static void for_number() {
		//   1       i==1  3 1-1 0
		//  121      i==2  2 1-2 1-1
		// 12321     i==3  1 1-3 2-1
		//1234321    i==4  0 1-4 3-1
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}			
			for(int j=i-1;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();	
		}
	}

	//�����˷��� 
	public static void for_count() {
		//1*1=1                 i==1 
		//1*2=2 2*2=4           i==2 
		//1*3=3 2*3=6 3*3=9     i==3
		for(int i=1;i<=9;i++) {
			for(int j=1;j<i+1;j++) {
				System.out.print(j + "*" + i + "=" + i*j + " ");
			}
			System.out.println();
		}
	}

	//Ѱ��2-100֮���������ֻ�ܱ�1���Լ���������  2��3��5��7
	public static void for_findsushu() {
		for(int num=2;num<=100;num++) {
			boolean flag = true;
			for(int i=2;i<num;i++)//���޳��Լ���1����1��С��
			{
				if(num%i==0)//����ܱ�С���Լ���������1���⣩��������ģΪ0����
				{
					flag = false;
					break;//����1000�ڵ�������������ѭ��������������
				}
			}
			if(flag) {
				System.out.println(num);
			}
		}
		
	}
	
	//while
	//ˮ�ط�ˮ����
	public static void while_shuiguan() {
		//ˮ����װ��120Lˮ��������һ����ˮ��30L/h��һ����ˮ��18L/h������ʲôʱ��ˮ�ص�ˮ����
		int x=0;
		while(120-30*x+18*x>0) {
			x++;
			if(120-30*x+18*x==0){
				System.out.println(x);
				break;
			}
		}
		
		for(int y=0;120-30*y+18*y >= 0;y++) {
			if(120-30*y+18*y==0){
				System.out.println(y);
				break;
			}
		}
	}
	
	//������
	public static void while_drawstar() {
		int x=1;
		while(x<=4) {
			int y=1;
			while(y<=4-x) {
				System.out.print(" ");
				y++;
			}
			int z=1;
			while(z<=2*x-1) {
				System.out.print("*");
				z++;
			}
			int u=1;
			while(u<=4-x) {
				System.out.print(" ");
				u++;
			}
			System.out.println("");
			x++;
		}
	}
	
	//��������
	public static void while_encount() {
		//A��B���1000km��a��b��7km/h�ƶ���b��a��18km/h�ƶ�����������
		int x=0;
		while(1000-7*x-18*x > 0) {
			x++;
			if(1000-7*x-18*x==0)
			{
				System.out.println(x + " encounted");
			}
		}
	}

	//��ũ����
	public static void while_sellwatermelon() {
		//��ũһ����1020�����ϣ�ÿ����һ���2�����ʶ�����������
		int x=0;
		int remind=1020;
		while(remind>0) {
			remind = remind/2 - 2;
			x++;
			if(remind ==0)
			{
				System.out.println(x);
			}
		}
	}
	
	
}
