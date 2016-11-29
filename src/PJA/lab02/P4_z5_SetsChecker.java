package PJA.lab02;

import java.util.Scanner;
public class P4_z5_SetsChecker {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Wprowadź zmienną wrt: ");
		double wrt = sc.nextDouble();
		boolean czyWpadlo = false;
		
		if ((wrt > -15 && wrt <= -10) || (wrt > -5 && wrt < 0) || (wrt > 5 && wrt < 10)) {
			if ((wrt <= -13) || (wrt > -8 && wrt <= -3)) {
				if (wrt >= -4) {
					czyWpadlo = true;
				} 
			}
		} if (czyWpadlo) {
			System.out.println("Wartosc nalezy do czesci wspolnej zbiorow ABC.");
		} else {
			System.out.println("Wartosc NIE nalezy do czesci wspolnej zbiorow ABC.");
		}
	}
}

 // ifami znalezc (3 ify i jeden and) 
 
 // if ((wrt > -15 && wrt <= -10)) {}
 
 // zamiast 3 elsow jeden boolean czyWpadlo = false i czwarty if jak wpadlo to ok jak nie to bad.