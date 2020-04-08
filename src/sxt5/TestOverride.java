package sxt5;

public class TestOverride {
    public static void main(String[] args) {
    	TestOverride to = new TestOverride();
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Bus();
        v1.run();
        v2.run();
        System.out.println(v1);
        System.out.println(to);

    }
}
 
class Vehicle { // 交通工具类
	String window = "v";
    public void run() {
        System.out.println("跑....");
    }
    public String toString() {
		return window;   	
    }
}

class Bus extends Vehicle{
	String window;
	public void run() {
		System.out.println("Bus跑....");
	}
}

 

