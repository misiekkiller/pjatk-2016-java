package VNTools;

public class ArraySort {

    /** Replaces indexOne with indexTwo.
     * @param arrayOneDim accepts an array of integers.
     * @param indexOne accepts an integer, index of value to be replaced.
     * @param indexTwo accepts an integer, index of value that replaces indexOne*/
    public static void oneDimIntTwoIndexesReplacer(int[] arrayOneDim, int indexOne, int indexTwo) {
            int tmp = arrayOneDim[indexOne];                               // tmp przechowuje aktualny element [j]
            arrayOneDim[indexOne] = arrayOneDim[indexTwo];                 // pod element [j] podkładamy mniejszy element [i]
            arrayOneDim[indexTwo] = tmp;                                   // z tmp przywracamy element [j] na miejsce zwolnione przez element [i]
    }

    /** Sorts the Array from the minimum value to the maximum value
     * @param arrayOneDim accepts an integer, one-demensional array.*/
    public static void oneDimIntSortMinToMax(int[] arrayOneDim) {
        for (int i = 0; i < arrayOneDim.length-1; i++){
            int minimumValueIndex = i;
            for (int j = i+1; j < arrayOneDim.length; j++) {
                if (arrayOneDim[j] < arrayOneDim[minimumValueIndex])
                    minimumValueIndex = j;
            }
            // REPLACEMENT MECHANISM
            int tmp = arrayOneDim[i];
            arrayOneDim[i] = arrayOneDim[minimumValueIndex];
            arrayOneDim[minimumValueIndex] = tmp;
        }
    }

    /** Sorts the Array from the maximum value to the minimum value
     * @param arrayOneDim accepts an integer, one-demensional array.*/
    public static void oneDimIntSortMaxToMin(int[] arrayOneDim) {
        for (int i = 0; i < arrayOneDim.length-1; i++){
            int minimumValueIndex = i;
            for (int j = i+1; j < arrayOneDim.length; j++) {
                if (arrayOneDim[j] > arrayOneDim[minimumValueIndex])
                    minimumValueIndex = j;
            }
            // REPLACEMENT MECHANISM
            int tmp = arrayOneDim[i];
            arrayOneDim[i] = arrayOneDim[minimumValueIndex];
            arrayOneDim[minimumValueIndex] = tmp;
        }
    }

}
