package PJA.lab03;

public class P6_z8_ArrayIsDiagonal {

    public static boolean arrayIsDiagonal(int[][] array) {
        int counter = 0;
        boolean isDiagonal = true;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0 && j != counter){
                    isDiagonal = false;
                }
            }
            counter++;
        }
// FOR EACH
//        for (int[] anArray : array) {
//            for (int j = 0; j < anArray.length; j++) {
//                if (anArray[j] > 0 && j != counter) {
//                    isDiagonal = false;
//                }
//            }
//            counter++;
//        }

        return isDiagonal;
    }

    public static void main(String[] args) {
        int[][] tab = {
                {1 ,0 ,0}, // oprócz 0
                {0 ,1 ,0}, // oprócz 1
                {0 ,0 ,1},
                {0, 0, 0}  // oprócz 2
        };

        System.out.println(arrayIsDiagonal(tab));

    }
}

/** Napisz program sprawdzajacy czy jest to tablica diagonalna, czyli taka której wszystkie
 wartosci lezace poza główna przekatna sa zerowe. **/

// TODO: add to Matematics.matrixIsDiagonal.
