package PJA.lab02;

public class P4_z1to2_MathSqrt {
	
	public static void main(String[] args) {
		
		double sqTwo = Math.sqrt(2);											// Math.sqrt(double a)
		System.out.println("Math.sqrt(2): " + sqTwo);
		double sqTwoPow = Math.pow(sqTwo, 2); 									// Math.pow (double a, double b)
		System.out.println("Math.pow(sqTwo, 2): " + sqTwoPow);
		
		double result = sqTwoPow - 2;
		System.out.println("sqTwoPow - 2: " + result);

		System.out.println();

		if (result == 1.1578739678741186722221088213213e-37) {
			System.out.println("Wynik jest prawidłowy");
		} else {
			System.out.println("Wynik jest nieprawidłowy");

		}
	}
}


// Zadanie 1: Jaki będzie wynik operacji matematycznej (kwadratowy√2)do kwadratu − 2?
// Zadanie 2: