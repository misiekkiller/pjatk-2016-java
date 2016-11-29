package PJA.lab01;

public class P2_z4to5_TypesMaxMin {
	
	public static void main(String[] args) {

//		boolean booleanMin = Boolean.MIN_VALUE;
//		boolean booleanMax = Boolean.MAX_VALUE;
		// TODO: 29/11/2016 QUESTION czy boolean to tylko podchwytliwe pytanie?

		int integerMin = Integer.MIN_VALUE;
		int integerMax = Integer.MAX_VALUE;
		int integerSize = Integer.SIZE;

		double doubleMin = Double.MIN_VALUE;
		double doubleMax = Double.MAX_VALUE;
		double doubleSize = Double.SIZE;

		char characterMin = Character.MIN_VALUE;
		char characterMax = Character.MAX_VALUE;
		char characterSize = Character.SIZE;

		byte byteMin = Byte.MIN_VALUE;
		byte byteMax = Byte.MAX_VALUE;
		byte byteSize = Byte.SIZE;

		short shortMin = Short.MIN_VALUE;
		short shortMax = Short.MAX_VALUE;
		short shortSize = Short.SIZE;

		long longMin = Long.MIN_VALUE;
		long longMax = Long.MAX_VALUE;
		long longSize = Long.SIZE;


		System.out.println("boolean range: true or false. MAX, MIN, SIZE final fields doesn't apply.");
		System.out.println("integer range: from " +
				integerMin + " to " + integerMax + ". It has " + integerSize +
				" bites (" + integerSize/8 + " bytes).");
		System.out.println("double range: from " + doubleMin + " to " + doubleMax + ". It has " + (int)doubleSize +
				" bites (" + (int)doubleSize/8 + " bytes).");
		System.out.println("character range: from " + (int)characterMin + " to " + (int)characterMax +
				". It has " + (int)characterSize + " bites (" + (int)characterSize/8 + " bytes).");
		System.out.println("byte range: from " + byteMin + " to " + byteMax + ". It has " + byteSize +
				" bites (" + byteSize/8 + " byte).");
		System.out.println("short range: from " + shortMin + " to " + shortMax + ". It has " + shortSize +
				" bites (" + shortSize/8 + " bytes).");
		System.out.println("long range: from " + longMin + " to " + longMax + ". It has " + longSize +
				" bites (" + longSize/8 + " bytes).");
	}
}

/** min-max values of the following types:
 * boolean (wartość logiczna)
 * integer (liczby całkowite)
 * double (liczby rzeczywiste)
 * character (znaki)
 **/