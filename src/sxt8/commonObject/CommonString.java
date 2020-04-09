package sxt8.commonObject;

/*
 * StringBuilder和StringBuffer类是对原字符串本身操作的，可以对字符串进行修改而不产生副本拷贝或者产生少量的副本。因此可以在循环中使用。
 
 *	  1. String：不可变字符序列。
      2. StringBuffer：可变字符序列，并且线程安全，但是效率低。
      3. StringBuilder：可变字符序列，线程不安全，但是效率高(一般用它)。
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
		        /**使用String进行字符串的拼接*/
		        String str8 = "";
		        //本质上使用StringBuilder拼接, 但是每次循环都会生成一个StringBuilder对象
		        long num1 = Runtime.getRuntime().freeMemory();//获取系统剩余内存空间
		        long time1 = System.currentTimeMillis();//获取系统的当前时间
		        for (int i = 0; i < 5000; i++) {
		            str8 = str8 + i;//相当于产生了10000个对象
		        }
		        long num2 = Runtime.getRuntime().freeMemory();
		        long time2 = System.currentTimeMillis();
		        System.out.println("String占用内存 : " + (num1 - num2));
		        System.out.println("String占用时间 : " + (time2 - time1));
		        /**使用StringBuilder进行字符串的拼接*/
		        StringBuilder sb1 = new StringBuilder("");
		        long num3 = Runtime.getRuntime().freeMemory();
		        long time3 = System.currentTimeMillis();
		        for (int i = 0; i < 5000; i++) {
		            sb1.append(i);
		        }
		        long num4 = Runtime.getRuntime().freeMemory();
		        long time4 = System.currentTimeMillis();
		        System.out.println("StringBuilder占用内存 : " + (num3 - num4));
		        System.out.println("StringBuilder占用时间 : " + (time4 - time3));
		    }
}
