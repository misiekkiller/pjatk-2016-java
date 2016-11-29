// TODO: 29/11/2016. QUESTION Dlaczego niektóre wyniki dają różnicę ok. 0.1?
package PJA.lab04;
import VNTools.ArrayShow;

public class P8_z2_DoubleArraysCrossAddition {

    public static void main(String[] args) {

        double[] array1 = new double[3];
        double[] array2 = new double[3];
        double[] array3 = new double[3];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = (Math.random() * (5.0 - 0.0) + 0.0);
        }
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (Math.random() * (5.0 - 0.0) + 0.0);
        }
        ArrayShow.oneDimDoublePrintValues(array1," ","","1");
        System.out.println();
        ArrayShow.oneDimDoublePrintValues(array2, " ", "","1");

        for (int i = 0, j = array2.length-1; i < array1.length; i++, j--) {
            array3[i] = array1[i] + array2[j];
        }
        System.out.println();
        ArrayShow.oneDimDoublePrintValues(array3, " ", "","1");

    }
}

/** Dane sa dwie trzyelementowe tablice zmiennych typu double wypełnione losowymi
 * liczbami z przedziału 0.0 do 5.0. Napisz program, w wyniku którego powstanie trzecia
 * trzyelementowa tablica wyliczana zgodnie z zasada, ze pierwszy element wynikowej
 * tablicy jest wynikiem sumy pierwszego elementu z pierwszej tablicy i ostatniego elementu
 * z drugiej tablicy, drugi element tablicy wynikowej jest wynikiem sumy drugiego
 * elementu z pierwszej tablicy i drugiego od konca elementu drugiej tablicy itd itd.
 */