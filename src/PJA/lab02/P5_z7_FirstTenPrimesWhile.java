package PJA.lab02;
import java.util.Scanner;

public class P5_z7_FirstTenPrimesWhile {

	public static void main(String[] args) {

		Scanner skaner = new Scanner(System.in);
		System.out.println("Wprowadź ilość liczb pierwszych do wyświetlenia:");
		int num = skaner.nextInt();

		int licznik = 0;
		int liczba = 2;

		while (licznik != num) {
			int x = 2;
			while (liczba % x != 0) {
				x++;
			}
			if (liczba == x) {
				System.out.println(liczba);
				licznik++;
			}
			liczba++;
		}

	}
}

/**
		 Utwórz program wyliczający pierwsze 10 liczb pierwszych.
		 Najlepiej na podstawie poniższego schematu blokowego.

 		 Liczba pierwsza – liczba naturalna większa od 1,
 		 która ma dokładnie dwa dzielniki naturalne: jedynkę i siebie samą.

 		 2, 3, 5, 7, 11, 13, 17, 19, 23, 29
*/