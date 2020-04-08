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
		System.out.println("我能拍电影");
	}
	public void playTV() {
		System.out.println("我能拍电视剧");
	}
	public void sing() {
		System.out.println("我能唱歌");
	}
	
	public void introduce() {
		System.out.println("我是" + name);
	}
}

public class TestActress {
	public static void main(String[] args) {
		Actress a = new Actress("杨幂");
		a.introduce();
		a.playfilm();
		a.playTV();
		a.sing();
	}
	
}
