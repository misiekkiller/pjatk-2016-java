package PJA.lab01.bonus;

public class TypesByte {
    public static void main(String[] args) {

        byte value = 100;
        System.out.println(value);

        // Try to cast a large number to a byte.
        // ... The result may be unexpected.
        value = (byte) 9999;
        System.out.println(value);
    }
}

/**
 * The byte uses 8 bits of storage.
 * In Java the byte is a signed number, so it can be negative or positive.
 * We can cast larger values to bytes, but they will overflow.
 */