import java.util.Scanner;

public class Temp {
	
	public static void main(String[] args) {
		String[][] user = {{"张无忌","1845"},{"詹姆斯","2012"},{"杜兰特","2018"},{"张飞","168"}};
		
		Scanner input = new Scanner(System.in);
		System.out.println("请输入用户名:");
		String username = input.nextLine();
		System.out.println("请输入密码:");
		String pwd = input.nextLine();
		boolean flag=false;

		for(int i=0;i<=user.length-1;i++) {
				int j=0;
				if(user[i][j].equals(username)) {
					if(user[i][j+1].equals(pwd)) {
						System.out.println("用户名密码正确");
						flag=true;
					}
					break;
				}
		}
	
		if(!flag) {
			System.out.println("DevBranch");
		}
		
	}
	                                     
}
