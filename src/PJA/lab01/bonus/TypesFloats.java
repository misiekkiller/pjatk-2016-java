package PJA.lab01.bonus;

public class TypesFloats {
    public static void main(String[] args) {

        // Use a float variable.
        // ... Uses a float cast.
        float number = (float) 10.5;
        System.out.println(number);

        // This syntax also works.
        float number2 = 10.75f;
        System.out.println(number2);

        // A float is 4 bytes.
        System.out.println(Float.BYTES);
    }
}

/**
 * Float. This is a floating-point, 4-byte number.
 * A float is like a double but only has 4 bytes (a double has twice as many bytes).
 *
 * With this type, we can store numbers with a decimal place.
 * A float can be cast to a double without any special syntax.
 * !! But we must be careful when converting from a double to a float !!
 *
 * Float examples. Here are two syntax forms for creating a float value.
 * We can use (float) to specify the type. And the lowercase "f" specifies a float literal.
 *
 * Bytes: In Java we find the handy "BYTES" constants. These tell us exactly how many bytes are used by a type.
 */