package sxt5.practise;


interface playfilm{
	public abstract void playfilm();
}

interface playTV{
	public abstract void playTV();
}

interface sing{
	public abstract void sing();
}

class Actress implements playfilm,playTV,sing{
	public String name;
	
	Actress(String name){
		this.name = name;
	}
	
	public void playfilm() {
		System.out.println("�����ĵ�Ӱ");
	}
	public void playTV() {
		System.out.println("�����ĵ��Ӿ�");
	}
	public void sing() {
		System.out.println("���ܳ���");
	}
	
	public void introduce() {
		System.out.println("����" + name);
	}
}

public class TestActress {
	public static void main(String[] args) {
		Actress a = new Actress("����");
		a.introduce();
		a.playfilm();
		a.playTV();
		a.sing();
	}
	
}
