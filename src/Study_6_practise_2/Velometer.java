package Study_6_practise_2;

public class Velometer {

	private int standardTime;
	
	Velometer(){};
	
	/*
	 * �������ı�׼�ٶ�
	 */
	Velometer(int standardTime){
		this.standardTime = standardTime;
	}
	
	public void measure(Car car) {
		if((100/car.getSpeed())>this.standardTime) {
			System.out.println("С��������");
			PoliceCar policeCar = new PoliceCar(30);
			policeCar.chaseCar(car);
		}else{
			System.out.println("�ٶ�����");
		}
	}
}
