package Study_6_practise_2;

/*ģ��һ������ С���� ������֮��Ĺ�ϵ
 * ����������С�������ٶ� 100��/5���� ��׼
 * ���С�������� ����׷��
 * �������׷���ɹ�  ���׷��ʱ��
 * �������׷����  ���׷������
 */

public class Practise_2_velometer {
	public static void main(String[] args) {
		Car car = new Car(20);
		Velometer velometer = new Velometer(5);
		velometer.measure(car);
	}
}
