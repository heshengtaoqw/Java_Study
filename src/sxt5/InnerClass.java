package sxt5;

public class InnerClass {
	class Outer {
	    private int age = 10;
	    class Inner {
	        int age = 20;
	        public void show() {
	            int age = 30;
	            System.out.println("�ڲ��෽����ľֲ�����age:" + age);// 30
	            System.out.println("�ڲ���ĳ�Ա����age:" + this.age);// 20
	            System.out.println("�ⲿ��ĳ�Ա����age:" + Outer.this.age);// 10
	        }
	    }
	}
}
