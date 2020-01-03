package Study_6_practise_1;

public class ComputerRoom {

	private Computer[] computer = new Computer[5];
	
	
	ComputerRoom() {
		this.init();
	}
	
	public void init() {
		for(int i=0;i<=4;i++) {
			computer[i] = new Computer("lenuvo",i);
		}
	}

	
	public void studentIn(Student s) {
		System.out.println(s.getName() + " walk into room");
		for(int i=0;i<computer.length;i++) {
			boolean computerStatus = computer[i].isUsed();
			if(!computerStatus) {
				s.useComputer(computer[i]);
				break;
			}
		}
	}
	
}
