package Study_6_practise_2;

public class PoliceCar {

	private int speed;
	
	PoliceCar(){};
	
	PoliceCar(int speed){
		this.speed = speed;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public void chaseCar(Car car) {
		if(this.speed > car.getSpeed()) {
			System.out.println("С��������");
			int time = 100/(this.speed-car.getSpeed());
			System.out.println("����"+ time + "׷����");
		}else {
			System.out.println("׷������");
		}
	}
}
