// TODO: 29/11/2016. Implement in VNTools.ArraySearch for (param) 2-4 digit sequences in OneDim arrays (+ todo for 2D).

package PJA.lab03;

import VNTools.*;

public class P7_z4_101Sequence {

    public static void main(String[] args) {
        int[] array = ArrayAugment.oneDimIntCreateRandom(10,10,0,1);
        ArrayShow.oneDimIntPrintValues(array, " ","");

        boolean sequence = false;
        int sequenceCounter = 0;

        for (int i = 0; i < array.length-2 ; i++) {
            if (array[i] == 1 &&
                    array[i+1] == 0 &&
                    array[i+2] == 1) {
                sequence = true;
                sequenceCounter++;
            }
        }

        System.out.println(sequence ? "Times sequence 1,0,1 occured: " + sequenceCounter + "." : "Sequence 1,0,1 didn't occure." );

    }

}

/** Utwórz dziesiecio elementowa tablice zmiennych typu int i wypełnij ja losowymi
 *  liczbami z przedziału od 0 do 1. Nastepnie napisz program sprawdzajacy czy
 *  w tej tablicy wystapiła sekwencja 1, 0, 1, a jezeli tak to ile razy.
 */
