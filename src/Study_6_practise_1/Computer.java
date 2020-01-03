package Study_6_practise_1;

public class Computer {
	
	private String type;
	private int number;
	private boolean status = false;

	
	Computer(){};
	
	Computer(String type,int number){
		this.type = type;
		this.number = number;
	}
	
	public boolean isUsed() {
		return this.status;
	}
	
	public int number() {
		return this.number;
	}
	
	public boolean turnOn() {
		this.status = true;
		System.out.println(this.number + "ºÅ Power is turning on");
		return status;
	}
	
	public void beUsing() {
		System.out.println(this.number + "ºÅ is using");
	}
	
	public boolean turnOff() {
		this.status = false;
		System.out.println(this.number + "ºÅ Power is turning off");
		return status;
	}
	
	
}
