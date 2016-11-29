package VNTools;

public class ArrayShow {

// ---------- ONE-DIMENSIONAL ARRAYS ---------- //
    /** Prints the one-demensional array of INTEGERS in one line.
     * @param arrayOneDim accepts an integer, one-dimensional array.
     * @param elementsSeparator "" for solid number, ", " for commas.
     * @param ending "" for nothing, "." for dot at the end of array.*/
    public static void oneDimIntPrintValues(int[] arrayOneDim, String elementsSeparator, String ending) {
        for (int i = 0; i < arrayOneDim.length; i++) {
            if (i > 0) {
                System.out.print(elementsSeparator);
            }
            System.out.print(arrayOneDim[i]);
        }
        System.out.print(ending);
    }
// TODO: add two parameters

    /** Prints the one-demensional array of DOUBLES in one line.
     * @param arrayOneDim accepts a double, one-dimensional array. */
    public static void oneDimDoublePrintValues(double[] arrayOneDim, String elementsSeparator, String ending, String decimals) {
        for (int i = 0; i < arrayOneDim.length; i++) {
            if (i > 0) {
                System.out.print(elementsSeparator);
            }
            System.out.printf("%."+decimals+"f", arrayOneDim[i]);
        }
        System.out.print(ending);
    }

    /** Prints the one-demensional array of STRINGS in one line.
     * @param arrayOneDim accepts a String, one-dimensional array. */
    public static void oneDimStringPrintValues(String[] arrayOneDim) {
        for (int i = 0; i < arrayOneDim.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arrayOneDim[i]);
        }
        System.out.print(".");
    }

    /** Prints the one-demensional array of CHARACTERS in one line.
     * @param arrayOneDim accepts a character, one-dimensional array. */
    public static void oneDimCharPrintValues(char[] arrayOneDim, String elementsSeparator, String ending) {
        for (int i = 0; i < arrayOneDim.length; i++) {
            if (i > 0) {
                System.out.print(elementsSeparator);
            }
            System.out.print(arrayOneDim[i]);
        }
        System.out.print(ending);
    }

// ---------- TWO-DIMENSIONAL ARRAYS ---------- //
    /** Prints the two-dimensional array of INTEGERS in one line */
    public static void twoDimIntPrintValues(int[][] arrayTwoDim, String numbersSeparator, String dotAtTheEnd) {
        for (int i = 0; i < arrayTwoDim.length; i++) {
          for (int j = 0; j < arrayTwoDim[i].length; j++) {
              if (j != 0) {
                  System.out.print(numbersSeparator);
              }
              System.out.print(arrayTwoDim[i][j]);
          }
            System.out.print(dotAtTheEnd);
            System.out.println();
        }
    }

}

    /**
     * TODO add printing horizontaly.
     * TODO określalna liczba miejsc po przecinku
     * TODO jedno z zadań ćwiczeniowych układało tabele w wiersze np po 4 wartości, zrób na n wartości.
     * TODO: 28/11/2016, two arguments, add all.
     */
