package Stuyd_7_quanxian_xiushifu;

import Stuyd_7_quanxian_xiushifu_2.Test_A;

public class Test_B extends Test_A {

	public static void main(String[] args) {
		Test_B TB = new Test_B();
		Test_A TA = new Test_A();
		TB.protectedMethod();
		TB.publicMethod();
		TA.protectedMethod();
	}
	
	
	public void TestB() {
		this.publicMethod();
		this.protectedMethod();
	}
	
	
}
