package Stuyd_7_quanxian_xiushifu_3;

public class Person {
	
	private String name;
	private int age;
	
	public void setAge(int age) {
		if(age<0) {
			System.out.println("����ֵ����ȷ");
		}else{
			this.age = age;
		}
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
}
