package Study_5_constructed;
import java.util.Scanner;


//设计一个计算器，完成加减乘除的计算
public class Study_5_constructed_calculator {

	
	public double plus(double a,double b) {
		double c = a+b;
		return c;
	}
	public double subtraction(double a,double b) {
		double c = a-b;
		return c;
	}
	public double multiplication(double a,double b) {
		double c = a*b;
		return c;
	}
	public double division(double a,double b) {
		double c = a/b;
		return c;
	}
	
	public void calcuted() {
		
		
			Scanner input = new Scanner(System.in);
			System.out.println("请输入数字：");
			double a = Double.parseDouble(input.nextLine());
			
		over:while(true) {
			System.out.println("请输入符号：");
			String symbol = input.nextLine();
			if(symbol.equals("="))
			{
				System.out.println(a);
				break over;
			}
			if(!(symbol.equals("="))&&!(symbol.equals("+"))&&!(symbol.equals("-"))&&!(symbol.equals("*"))&&!(symbol.equals("/")))
			{
				System.out.println("输入有误，请重新输入符号");
				continue over;
			}
			System.out.println("请输入数字：");
			double b = Double.parseDouble(input.nextLine());
			
			switch(symbol) {
			case "+" :
				a = this.plus(a,b);
				break;
			case "-" :
				a = this.subtraction(a,b);
				break;
			case "*" :
				a = this.multiplication(a,b);
				break;
			case "/" :
				a = this.division(a,b);
				break;
			}
			System.out.println(a);
		}
		
	}
	
	public static void main(String[] args) {
		Study_5_constructed_calculator s5 = new Study_5_constructed_calculator();
		s5.calcuted();
	}
	
}
