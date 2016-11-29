package PJA.lab01.bonus;

public class TypesLong {
    public static void main(String[] args) {

        // This number is too long to be an int, but it fits in a long.
        String value = "100000000000000000";
        long result = Long.parseLong(value);
        System.out.println(result);
    }
}

/**
 * This is an 8-byte integral number type, twice the size of an int.
 * This program creates a long from a value that cannot be stored in an int - it is too large.
 */