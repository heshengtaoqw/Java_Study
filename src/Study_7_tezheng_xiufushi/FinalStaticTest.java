package Study_7_tezheng_xiufushi;

public class FinalStaticTest {
	
	private final static int MANAGER = 0;
	private final static int VIP = 1;
	private final static int NORMAL = 2;
	
	public static void main(String[] args) {
		FinalStaticTest fst = new FinalStaticTest();
		fst.buyBook(100, 1);
	}
	
	public void buyBook(int price,int identity) {
		switch(identity) {
			case FinalStaticTest.MANAGER:
				System.out.println("您是管理员,消费金额=" + price*0.5);
				break;
			case FinalStaticTest.VIP:
				System.out.println("您是VIP,消费金额=" + price*0.8);
				break;
			case FinalStaticTest.NORMAL:
				System.out.println("您是普通会员，消费金额=" + price);
				break;
			default:
				System.out.println("输入错误");
		}
			
	}
}
