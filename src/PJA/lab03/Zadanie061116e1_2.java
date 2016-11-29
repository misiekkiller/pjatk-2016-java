package PJA.lab03;

import java.util.Random;

public class Zadanie061116e1_2 {

	public static void main(String[] args) {

//	Zadanie 1
		
		
		int[] tab = new int[10];

		Random random = new Random();

		for (int i = 0; i < tab.length; i++) {
			tab[i] = random.nextInt(2);
			System.out.print(tab[i] + " ");
		}

//	Zadanie 2
			
		int zeroCount = 0;	
		int oneCount = 0;
		
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == 0) {
				zeroCount++;
			} else {
				oneCount++;
			}
		}
		
			System.out.println("");
			System.out.println("Liczba jedynek: " + oneCount);
			System.out.println("Liczba zer: " + zeroCount );
			
	}
}

// ECLIPSE:
// main
// sout -> Ctrl + Space
// Ctrl + F11 (uruchomienie)
// Alt + Shift + R (zmiana nazwy zmiennej we wszystkich instancajch)
// Ctrl + Alt + Down (duplicate line)
// Ctrl + Shift + F (formatowanie kodu)