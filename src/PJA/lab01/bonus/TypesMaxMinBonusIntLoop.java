package PJA.lab01.bonus;

public class TypesMaxMinBonusIntLoop {
    public static void main(String[] args) {

        // Loop over all positive integers.
        for (int value = 0; value < Integer.MAX_VALUE; value++) {
            // ... Do something important.
        }

        // Loop over all positive integers in reverse.
        for (int value = Integer.MAX_VALUE - 1; value >= 0; value--) {
            // ... Do another important thing.
        }

        System.out.println("DONE");
    }
}

/**
 * To loop through the entire range of positive ints, we can use a for-loop and stop at MAX_VALUE.
 * Caution: We must use "less than" Integer.MAX_VALUE not <= because otherwise the loop index will overflow.
 */

