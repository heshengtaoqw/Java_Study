
public class Study_6_extends_Animal {
	private String leg;
	private String eyes;
	public String mouth;
	public String nose;
	
	
	public void eat() {
		this.run();//会调用当前对象的run方法，而不是当前类的run方法
	}
	
	public void run()
	{
		System.out.println("this is a Animal run");
	}
}
