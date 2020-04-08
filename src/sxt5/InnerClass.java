package sxt5;

public class InnerClass {
	class Outer {
	    private int age = 10;
	    class Inner {
	        int age = 20;
	        public void show() {
	            int age = 30;
	            System.out.println("内部类方法里的局部变量age:" + age);// 30
	            System.out.println("内部类的成员变量age:" + this.age);// 20
	            System.out.println("外部类的成员变量age:" + Outer.this.age);// 10
	        }
	    }
	}
}
