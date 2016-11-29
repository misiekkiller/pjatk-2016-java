package PJA.wyk03;

public class W5_p4_TwoDimensionalArray {

    public static void main(String[] args) {

        int tab[] = {1, 2, 3, 4, 5};
        int data[] = {96, 97, 98, 99};

        int[][] myTab = { tab, data };

        for (int i = 0; i < myTab.length; i++) {
//            System.out.println(myTab[i]);                 //polecą dwa adresy.
            for (int j = 0; j < myTab[i].length; j++){
                System.out.print(myTab[i][j] + " ");        //takie indexy polecą: 00, 01, 02, 03, 04, 10, 11, 12, 13.
            }
        }

        System.out.println();
        System.out.println("myTab[i1][i2] " + myTab[1][3]);
        System.out.println();
        System.out.println(myTab[0]);

    }
}

/** indeks pierwszy [i] wskazuje na pozycję w tablicy dwuwymiarowej,
    a indeks drugi [j] wskazuje element z tablicy w tablicy **/
