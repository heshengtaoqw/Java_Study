package Study_6_extends;

public class Study_6_extends_Dog extends Study_6_extends_Animal {
	


	
	public void eat() {
		super.eat();//调用父类的eat方法
	}
	
	public void run() {
		int a = 3;
		int b = 4;
		System.out.println("this is a dog run");	
		int c=a>b?a:b;
		System.out.println(c);
	}
	
	
}
