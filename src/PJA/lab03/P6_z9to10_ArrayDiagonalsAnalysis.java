// TODO: 28/11/2016 OPTIMALISATION [DONE]. Na konsultacjach.
package PJA.lab03;
import VNTools.ArrayShow;

public class P6_z9to10_ArrayDiagonalsAnalysis {

    public static void main(String[] args) {
// 1 INITIALIZE
        int tabOneLength = 3;
        int tabTwoLength = 3;
        int[][] tabTwoDim = new int[tabOneLength][tabTwoLength];
        int lengthsCounter = 0;

// 2 RANDOM FILL + COUNT TOTAL ARRAY LENGTH
        for (int i = 0; i < tabTwoDim.length; i++) {
            for (int j = 0; j < tabTwoDim[i].length; j++) {
                tabTwoDim[i][j] = (int)(Math.random() * (9 - 0 + 1) + 0);
            }
            lengthsCounter += tabTwoDim[i].length;
        }

// 2.2 PRINT 2D ARRAY
        for (int i = 0; i < tabTwoDim.length; i++) {
            for (int j = 0; j < tabTwoDim[i].length; j++) {
                System.out.print(tabTwoDim[i][j] + " \t");
            }
            System.out.println();
        }
        System.out.println();

// 3.1 CONVERT 2D INTO 1D AND PRINT 2D ARRAY
        int[] tabOneDim = new int[lengthsCounter];
        int counter = 0;

        for (int i = 0; i < tabTwoDim.length; i++) {
            for (int j = 0; j < tabTwoDim[i].length; j++) {
                tabOneDim[counter] = tabTwoDim[i][j];
                counter++;
            }
        }
        ArrayShow.oneDimIntPrintValues(tabOneDim, " ", "\n");

// 3.2 CHECK FOR DUPLICATES IN DIAGONAL 1 AND DIAGONAL 2
        boolean diagonalsDuplicates = false;
        // Model 1 with one dimentional array and two separate fors:
        for (int i = 0; i < tabOneDim.length; i+=tabTwoLength+1) {
            for (int j = 0; j < tabOneDim.length; j+=tabTwoLength+1) {
                if (tabOneDim[i] == tabOneDim[j] && i != j) {
                    diagonalsDuplicates = true;
                }
            }
        }

        for (int i = tabTwoLength-1; i < tabOneDim.length-tabTwoLength+1; i+=tabTwoLength-1) {
            for (int j = tabTwoLength-1; j < tabOneDim.length-tabTwoLength+1; j+=tabTwoLength-1) {
                if (tabOneDim[i] == tabOneDim[j] && i != j) {
                    diagonalsDuplicates = true;
                }
            }
        }
        // Model 2 with two dimensional array and one double for:
        int tweaker = 0;
        for (int i = 0; i < tabTwoDim.length; i++) {
            for (int j = 0, k = tabTwoDim[0].length-1, m = 0; j < tabTwoDim[0].length; j++, k--) {
                System.out.println("method2 test: " + tabTwoDim[m][j] + " " + tabTwoDim[m][k]);
                for (int n = 0, o = tabTwoDim[0].length-1; n < tabTwoDim[0].length; n++, o--) {
                    if (){

                    }
                }
                m++;

            }

        }

// 6 CHECK FOR SUMS IN ROWS AND COLLUMNS
        boolean rowsCollsSums = false;
        int rowSum = 0;
        int collSum = 0;
        for (int i = 0; i < tabTwoDim.length; i++) {            // wybiera kolejne tablice z tabTwoDim [5 razy]
            for (int j = 0; j < tabTwoDim[i].length; j++) {     // wybiera pierwsze pięć elementów z tablicy tabTwoDim[i] [5 razy]
                rowSum += tabTwoDim[i][j];
            }
            /** @param k leci [i] razy.
             * @param m trzyma kolumnę.
             * @param n zmienia wiersz.
             * po przeleceniu wszystkich elementów z kolumny collSum i rowSum1 się porównują,
             * dalej collSum się zeruje, m się zeruje, n++ żeby przejść do kolejnej kolumny. **/
            for (int k = 1, m = 0, n = 0; k <= tabTwoDim.length*tabTwoDim[i].length; k++, m++ ) {
                collSum += tabTwoDim[m][n];

                if (k % tabTwoDim[i].length == 0) {
                    if (rowSum == collSum) {
                        rowsCollsSums = true;
                        System.out.println("row = coll = " + rowSum + " " + collSum);
                    }
                    collSum = 0;// reset
                    m = -1;
                    n++;
                }
            }
            rowSum = 0;
        }

// 5 PRINT RESULTS (TRUE OR FALSE)
            System.out.println("Diagonal duplicates: " + diagonalsDuplicates);
            System.out.println("Any rows total value equals any collumns total value: " + rowsCollsSums);
    }
}


/** z9
 * Zadeklaruj dwuwymiarowa tablice zmiennych typu int o rozmiarach 5 na 5 elementów.
 * Nastepnie wypełnij jej pola losowymi wartosciami i sprawdz czy na którejkolwiek
 * z przekatnych tej tablicy sa przynajmniej dwie takie same wartosci.
 *
 * z10
 * Sprawdz w tablicy z poprzedniego zadania, czy suma elementów dowolnego wiersza
 jest taka sama jak suma elementów dowolnej kolumny.
 **/

// jeden for czyli i + parametr pomocniczy +1 i -1, + if i == i. Chodzi tu o szukanie na diagonalnych powtórek.
// druga opcja to nie robienie 1D tablicy z 2D, tylko z 2d zrobić tablicę z samymi diagonalnymi, i szukać w nich powtórek