package sxt5.practise;

class Instrument {
	public void makeSound() {};
}

class Piano extends Instrument{
	public void makeSound() {
		System.out.println("Piano is making sound...");
	}
}

class Erhu extends Instrument{
	public void makeSound() {
		System.out.println("Erhu is making sound...");
	}
}

class Musician{
	public void playInstrument(Instrument i) {
		i.makeSound();
	}
}

public class TestInstrument{
	public static void main(String[] args) {
		Musician m = new Musician();
		Erhu e = new Erhu();
		m.playInstrument(e);	
	}
}