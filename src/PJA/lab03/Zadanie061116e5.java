package PJA.lab03;

public class Zadanie061116e5 {

	public static void main(String[] args) {

		int tab[] = { 
				1, 0, 0, 
				0, 2, 0, 
				0, 0, 3 };

// MECHANIZM PIERWSZY
		int counter = 1;

		for (int i = 0; i < tab.length; i++) {
			if (i % 3 == 0) {
				System.out.print(counter + "\t");
			}

			System.out.print(tab[i] + " ");

			if (i % 3 == 2) {
				System.out.println(); // lamie
				counter++;
			}
		}
		
		System.out.println();

// MECHANIZM DRUGI
		counter = 1;
		
		for (int i = tab.length - 1; i > 0; i-=3) {
			System.out.print(counter + "\t");
			for (int j =  (i-2); j <= i; j++) {
				System.out.print(tab[j] + " ");
				if (j % 3 == 2) {
					System.out.println();
					counter++;
				}
			}
		}

	}
}

// lamac po indeksach 2, 5 , 8.
// drugi case na jednym czy 2 for'ach?