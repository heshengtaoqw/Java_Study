package Study_6_classRelation;

//��
public class Car {
	
	public String brand;
	public int type;
	public String color;
	public Wheel wheel;//��������
	
	Car(){};
	Car(String brand,int type,String color,Wheel wheel){
		this.brand = brand;
		this.type = type;
		this.color = color;
		this.wheel = wheel;
	}
	
	public void showCar() {
		System.out.println("����һ̨"+brand+type+color+"�ĳ���");
		System.out.println("����װ����"+wheel.brand+wheel.color+wheel.size+"������");
		wheel.turn();
	}
}
