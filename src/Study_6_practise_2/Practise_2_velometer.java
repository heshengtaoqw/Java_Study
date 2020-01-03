package Study_6_practise_2;

/*模拟一个警车 小汽车 测速器之间的关系
 * 测试器测量小汽车的速度 100米/5秒钟 标准
 * 如果小汽车超速 警车追击
 * 如果警车追击成功  输出追击时间
 * 如果警车追不上  输出追不上了
 */

public class Practise_2_velometer {
	public static void main(String[] args) {
		Car car = new Car(20);
		Velometer velometer = new Velometer(5);
		velometer.measure(car);
	}
}
