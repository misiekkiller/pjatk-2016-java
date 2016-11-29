package PJA.lab01.bonus;

public class TypesShort {
    public static void main(String[] args) {

        // Use a short local variable type.
        short number = 10;
        System.out.println(number);

        // Short has less range than int.
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
    }
}

/**
 * This is a two-byte integral type.
 * It has a sign bit, so it supports negative and positive numbers.
 * We use short to save memory, and to improve compatibility with existing software.
 */
