package Study_6_classRelation;


/*
 * has-a ������ϵ����ϡ��ۺϡ�������
 * 
 * 1.��� -- �˺ʹ��ԵĹ�ϵ���˺�����Ĺ�ϵ���ǳ����ܣ�����Ͳ��ֹ�ϵ���������������ʧ��
 * 2.�ۺ� -- �����ͳ��֡����Ժ����壨���ܣ������벿�ֹ�ϵ���ָܷ
 * 3.���� -- �������������е��ԣ���ɢ�������벿�ֹ�ϵ���ָܷ
 * ͨ��һ����Ķ�������һ���������
 * 
 * 
 * use-a��need-a�� ������ϵ
 * 	����ɱ��
 * 	��ʱ�����һ������һ����ɾͽ�ɢ
 * 	һ����ķ���ʹ�õ�����һ����Ķ���1.�����ڷ����д��ݲ���   2.�����ڷ������Լ�����	
 * 
 * �����Ĺ�ϵ��ѭ���ھۣ������
 */
public class Study_6_classRelation {
	public static void main(String[] args) {
//		Car car = new Car("����",320,"red",new Wheel("������",17,"red"));
//		car.showCar();
		Farmer farmer = new Farmer();
		Pig pig = farmer.feedPig(5);
		Butcher butcher = new Butcher();
		butcher.killPig(pig);
	}
}
