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
			System.out.println("小车超速了");
			int time = 100/(this.speed-car.getSpeed());
			System.out.println("经过"+ time + "追上了");
		}else {
			System.out.println("追不上了");
		}
	}
}
