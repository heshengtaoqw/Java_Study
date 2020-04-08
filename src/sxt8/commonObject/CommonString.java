package sxt8.commonObject;

/*
 * StringBuilder��StringBuffer���Ƕ�ԭ�ַ�����������ģ����Զ��ַ��������޸Ķ������������������߲��������ĸ�������˿�����ѭ����ʹ�á�
 
 *	  1. String�����ɱ��ַ����С�
      2. StringBuffer���ɱ��ַ����У������̰߳�ȫ������Ч�ʵ͡�
      3. StringBuilder���ɱ��ַ����У��̲߳���ȫ������Ч�ʸ�(һ������)��
 *
 */

public class CommonString {
	public static void main(String[] args) {
		StringBuilder s = new StringBuilder();
		for(int i=0;i<3;i++) {
			s.append("a"+i);
		}
		System.out.println(s.toString());
		
		System.out.println(s.delete(0, 2));
		System.out.println(s.substring(1, 4));
		System.out.println(s.replace(0, 0, "a0"));
		
		StringBuffer s1 = new StringBuffer();
		for(int i=0;i<3;i++) {
			s1.append("b"+i);
		}
		System.out.println(s1.toString());
		System.out.println(s1.delete(0, 2));
		System.out.println(s1.deleteCharAt(0));
		
		CommonString cs = new CommonString();
		cs.compare();
	}
	
	
	public void compare() {    
		        /**ʹ��String�����ַ�����ƴ��*/
		        String str8 = "";
		        //������ʹ��StringBuilderƴ��, ����ÿ��ѭ����������һ��StringBuilder����
		        long num1 = Runtime.getRuntime().freeMemory();//��ȡϵͳʣ���ڴ�ռ�
		        long time1 = System.currentTimeMillis();//��ȡϵͳ�ĵ�ǰʱ��
		        for (int i = 0; i < 5000; i++) {
		            str8 = str8 + i;//�൱�ڲ�����10000������
		        }
		        long num2 = Runtime.getRuntime().freeMemory();
		        long time2 = System.currentTimeMillis();
		        System.out.println("Stringռ���ڴ� : " + (num1 - num2));
		        System.out.println("Stringռ��ʱ�� : " + (time2 - time1));
		        /**ʹ��StringBuilder�����ַ�����ƴ��*/
		        StringBuilder sb1 = new StringBuilder("");
		        long num3 = Runtime.getRuntime().freeMemory();
		        long time3 = System.currentTimeMillis();
		        for (int i = 0; i < 5000; i++) {
		            sb1.append(i);
		        }
		        long num4 = Runtime.getRuntime().freeMemory();
		        long time4 = System.currentTimeMillis();
		        System.out.println("StringBuilderռ���ڴ� : " + (num3 - num4));
		        System.out.println("StringBuilderռ��ʱ�� : " + (time4 - time3));
		    }
}
