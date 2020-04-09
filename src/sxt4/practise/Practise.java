/*
 * 1. ��д Java ����������ʾ�˵����������䡣����һ������Person�� ������Ӧ��������˽�����ԣ� ���� (name) ������ (age) ��
 * ���幹�췽��������ʼ�����ݳ�Ա���ٶ�����ʾ(display()) �����������������ӡ�������� main �����д��������ʵ��Ȼ����Ϣ��ʾ��

����2. ����һ��Բ�ࡪ��Circle��������ڲ��ṩһ�����ԣ��뾶(r)��ͬʱ �ṩ ���� �� �� �� ���� ��� ( getArea() ) �� ���� �ܳ�(getPerimeter()) �� 
	ͨ��������������Բ���ܳ���������ҶԼ�������������������һ��������� Circle �����ʹ�á�

����3. ���췽�������أ�����һ�������û��࣬��Ϣ���û� ID���û����롢 email ��ַ��
	�ڽ������ʵ��ʱ������������Ϣ����Ϊ���캯���Ĳ������룬 �����û� ID ���û�����ʱ����ȱʡʱ email��ַ���û� ID �����ַ���"@gameschool.com"��
 */
package sxt4.practise;

class Person{
	private String name;
	private int age;
	
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public void display() {
		System.out.println(name);
		System.out.println(age);
	}
}


class Circle{
	
	private double r;
	private double area;
	private double perimeter;
	//getArea() ) �� ���� �ܳ�(getPerimeter()
	
	public double getArea() {
		System.out.println(2 * Math.PI * r);
		return area = 2 * Math.PI * r;	
	}
	
	public double getPerimeter() {
		System.out.println(Math.PI * r * r);
		return perimeter =  Math.PI * r * r;
		
	}
	
	Circle(double r){
		this.r = r;
	}
	
}


class User{
	private String username;
	private String pwd;
	private String email;
	
	User(String username,String pwd){
		this.username = username;
		this.pwd = pwd;
		this.email = this.username + "@gameschool.com";
	}
	
	User(String username,String pwd,String email){
		this.username = username;
		this.pwd = pwd;
		this.email = email;
	}
	
	public String getUserInfo() {
		return this.username + " " + this.pwd + " " + this.email;
	}
}


public class Practise {
	public static void main(String[] args) {
		
		Person p = new Person("С��",15);
		p.display();
		
		Circle c1 = new Circle(10);	
		c1.getArea();c1.getPerimeter();
		Circle c2 = new Circle(20);
		c2.getArea();c2.getPerimeter();
		
		User u1 = new User("Mario","123456");
		System.out.println(u1.getUserInfo());
		User u2 = new User("Luigi","123456","Luigi@123.com");
		System.out.println(u2.getUserInfo());
		
	}
}
