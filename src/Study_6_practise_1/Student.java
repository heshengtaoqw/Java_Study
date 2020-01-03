package Study_6_practise_1;

public class Student  {

	private String name;
	private int age;
	private int RP = (int)(Math.random()*10);
	
	Student(){};
	
	Student(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void useComputer(Computer computer) {
		System.out.println(this.name + "开始使用电脑");
		computer.turnOn();
		computer.beUsing();
		if(RP>5) {
			computer.turnOff();
		}else {
			System.out.println(this.name + "没有关闭电脑");
		}
	}
	
}
