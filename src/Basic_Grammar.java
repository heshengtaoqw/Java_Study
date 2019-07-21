import java.util.Scanner;


public class Basic_Grammar {
	
	public static void main(String args[]){
		
		study_xunhuan();
		
	}
	
	//数据转换
	public static void datatype_exchange() {
		int a = 8;
		float b = 1.5f;
		double c = 2.0;
		char d = '1';
		String e = "1234567890";
		double cc = (double)a;
		float aa = (int)a;
		System.out.println("数据转换");
		System.out.println(cc);
		System.out.println(aa);
	}
	
	//数据调换
	public static void data_exchange() {
		int aaa = 3;
		int bbb = 4;
		int ccc = aaa;
		aaa = bbb;
		bbb = ccc;
		System.out.println("数据调换"); 
		System.out.println(aaa);
		System.out.println(bbb);
		//&和&&的区别，当运算符两边的表达式的结果都为true时，整个运算结果才为true，否则，只要有一方为false，则结果为false，&&还具有短路的功能，即如果第一个表达式为false，则不再计算第二个表达式
	}
	
	//if,switch,for,while
	public static void study_xunhuan(){
		System.out.println("请输入一个数字");
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
			System.out.println("不及格");
			break;
		case 6:
			System.out.println("及格");
			break;
		case 7:
			System.out.println("良好");
			break;
		case 8:
			System.out.println("好");
			break;
		case 9:
			System.out.println("非常好");
			break;
		case 10:
			System.out.println("满分");
			break;
		default:
			System.out.println("error");
		}
		
		/*	
		String range;
		if (day >=60 && day <70 ) {
			range = "及格";
		}
		else if(day >=70 && day <80 ) {
			range = "良好";
		}
		else if(day >=80 && day <90 ) {
			range = "优秀";
		}
		else if(day >=90 && day <=100 ) {
			range = "非常好";
		}
		else {
			range = "error";
		}
		
		switch(range) {
		case "及格":
			System.out.println("及格");
			break;//跳出当前switch
		case "良好":
			System.out.println("良好");
			break;
		case "优秀":
			System.out.println("优秀");
			break;
		case "非常好":
			System.out.println("非常好");
			break;
		default:
			System.out.println("输入有误");
			break;
		}
		*/
		
		
		
		
	}

}
