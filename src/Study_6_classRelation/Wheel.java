package Study_6_classRelation;

//车轮类
public class Wheel {

	//属性
	public String brand;
	public int size;
	public String color;
	
	Wheel(){};
	Wheel(String brand,int size,String color){
		this.brand = brand;
		this.size = size;
		this.color = color;
	}
	
	public void turn() {
		System.out.println("车轮子可以转");
	}
}
