package VNTools;

public class ArraySearch {

// ---------- ONE-DIMENSIONAL ARRAYS ----------
// ----- INTEGER ARRAYS: MIN/MAX VALUES -----
    /** @param arrayOneDim accepts an integer, one-dimensional array.
     * @return MINIMUM VALUE OF THE ARRAY.*/
    public static int oneDimIntMinVal(int[] arrayOneDim) {

        int minimumValue = 0;
        if (arrayOneDim.length == 0) {
            System.out.println("Array is empty.");
        }
        else {
            minimumValue = arrayOneDim[0];
            if (arrayOneDim.length > 1) {
                for (int i = 1; i < arrayOneDim.length; i++) {
                    if (arrayOneDim[i] < minimumValue) {
                        minimumValue = arrayOneDim[i];
                    }
                }
            } else {
                minimumValue = arrayOneDim[0];
            }
        }
        return minimumValue;
    }

    /** @param arrayOneDim accepts an integer, one-dimensional array.
     * @return MAXIMUM VALUE OF THE ARRAY.*/
    public static int oneDimIntMaxVal(int[] arrayOneDim) {

        int minimumValue = 0;
        if (arrayOneDim.length == 0) {
            System.out.println("Array is empty.");
        } else {
            minimumValue = arrayOneDim[0];
            if (arrayOneDim.length > 1) {
                for (int i = 1; i < arrayOneDim.length; i++) {
                    if (arrayOneDim[i] > minimumValue) {
                        minimumValue = arrayOneDim[i];
                    }
                }
            } else {
                minimumValue = arrayOneDim[0];
            }
        }
        return minimumValue;
    }

    /** Don't use array[arrayIntMinValIndex(array)] if the array is empty.
     * @param arrayOneDim accepts an integer, one-dimensional array.
     * @return INDEX OF THE MINIMUM VALUE OF THE ARRAY.*/
    public static int oneDimIntMinValIndex(int[] arrayOneDim) {
        int minimumValueIndex = 0;
        if (arrayOneDim.length == 0) {
            System.out.println("Array is empty.");
        } else {
            if (arrayOneDim.length > 1) {
                for (int i = 1; i < arrayOneDim.length; i++) {
                    if (arrayOneDim[i] < arrayOneDim[minimumValueIndex]) {
                        minimumValueIndex = i;
                    }
                }
            } else {
                minimumValueIndex = 0;
            }
        }
            return minimumValueIndex;
    }

    /** Don't use array[arrayIntMaxValIndex(array)] if the array is empty.
     * @param arrayOneDim accepts an integer, one-dimensional array.
     * @return INDEX OF THE MAXIMUM VALUE OF THE ARRAY.*/
    public static int oneDimIntMaxValIndex(int[] arrayOneDim) {
        int minimumValueIndex = 0;
        if (arrayOneDim.length == 0) {
            System.out.println("Array is empty.");
        } else {
            if (arrayOneDim.length > 1) {
                for (int i = 1; i < arrayOneDim.length; i++) {
                    if (arrayOneDim[i] > arrayOneDim[minimumValueIndex]) {
                        minimumValueIndex = i;
                    }
                }
            } else {
                minimumValueIndex = 0;
            }
        }
        return minimumValueIndex;
    }


// ----- DOUBLE ARRAYS: MIN/MAX VALUES-----
    /** @param arrayOneDim accepts a double, one-dimensional array.
     * @return MINIMUM VALUE OF THE ARRAY.*/
    public static double oneDimDoubleMinVal(double[] arrayOneDim) {

        double minimumValue = 0;
        if (arrayOneDim.length == 0) {
            System.out.println("Array is empty.");
        } else {
            minimumValue = arrayOneDim[0];
            if (arrayOneDim.length > 1) {
                for (int i = 1; i < arrayOneDim.length; i++) {
                    if (arrayOneDim[i] < minimumValue) {
                        minimumValue = arrayOneDim[i];
                    }
                }
            } else {
                minimumValue = arrayOneDim[0];
            }
        }
        return minimumValue;
    }

    /** @param arrayOneDim accepts a double, one-dimensional array.
     * @return MAXIMUM VALUE OF THE ARRAY.*/
    public static double oneDimDoubleMaxVal(double[] arrayOneDim) {

        double minimumValue = 0;
        if (arrayOneDim.length == 0) {
            System.out.println("Array is empty.");
        } else {
            minimumValue = arrayOneDim[0];
            if (arrayOneDim.length > 1) {
                for (int i = 1; i < arrayOneDim.length; i++) {
                    if (arrayOneDim[i] > minimumValue) {
                        minimumValue = arrayOneDim[i];
                    }
                }
            } else {
                minimumValue = arrayOneDim[0];
            }
        }
        return minimumValue;
    }

    /** Don't use array[arrayDoubleMinValIndex(array)] if the array is empty.
     * @param arrayOneDim accepts a double, one-dimensional array.
     * @return INDEX OF THE MINIMUM VALUE OF THE ARRAY.*/
    public static int oneDimDoubleMinValIndex(double[] arrayOneDim) {
        int minimumValueIndex = 0;
        if (arrayOneDim.length == 0) {
            System.out.println("Array is empty.");
        } else {
            if (arrayOneDim.length > 1) {
                for (int i = 1; i < arrayOneDim.length; i++) {
                    if (arrayOneDim[i] < arrayOneDim[minimumValueIndex]) {
                        minimumValueIndex = i;
                    }
                }
            } else {
                minimumValueIndex = 0;
            }
        }
        return minimumValueIndex;
    }

    /** Don't use array[arrayDoubleMaxValIndex(array)] if the array is empty.
     * @param arrayOneDim accepts a double, one-dimensional array.
     * @return INDEX OF THE MAXIMUM VALUE OF THE ARRAY.*/
    public static int oneDimDoubleMaxValIndex(double[] arrayOneDim) {
        int minimumValueIndex = 0;
        if (arrayOneDim.length == 0) {
            System.out.println("Array is empty.");
        } else {
            if (arrayOneDim.length > 1) {
                for (int i = 1; i < arrayOneDim.length; i++) {
                    if (arrayOneDim[i] > arrayOneDim[minimumValueIndex]) {
                        minimumValueIndex = i;
                    }
                }
            } else {
                minimumValueIndex = 0;
            }
        }
        return minimumValueIndex;
    }

    // ----- TODO: ADD FIND IN ARRAY, Check how many times number occurs in the array,

}
