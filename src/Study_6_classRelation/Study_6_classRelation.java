package Study_6_classRelation;


/*
 * has-a 包含关系（组合、聚合、关联）
 * 
 * 1.组合 -- 人和大脑的关系、人和心脏的关系（非常紧密，整体和部分关系，整体出现整体消失）
 * 2.聚合 -- 汽车和车轮、电脑和主板（紧密，整体与部分关系，能分割）
 * 3.关联 -- 人有汽车，人有电脑（松散，整体与部分关系，能分割）
 * 通过一个类的对象当作另一个类的属性
 * 
 * 
 * use-a（need-a） 依赖关系
 * 	屠夫杀猪
 * 	临时组合在一起，事情一旦完成就解散
 * 	一个类的方法使用到了另一个类的对象：1.可以在方法中传递参数   2.可以在方法中自己创建	
 * 
 * 设计类的关系遵循高内聚，低耦合
 */
public class Study_6_classRelation {
	public static void main(String[] args) {
//		Car car = new Car("宝马",320,"red",new Wheel("米其林",17,"red"));
//		car.showCar();
		Farmer farmer = new Farmer();
		Pig pig = farmer.feedPig(5);
		Butcher butcher = new Butcher();
		butcher.killPig(pig);
	}
}
