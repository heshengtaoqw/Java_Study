import java.util.Scanner;

public class Temp {
	
	public static void main(String[] args) {
		String[][] user = {{"���޼�","1845"},{"ղķ˹","2012"},{"������","2018"},{"�ŷ�","168"}};
		
		Scanner input = new Scanner(System.in);
		System.out.println("�������û���:");
		String username = input.nextLine();
		System.out.println("����������:");
		String pwd = input.nextLine();
		boolean flag=false;

		for(int i=0;i<=user.length-1;i++) {
				int j=0;
				if(user[i][j].equals(username)) {
					if(user[i][j+1].equals(pwd)) {
						System.out.println("�û���������ȷ");
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
