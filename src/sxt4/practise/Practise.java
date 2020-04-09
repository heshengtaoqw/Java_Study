/*
 * 1. 编写 Java 程序用于显示人的姓名和年龄。定义一个人类Person。 该类中应该有两个私有属性： 姓名 (name) 和年龄 (age) 。
 * 定义构造方法用来初始化数据成员。再定义显示(display()) 方法将姓名和年龄打印出来。在 main 方法中创建人类的实例然后将信息显示。

　　2. 定义一个圆类——Circle，在类的内部提供一个属性：半径(r)，同时 提供 两个 方 法 ： 计算 面积 ( getArea() ) 和 计算 周长(getPerimeter()) 。 
	通过两个方法计算圆的周长和面积并且对计算结果进行输出。最后定义一个测试类对 Circle 类进行使用。

　　3. 构造方法与重载：定义一个网络用户类，信息有用户 ID、用户密码、 email 地址。
	在建立类的实例时把以上三个信息都作为构造函数的参数输入， 其中用户 ID 和用户密码时必须缺省时 email地址是用户 ID 加上字符串"@gameschool.com"。
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
	//getArea() ) 和 计算 周长(getPerimeter()
	
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
		
		Person p = new Person("小明",15);
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
