package sxt5;
/*
 * 1. 有抽象方法的类只能定义成抽象类

     2. 抽象类不能实例化，即不能用new来实例化抽象类。

     3. 抽象类可以包含属性、方法、构造方法。但是构造方法不能用来new实例，只能用来被子类调用。

     4. 抽象类只能用来被继承。

     5. 抽象方法必须被子类实现。
 */
public class Abstract {
	public static void main(String[] args) {
		House h = new House();
		h.build();
	}

}

abstract class Building{
	public abstract void build();
}

class House extends Building{
	public void build(){
		System.out.println("High");
	}
}