package Study_6_classRelation;

public class Pig {
	// Ù–‘
	private String name;
	private int weight = 20;
	
	Pig(){}
	
	Pig(String name){
		this.name = name;
	}
	
	public void growUp(int month) {
		for(int i=1;i<=month;i++)
		{
			this.weight = weight*2;
		}
	}
	
	public int getPigWeight() {
		return this.weight;
	}
	
	public String getPigName() {
		return this.name;
	}
	
	public void beKilled() {
		System.out.println("pig is louding...");
	}
}
