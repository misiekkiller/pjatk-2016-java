// TODO: QUESTION [DONE] byte nie bo 2 byty moga rozwalic jeden, char nie bo ma MIN.VALUE 0, ale dalczego short nie wchodzi? 127 vs 32000.
package PJA.lab01;

public class P3_z5_TypesAddition3 {

	public static void main(String[] args){

		byte x = 5;
		byte y = 10;

//		byte zByte = x + y;
//		short zShort = x + y;  // dwa bajty to int !
		int zInt = x + y;
		long zLong = x + y;
		float zFloat = x + y;
//		char zChar = x + y;

	}
}

// Sprawdź dla jakich typów zmienna z będzie deklarowana poprawnie (błędne linie ywkomentuj).