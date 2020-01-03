package Study_5_constructed;
import java.util.Scanner;


//8种基础数据类型  int 
/*
 * 
 * int(32) 整数
 * char(16) 字符
 * float(32) (单精度 float f=3.4f)
 * double(64) (双精度double d=3.4 )
 * boolean(1) 布尔
 * short(16) 短型
 * long(64) 长型
 * byte(8) 字节型
 * 
 * byte,short,char->int->long->float->double
 * byte,short,char之间不会相互转换，计算时候首先转换会int类型。
 * 
 * 
 * 1. short-->int                                        2. int-->short 
   exp: short shortvar=0;                      exp: short shortvar=0; 
   int intvar=0;                                        int intvar=0; 
   shortvar= (short) intvar                      intvar=shortvar; 

3. int->String                                            4. float->String 
   exp: int intvar=1;                                  exp: float floatvar=9.99f; 
   String stringvar;                                     String stringvar; 
   Stringvar=string.valueOf (intvar);          Stringvar=String.valueOf (floatvar); 

5. double->String                                               6. char->String 
   exp double doublevar=99999999.99;           exp char charvar=’a’; 
   String stringvar;                                            String stringvar; 
   Stringvar=String.valueOf (doublevar);         Stringvar=String.valueOf (charvar); 

7  String->int、float、long、double                    8  String->byte、short 
   Exp String intstring=”10”;                           Exp String s=”0”; 
   String floatstring=”10.1f”;                      Byte b=Integer.intValue(s); 
   String longstring=”99999999”;                  Short sh=Integer.intValue(s); 
   String doubleString=”99999999.9”;       

   Int I=Integer.parseInt (intstring);                         9  String->char 
   Float f= Integer.parseInt (floatstring);                Exp String s=”abc”; 
   Long lo=long. parseInt (longstring);                      Char a=s.charAt(0); 
   Double d=double. parseInt (doublestring);                 返回字符a 

10 String-->boolean 
   String s=”true”; 
   Boolean flag=Boolean.valueOf (“s”);

 */
public class Study_5_constructed_DataTypeChange {
	public static void main(String[] args) {
				
		Scanner input = new Scanner(System.in);
		
		//nexLine全部读取，包括回车
		//next 或者nextInt读取回车前的，回车会接到input的后面继续使用
		System.out.println("请输入账号：");
		String username = input.nextLine();
		System.out.println("请输入密码：");
		String password = input.nextLine();
		
		//String转成int
		//"123" ->123; 如果字符串中出现非数字，则要捕获NumberFormatException
		int value = 0;
		
		try {
			 value = Integer.parseInt(password);		
		}catch(NumberFormatException e) {
			System.out.println("输入类型不匹配");
		}
		
		int value2 =0;
		try {
			Integer.valueOf(password).intValue();		
		}catch(NumberFormatException e) {
			System.out.println("输入类型不匹配");
		}
				
		
		//int转成String
		//5->"5";  int a=5； String b=a+""; 
		//String.valueOf()
		//105 如果+""（空字符串），则讲前面的int转成string = 5+5=10 -》“10”，字符串再加一个int，再把后面的5拼接，“105”
		//String a = String.valueOf(5);
		
		System.out.println(5+5+""+5);
		System.out.println(username);
		System.out.println(password);
		System.out.println(value);
		System.out.println(value2);
		
	}
}
