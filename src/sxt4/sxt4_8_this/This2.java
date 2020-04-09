package sxt4.sxt4_8_this;;

public class This2 {

	public static void main(String[] args) {
		This t = new This();
		t.setAge(10);
		t.setName("jack");
		t.setSex("ÄÐ");
		
		System.out.println(t.getName() + "," + t.getSex() + "," + t.getAge() + "Ëê" );
	}
}
