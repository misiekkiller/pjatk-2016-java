/** TODO: QUESTION [DONE] po co mam dwa razy deklarować np. byte? Skoro deklaruje typ zmiennej, po co deklarować typ sumy dwóch zmiennych?*/
package PJA.lab01;

public class P3_z2_TypesAddition2 {
	
	public static void main(String[] args) {
		
		char varChar = 145;
		int varInt = 200;
		float varFloat = 3.14f;
		double varDouble = 3.456d;
		byte varByte = 1;
		
		char  sumCharInt = (char)(varChar + varInt);
		int   sumIntChar = varInt + varChar;
		float sumFloatDouble = (float)(varFloat + varDouble);
		byte  sumByteInt = (byte)(varByte + varInt);		// po co mam dwa razy deklarować byte?
		// odpowiedź brzmi nie da się, bo ucina te bajty, byte + int = int
		
		System.out.println(sumCharInt);			// char wymuszony
		System.out.println(sumIntChar);			// int
		System.out.println(sumFloatDouble);		// float wymuszony
		System.out.println(sumByteInt);			// byte wymuszony
	}
}

/**
 Jaki bedzie rezultat operacji:
 przypisania do zmiennej typu char sumy zmiennych typu char i int,
 przypisania do zmiennej typu int sumy zmiennych typu int i typu char,
 przypisania do zmiennej typu float sumy zmiennych typu float i typu double,
 przypisania do zmiennej typu byte sumy zmiennych typu byte i typu int.
 Zastosuj konwersje tylko gdy bedzie to niezbedne.
 */