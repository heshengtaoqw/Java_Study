package sxt4.sxt4_8_this;

public class This {
	private String name;
	private int age;
	private String sex;
	
	public static void main(String[] args) {
		This t = new This();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		this.setAge(age);
		return this.age;
	}

	public String getSex() {
		return this.sex;
	}
	
}

