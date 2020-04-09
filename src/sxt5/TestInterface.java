package sxt5;
/*
 * 1. 访问修饰符：只能是public或默认。

      2. 接口名：和类名采用相同命名机制。

      3. extends：接口可以多继承。

      4. 常量：接口中的属性只能是常量，总是：public static final 修饰。不写也是。

      5. 方法：接口中的方法只能是：public abstract。 省略的话，也是public abstract。
 */

public class TestInterface {
    public static void main(String[] args) {
        Volant volant = new Angel();
        volant.fly();
        System.out.println(Volant.FLY_HIGHT);
         
        Honest honest = new GoodMan();
        honest.helpOther();
    }
}
/**飞行接口*/
interface Volant { 
    int FLY_HIGHT = 100;  // 总是：public static final类型的；
    void fly();   //总是：public abstract void fly();
}
/**善良接口*/
interface Honest { 
    void helpOther();
}
/**Angle类实现飞行接口和善良接口*/
class Angel implements Volant, Honest{
    public void fly() {
        System.out.println("我是天使，飞起来啦！");
    }
    public void helpOther() {
        System.out.println("扶老奶奶过马路！");
    }
}
class GoodMan implements Honest {
   public void helpOther() {
        System.out.println("扶老奶奶过马路！");
    }  
}
class BirdMan implements Volant {
    public void fly() {
        System.out.println("我是鸟人，正在飞！");
    }
}

interface A {
    void testa();
}
interface B {
    void testb();
}
/**接口可以多继承：接口C继承接口A和B*/
interface C extends A, B {
    void testc();
}

class Test implements C {
    public void testc() {
    }
    public void testa() {
    }
    public void testb() {
    }
}