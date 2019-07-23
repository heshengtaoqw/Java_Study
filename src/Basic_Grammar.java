import java.util.Scanner;


public class Basic_Grammar {
	
	public static void main(String args[]){
		while_sellwatermelon();
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
	
	//if,switch
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
	
	//for
	//甲乙丙丁四个人加工零件
	public static void for_jiagong() {
		//加工的总零件数为370，如果甲加工的零件数多10，如果已加工的零件数少20，如果丙加工的零件数乘以2，如果丁加工的零件数除以2，则4人的加工数相等，求甲乙丙丁加工零件数
		
		for(int x=1;x<=370;x++) {
			if((x-10)+(x+20)+(x/2)+(x*2) ==370){
				System.out.println("找到x: " + x);
			}
		}
	}
	
	//鸡兔同笼
	public static void for_jitutonglong() {
		//兔子加小鸡一共50只，兔子腿（4）加小鸡腿共160支，求兔子和小鸡数量
		for (int x=1;x<=50;x++) {
			if((2*x) + 4*(50-x) == 160) {
				System.out.println("找到x: " + x);
			}
		}
		
	}
	
	//寻找水仙花
	public static void for_flower() {
		//类似153，个位数字的立方+十位数字的立方+百位数字的立方 = 本身，寻找100-999之间的水仙花
		
		for(int x =100;x<=999;x++) {
			if((
				((x/100)*(x/100)*(x/100))+
				((x/10%10)*(x/10%10)*(x/10%10))+
				((x%10)*(x%10)*(x%10))) ==x) {
				System.out.println("找到x: " + x);
			}
		}
	}

	//画三角星星
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

	//数字金字塔
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

	//算术乘法表 
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

	//寻找2-100之间的素数，只能被1和自己整除的数  2，3，5，7
	public static void for_findsushu() {
		for(int num=2;num<=100;num++) {
			boolean flag = true;
			for(int i=2;i<num;i++)//先剔除自己和1，在1和小于
			{
				if(num%i==0)//如果能被小于自己的数（除1以外）整除（求模为0），
				{
					flag = false;
					break;//到了1000内的素数，就跳出循环，并输出结果。
				}
			}
			if(flag) {
				System.out.println(num);
			}
		}
		
	}
	
	//while
	//水池放水问题
	public static void while_shuiguan() {
		//水池已装满120L水，现在有一根出水管30L/h和一根进水管18L/h，计算什么时候水池的水放完
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
	
	//画星星
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
	
	//相遇问题
	public static void while_encount() {
		//A和B相距1000km，a向b以7km/h移动，b向a以18km/h移动，求多久相遇
		int x=0;
		while(1000-7*x-18*x > 0) {
			x++;
			if(1000-7*x-18*x==0)
			{
				System.out.println(x + " encounted");
			}
		}
	}

	//瓜农卖瓜
	public static void while_sellwatermelon() {
		//瓜农一共有1020个西瓜，每天卖一半加2个，问多少天能卖完
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
