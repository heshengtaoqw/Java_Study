package Study_6_classRelation;

//������
public class Wheel {

	//����
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
		System.out.println("�����ӿ���ת");
	}
}
