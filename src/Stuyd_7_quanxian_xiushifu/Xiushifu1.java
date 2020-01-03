package Stuyd_7_quanxian_xiushifu;

/*
 * 权限修饰符（public protected 默认不写 private）
 * 
 * 当修饰类时，只能用public和默认不写
 * 当修饰类成员时，都可以使用：
 * 				本类可访问     		同包（同一个package）内可访问           	继承(只有子类对象可访问，父类在子类中的对象不可访问)    其他包
 * public 			Y					Y				 				Y							Y
 * protected		Y					Y				 				Y							N
 * default			Y					Y				 				N							N	
 * private			Y					N				 				N							N
 * 
 * 使用private 和 set/get 设置取得私有的属性，可称作封装，封装了执行的过程，保护过程的安全，隐藏了执行细节，增强复用性
 * 属性及其操作属性的方法都有其命名的规约：age ----- setAge(),getAge()
*/

public class Xiushifu1 {
	
	public static void main(String[] args) {
		Xiushifu1 x = new Xiushifu1();
		x.publicMethod();
		x.protectedMethod();
		x.Method();
		x.privateMethod();
	}
	
	public void publicMethod() {
		System.out.println("public Method");
	}
	
	protected void protectedMethod() {
		System.out.println("public Method");
	}
	
	void Method() {
		System.out.println("public Method");
	}
	
	private void privateMethod() {
		System.out.println("public Method");
	}
	
}
