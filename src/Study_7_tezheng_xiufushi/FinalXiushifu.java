package Study_7_tezheng_xiufushi;


/*
 * final 最终的，不可修改的
 * 
 * final 可修饰变量，如果在定义变量时没有赋值，则有一次机会给该变量赋值，因为在堆内存中还未有值被使用，一旦被赋值，值无法改变
 * final 可修饰引用类型，x为引用类型，则该类型不能再重新指向其他对象
 * 		   注意变量类型是基本类型还是引用类型
 * 		   如果修饰的变量时基本数据类型，则变量内的值不让更改 -- 常量
 * 		   如果修饰的变量时引用数据类型，则变量内的地址引用不让更改 -- 对象唯一	
 * 		   如果属性用final修饰，则必须给属性一个初始值
 * 
 * final 可修饰方法，final修饰的方法不可更改，该方法不能被子类重写。（重载是传的方法类型和个数不一样，重写是子类继承父类的方法）
 * final 可修饰类，final修饰的类不能再有子类（通常都是工具类Math,Scanner,Integer,String）
 */

public class FinalXiushifu {
	
	public int b;
	final int c = 10;
	private final int d = 11;
	
	public static void main(String[] args) {
		final int a;
		a = 10;
		
		final int[] x = new int[] {1,2,3};
		x[0] = 10;
		x[0] = 100;
		//x = new int[] {4,5,6}; x为引用类型，则该类型不能再重新指向其他对象
	}
	
	//该方法的传进来的a的值不可改变
	public void TestA(final int a) {
		//a=10;
	}
	
	
	
	
}
