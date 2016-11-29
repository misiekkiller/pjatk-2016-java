package PJA.lab02;
import java.util.Scanner;

public class P4_z4_SetsCheckerPro {

	public static void main(String[] args) {

// WPROWADZENIE WARTOSCI
		Scanner skaner = new Scanner(System.in);
		System.out.println("podaj wartość zmiennej x: ");
		double x = skaner.nextDouble();

// LOKALIZATOR
		String identifySet = "Zmienna x należy do zbioru ";

		if ((x > -15 && x <= -10) || (x > -5 && x < 0) || (x > 5 && x < 10)) {
			identifySet += "A";
		}
		if ((x <= -13) || (x > -8 && x <= -3)) {
			identifySet += "B";
		}
		if (x >= -4){
			identifySet += "C";
		}

		System.out.println(identifySet);
	}
}

// POLECENIE
/** A = (-15, -10] + (-5, 0) + (5, 10)
 	B = (-1, -13] + (-8, -3]
 	C = [-4, 1)
 	The notation [a, c) is used to indicate an interval from a to c that is inclusive of a, but exclusive of c.

 	Polecenie: napisz program, który jednoznacznie lokalizuje x w danym zbiorze.

 	A: ((x > -15 && x <= -10) || (x > -5 && x < 0) || (x > 5 && x < 10))
 	B: ((x <= -13) || (x > -8 && x <= -3))
 	C: (x >= -4)
 */