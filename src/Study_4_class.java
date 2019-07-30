public class Study_4_class {
	public static void main(String[] args) {
		
		Study_4_1_class s4 = new Study_4_1_class();
		s4.a = 4;
		s4.b = 5;
		
		Study_4_1_class s5 = s4;
		s5.a = 9;
		s5.b = 10;
		
		System.out.println(s4.a + " " + s4.b);//ÄÚ´æÍ¼
		System.out.println(s5.a + " " + s4.b);

	}
	
}
 