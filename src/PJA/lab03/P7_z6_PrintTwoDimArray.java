package PJA.lab03;

public class P7_z6_PrintTwoDimArray {

    public static void main(String[] args) {
        int[] array1 = new int[(int)(Math.random() * (10 - 1 + 1) + 1)];
        int[] array2 = new int[(int)(Math.random() * (10 - 1 + 1) + 1)];
        int[] array3 = new int[(int)(Math.random() * (10 - 1 + 1) + 1)];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * (9 - 1 + 1) + 1);
        }
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * (9 - 1 + 1) + 1);
        }
        for (int i = 0; i < array3.length; i++) {
            array3[i] = (int) (Math.random() * (9 - 1 + 1) + 1);
        }

        int[][] array2D = {array1, array2, array3};

        for (int i = 0; i < array2D.length ; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Arrays lengths: " + array1.length + ", " + array2.length + ", " + array3.length + ".");

    }
}

/**Utwórz trzy tablice zmiennych typu int o losowych rozmiarach i wypełnij
 * je losowymi wartosciami.
 * Nastepnie utwórz tablice, której elementami beda przygotowane
 * wczesniej tablice.
 * Wyswietl wszystkie wylosowane wartosci wykorzystujac utworzona tablice dwu wymiarowa.
 */
