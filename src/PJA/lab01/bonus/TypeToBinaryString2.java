package PJA.lab01.bonus;

public class TypeToBinaryString2 {
    public static void main(String[] args) {

        int i = 170;
        System.out.println("Number = " + i);

        // returns the string representation of the unsigned integer value
        // represented by the argument in binary (base 2)
        System.out.println("Binary is " + Integer.toBinaryString(i));

        // returns the number of one-bits
        System.out.println("Number of one bits = " + Integer.bitCount(i));
    }
}

/**
 *
 */
