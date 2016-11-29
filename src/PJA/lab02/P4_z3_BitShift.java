package PJA.lab02;

public class P4_z3_BitShift {
	
	public static void main(String[] args) {
		
		int colorRGB = 1_651_300;
		System.out.println("B: " + (colorRGB & 255));
		
		//00000000 00011001 00110010 01100100		co to robi? to robi wyzerowanie pozostałych oktetów, ktorych nie liczymy w tym kroku.
		//00000000 00000000 00000000 11111111 AND
		//00000000 00000000 00000000 01100100
		
		System.out.println("G: " + ((colorRGB >> 8) & 0xff));
		
		//00000000 00000000 00011001 00110010
		//00000000 00000000 00000000 11111111 AND
		
		System.out.println("R: " + (colorRGB >> 16));
		
		//00000000 00000000 00000000 00011001
		//00000000 00000000 00000000 11111111 AND

	}
}

 // google "decimal to binary" converter.
 // oktet to 8 bitow.
 // 16513100 dziesietne to (000)11001 00110010 01100100 binarnie.
 // operacja binarna AND i OR.
 // przesuniecia + AND.
 // FFF 16 do2, 16 do1, 16 do0.
 // operator & mowi Javie zeby color i 255 konwertowac w locie i porownywac w binary.

 /**  0xff is the hexadecimal number FF which has a integer value of 255.
  * 	And the binary representation of FF is 00000000000000000000000011111111 (under the 32-bit integer).
  * 	The & operator performs a bitwise AND operation.
  * 	a & b will give you an integer with a bit pattern that has a 0 in all positions where b has a 0,
  * 	while in all positions where b has a 1, the corresponding bit value froma is used (
  * 	this also goes the other way around). For example, the bitwise AND of 10110111 and00001101 is 00000101.
  *
  *   In a nutshell, “& 0xff” effectively masks the variable so it leaves only the value in the last 8 bits,
  * 	and ignores all the rest of the bits.
  */