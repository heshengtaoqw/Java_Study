package sxt7.array;


class Man{
	private String name;
	private int age;
	Man(String name,int age){
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
}

public class ArrayDefinition {
	public static void main(String[] args) {
		int[] s = new int[10];
		int[] s1 = {1,2,3};
		Man[] mans = new Man[2];
		
		Man man1 = new Man("jack",10);
		Man man2 = new Man("jerry",12);

		mans[0] = man1;
		mans[1] = man2;
		
		System.out.println(mans[0].getAge()+ "  " +mans[0].getName());
		System.out.println(mans[1].getAge()+ "  " +mans[1].getName());

	}
}
