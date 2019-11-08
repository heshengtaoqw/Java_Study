package Study_6_classRelation;

//车
public class Car {
	
	public String brand;
	public int type;
	public String color;
	public Wheel wheel;//车有轮子
	
	Car(){};
	Car(String brand,int type,String color,Wheel wheel){
		this.brand = brand;
		this.type = type;
		this.color = color;
		this.wheel = wheel;
	}
	
	public void showCar() {
		System.out.println("这是一台"+brand+type+color+"的车子");
		System.out.println("车上装载着"+wheel.brand+wheel.color+wheel.size+"的轮子");
		wheel.turn();
	}
}
