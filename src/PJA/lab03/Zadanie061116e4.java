package PJA.lab03;

import java.util.Random;

public class Zadanie061116e4 {

	public static void main(String[] args) {
		
		double[] tab = new double[10];
		
		Random random = new Random();
		
		for (int i = 0; i < tab.length; i++) {
			tab[i] = random.nextDouble()*10; 
			System.out.println(tab[i]);
		}
		System.out.println();
		
		for (int i = 0; i < tab.length; i+=2) {
			System.out.println(i + ": " + tab[i]);
		}
		System.out.println();
		
		for (int i = 0; i < tab.length; i++) {
			int intValue = (int)tab[i];
			if (intValue % 2 != 0) {
				System.out.println(intValue);
			}
		}
		
	}
		
}

// WTF?????