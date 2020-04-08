package sxt6.exception;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

//1.RuntimeException,通常可以通过逻辑判断避免异常的出现，
//常见的RuntimeException如：ArithmeticException，NullPointerException，ClassCastException，ArrayIndexOutOfBoundsException，NumberFormatException

//2.

class Dog extends Animal{
}

class Cat extends Animal{
	
}

class Animal{
	
}


public class TestRunException {

	public static void main(String[] args) {
		TestRunException te = new TestRunException();
		te.testClassCastException();
	}
	
	//试图除以0
	public void testArithmeticException(int a) {
		//通过
		if(a != 0) {
			System.out.println(a/5);
		}
	}
	
	// 当程序访问一个空对象的成员变量或方法，或者访问一个空数组的成员时会发生空指针异常
	public void testNullPointerException(String a) {
		if(a != null) {
			System.out.println(a);
		}
	}
	
	// 在引用数据类型转换时，有可能发生类型转换异常(ClassCastException)。
	public void testClassCastException() {
	
		Dog d = new Dog();
		Animal a = new Animal();
		if(a instanceof Cat) {
			Cat c = (Cat) a;
			System.out.println("this is a cat");
		}
	}
	
	//当程序访问一个数组的某个元素时，如果这个元素的索引超出了0~数组长度-1这个范围，则会出现数组下标越界异常
	public void testArrayIndexOutOfBoundsException() {
		int[] arr = new int[5];
        int a = 5;
        if (a < arr.length) {
            System.out.println(arr[a]);
        }
	}
	
	//在使用包装类将字符串转换成基本数据类型时，如果字符串的格式不正确，则会出现数字格式异常
	public void testNumberFormatException() {
		 	String str = "1234abcf";
	        Pattern p = Pattern.compile("^\\d+$");
	        Matcher m = p.matcher(str);
	        if (m.matches()) { // 如果str匹配代表数字的正则表达式,才会转换
	            System.out.println(Integer.parseInt(str));
	        }
	}
	
	
}
