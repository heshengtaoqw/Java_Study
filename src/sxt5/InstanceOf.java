package sxt5;

public class InstanceOf {

	public static void main(String[] args) {
		InstanceOf io = new InstanceOf();
		//System.out.println(io instanceof InstanceOf);

		Person p = new Person();
		Students s = new Students();
		Person p1 = new Students();
		//System.out.println(p instanceof InstanceOf);
		System.out.println(p instanceof Person);
		System.out.println(p instanceof Students);
		System.out.println(p1 instanceof Person);
		System.out.println(p1 instanceof Students);
	}
}

class Person{
	int name;
	
}

class Students extends Person{
	int name;
	

}
