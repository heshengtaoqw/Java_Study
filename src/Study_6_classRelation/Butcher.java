package Study_classRelation;

public class Butcher {
	//����
	
	//����
	public void killPig(Pig pig) {
		
		int thisPigWeight = pig.getPigWeight();
		String name = pig.getPigName();
		System.out.println(thisPigWeight);
		pig.beKilled();
	}
}
