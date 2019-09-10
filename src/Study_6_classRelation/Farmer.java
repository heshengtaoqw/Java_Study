package Study_classRelation;

public class Farmer {

	
	public Pig feedPig(int month) {
		Pig pig = new Pig("xiaohua");
		pig.growUp(month);
		return pig;
	}
}
