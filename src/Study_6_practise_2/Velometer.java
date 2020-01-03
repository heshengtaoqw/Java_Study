package Study_6_practise_2;

public class Velometer {

	private int standardTime;
	
	Velometer(){};
	
	/*
	 * 测速器的标准速度
	 */
	Velometer(int standardTime){
		this.standardTime = standardTime;
	}
	
	public void measure(Car car) {
		if((100/car.getSpeed())>this.standardTime) {
			System.out.println("小汽车超速");
			PoliceCar policeCar = new PoliceCar(30);
			policeCar.chaseCar(car);
		}else{
			System.out.println("速度正常");
		}
	}
}
