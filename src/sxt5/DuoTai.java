package sxt5;

public class DuoTai {
	public static void main(String[] args) {
		DuoTai dt = new DuoTai();
		Animal a = new Dog();
		Dog d = new Dog();
		dt.shout(a);
		dt.shout(d);
	}
	
	public void shout(Animal a) {
		a.shout();
	}
}

class Animal{
	public void shout() {
		System.out.println("Animal is shouting");
	}
}

class Dog extends Animal{
	public void shout() {
		System.out.println("Dog is shouting ");
	}
}