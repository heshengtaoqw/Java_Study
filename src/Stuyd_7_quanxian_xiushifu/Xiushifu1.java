package Stuyd_7_quanxian_xiushifu;

/*
 * Ȩ�����η���public protected Ĭ�ϲ�д private��
 * 
 * ��������ʱ��ֻ����public��Ĭ�ϲ�д
 * ���������Աʱ��������ʹ�ã�
 * 				����ɷ���     		ͬ����ͬһ��package���ڿɷ���           	�̳�(ֻ���������ɷ��ʣ������������еĶ��󲻿ɷ���)    ������
 * public 			Y					Y				 				Y							Y
 * protected		Y					Y				 				Y							N
 * default			Y					Y				 				N							N	
 * private			Y					N				 				N							N
 * 
 * ʹ��private �� set/get ����ȡ��˽�е����ԣ��ɳ�����װ����װ��ִ�еĹ��̣��������̵İ�ȫ��������ִ��ϸ�ڣ���ǿ������
 * ���Լ���������Եķ��������������Ĺ�Լ��age ----- setAge(),getAge()
*/

public class Xiushifu1 {
	
	public static void main(String[] args) {
		Xiushifu1 x = new Xiushifu1();
		x.publicMethod();
		x.protectedMethod();
		x.Method();
		x.privateMethod();
	}
	
	public void publicMethod() {
		System.out.println("public Method");
	}
	
	protected void protectedMethod() {
		System.out.println("public Method");
	}
	
	void Method() {
		System.out.println("public Method");
	}
	
	private void privateMethod() {
		System.out.println("public Method");
	}
	
}
