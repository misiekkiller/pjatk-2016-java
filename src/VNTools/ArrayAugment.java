package VNTools;

public class ArrayAugment {

// ---------- ONE-DIMENSIONAL ARRAYS ----------
// ----- CREATE -----
    /** Creates an integers array with a random length and random values.
     * @param minLength accepts an integer that sets the lower limit for the arrays length.
     * @param maxLength accepts an integer that sets the upper limit for the arrays length.
     * @param minValue accepts an integer that sets the lower limit for the arrays values.
     * @param maxValue accepts an integer that sets the upper limit for the arrays values. */
    public static int[] oneDimIntCreateRandom(int minLength, int maxLength, int minValue, int maxValue) {
        // (int)(Math.random() * (max - min + 1) + min)

        int arrayLength = (int)(Math.random() * (maxLength - minLength + 1) + minLength);
        int[] array = new int[arrayLength];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * (maxValue - minValue + 1) + minValue);
        }
        return array;
    }

    /** Creates an doubles array with a random length and random values.
     * @param minLength accepts an integer that sets the lower limit for the arrays length.
     * @param maxLength accepts an integer that sets the upper limit for the arrays length.
     * @param minValue accepts a double that sets the lower limit for the arrays values.
     * @param maxValue accepts a double that sets the upper limit for the arrays values. */
    public static double[] oneDimDoubleCreateRandom(int minLength, int maxLength, double minValue, double maxValue) {
        // (int)(Math.random() * (max - min + 1) + min)

        int arrayLength = (int)(Math.random() * (maxLength - minLength + 1) + minLength);
        double[] array = new double[arrayLength];

        for (int i = 0; i < array.length; i++) {
            array[i] = (Math.random() * (maxValue - minValue + 1) + minValue);
        }
        return array;
    }

// ----- DESTROY -----
    /** TODO nie działa destroy elements. */
    public static int[] oneDimDestroyElements(int[] arrayOneDim, int... indexes) {
        /**stworzyć nową tablicę o length-noi*/
        int[] newArray = new int[arrayOneDim.length - indexes.length];  // 4-2 = 2

        /**uzskać zawartość arrayOneDim bez wartości z indexes*/
        // jeśli wartość z arraya nie równa się jakiejkolwiek wartości z array[indexes] -> pass
        for (int i : arrayOneDim) {
            for (int j : indexes) {
                if (arrayOneDim[i] != arrayOneDim[indexes[j]]) {
                    newArray[i] = arrayOneDim[i];
                }
            }
        }
        return newArray;
    }
}

