package Study_5_constructed;
import java.util.Scanner;


//���һ������������ɼӼ��˳��ļ���
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
			System.out.println("���������֣�");
			double a = Double.parseDouble(input.nextLine());
			
		over:while(true) {
			System.out.println("��������ţ�");
			String symbol = input.nextLine();
			if(symbol.equals("="))
			{
				System.out.println(a);
				break over;
			}
			if(!(symbol.equals("="))&&!(symbol.equals("+"))&&!(symbol.equals("-"))&&!(symbol.equals("*"))&&!(symbol.equals("/")))
			{
				System.out.println("���������������������");
				continue over;
			}
			System.out.println("���������֣�");
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
