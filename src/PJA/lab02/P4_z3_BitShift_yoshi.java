package PJA.lab02;

public class P4_z3_BitShift_yoshi {

	public static void main(String[] args) {

		int rgb = 1_651_300;
		System.out.println("Liczba 1651300 zapisana w systemie binarnym to: " + Integer.toBinaryString(rgb));

		int red = (rgb >> 16);
		int green = (rgb >> 8) & 0xFF;
		int blue = rgb & 255; //rgb & 0xFF; dałoby taki sam wynik (0xFF w systemie szesnastkowym odpowiada liczbie 255 w systemie dziesiętnym)
		System.out.println("------------------------------------------------------------");
		System.out.println("Wyliczanie wartości red krok po kroku:");

		System.out.println("Zapis binarny:\t\t" + Integer.toBinaryString(rgb) + " >> 16 = " + Integer.toBinaryString(rgb >> 16));
		System.out.println("Zapis dziesiętny:\t" + (rgb) + " >> 16 = " + (rgb >> 16));

		System.out.println("------------------------------------------------------------");

		System.out.println("Wyliczanie wartości green krok po kroku:");

		System.out.println("Zapis binarny:\t\t(" + Integer.toBinaryString(rgb) + " >> 8) & "
				+ Integer.toBinaryString(0xFF) + " = "
				+ Integer.toBinaryString(rgb >> 8) + " & " + Integer.toBinaryString(0xFF) + " = "
				+ Integer.toBinaryString((rgb >> 8) & 0xFF));
		System.out.println("Zapis dziesiętny:\t(" + (rgb) + " >> 8) & " + (0xFF) + " = "
				+ (rgb >> 8) + " & " + (0xFF) + " = " + ((rgb >> 8) & 0xFF));
		System.out.println("------------------------------------------------------------");

		System.out.println("Wyliczanie wartości blue krok po kroku:");

		System.out.println("Zapis binarny:\t\t" + Integer.toBinaryString(rgb) + " & " + Integer.toBinaryString(0xFF) + " = "
				+ Integer.toBinaryString((rgb) & 0xFF));
		System.out.println("Zapis dziesiętny:\t" + (rgb) + " & " + (0xFF) + " = " + (rgb & 0xFF));
		System.out.println("------------------------------------------------------------");

		System.out.println("R: " + red);
		System.out.println("G: " + green);
		System.out.println("B: " + blue);
	}

}