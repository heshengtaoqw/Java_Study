import java.util.Scanner;


public class Basic_Grammar {
	
	public static void main(String args[]){
		
		study_xunhuan();
		
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
	
	//if,switch,for,while
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

}
