package PJA.lab01.bonus;

public class TypeToBinaryString1 {
    public static void main(String[] args) {

        // Convert 1 to 10 to binary Strings.
        for (int i = 0; i < 10; i++) {
            String result = Integer.toBinaryString(i);
            System.out.println(result);
        }
    }
}

/**
 * This method returns a String representation of an integer's bits.
 * The leading zeros are removed (you can mentally add them on the left of the output).
 *
 * We see how the bits change in the numbers 0 through 9.
 * ToBinaryString helps us visualize bitwise operations.
 */
