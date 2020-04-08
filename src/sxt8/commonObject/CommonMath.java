package sxt8.commonObject;

import java.util.Random;

public class CommonMath {
	public static void main(String[] args) {
		System.out.println(Math.round(3.4));
		System.out.println(Math.round(3.5));
		System.out.println(Math.abs(-5.6));
		System.out.println(Math.sqrt(4));
		System.out.println(Math.random());
		System.out.println(Math.PI);
		System.out.println(Math.pow(3, 2));

		Random rand = new Random();
		System.out.println(String.format("%.2f", 10*rand.nextDouble()));
		System.out.println(rand.nextFloat());
	}
}
