package PJA.lab03;

import VNTools.ArrayShow;

public class P7_z3_AugmentArrayMoveElements {

    public static void main(String[] args) {
        int[] array = new int[20];
        int arrayCenter = array.length/2;

        for (int i = 0; i < array.length-2; i++) {
            array[i] = (int)(Math.random() * (9 - 1 + 1) + 1);
        }

        ArrayShow.oneDimIntPrintValues(array," ","");

        for (int i = array.length-1; i > arrayCenter; i--) {
            array[i] = array[i-1];
        }

        ArrayShow.oneDimIntPrintValues(array," ","");

        array[arrayCenter] = -1;

        for (int anArray : array) {
            System.out.print(anArray + " ");
        }

    }
}

/** Utwórz 20 elementowa tablice zmiennych typu int i wypełnij elementy od
 *  indeksu 0 do 18 losowymi wartosciami. Nastepnie w srodek tablicy wstaw element o
 *  wartosci -1 (przesuwajac odpowiednie elementy w prawo) i wyswietl cała tablice.
 **/