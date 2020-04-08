package sxt6.exception;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

//1.RuntimeException,ͨ������ͨ���߼��жϱ����쳣�ĳ��֣�
//������RuntimeException�磺ArithmeticException��NullPointerException��ClassCastException��ArrayIndexOutOfBoundsException��NumberFormatException

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
	
	//��ͼ����0
	public void testArithmeticException(int a) {
		//ͨ��
		if(a != 0) {
			System.out.println(a/5);
		}
	}
	
	// ���������һ���ն���ĳ�Ա�����򷽷������߷���һ��������ĳ�Աʱ�ᷢ����ָ���쳣
	public void testNullPointerException(String a) {
		if(a != null) {
			System.out.println(a);
		}
	}
	
	// ��������������ת��ʱ���п��ܷ�������ת���쳣(ClassCastException)��
	public void testClassCastException() {
	
		Dog d = new Dog();
		Animal a = new Animal();
		if(a instanceof Cat) {
			Cat c = (Cat) a;
			System.out.println("this is a cat");
		}
	}
	
	//���������һ�������ĳ��Ԫ��ʱ��������Ԫ�ص�����������0~���鳤��-1�����Χ�������������±�Խ���쳣
	public void testArrayIndexOutOfBoundsException() {
		int[] arr = new int[5];
        int a = 5;
        if (a < arr.length) {
            System.out.println(arr[a]);
        }
	}
	
	//��ʹ�ð�װ�ཫ�ַ���ת���ɻ�����������ʱ������ַ����ĸ�ʽ����ȷ�����������ָ�ʽ�쳣
	public void testNumberFormatException() {
		 	String str = "1234abcf";
	        Pattern p = Pattern.compile("^\\d+$");
	        Matcher m = p.matcher(str);
	        if (m.matches()) { // ���strƥ��������ֵ�������ʽ,�Ż�ת��
	            System.out.println(Integer.parseInt(str));
	        }
	}
	
	
}
