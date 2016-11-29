package PJA.lab03;
import VNTools.*;
import java.util.Random;

public class P6_z1to2_ArrayHowMany0And1 {

    public static void main(String[] args) {
// MY METHODS
//        int[] tab = ArrayAugment.oneDimIntCreateRandom(10, 10, 0, 1);
//        ArrayShow.oneDimIntPrintValues(tab);

// BY HAND
        int ones = 0;
        int zeros = 0;
        int[] tab = new int[10];

    // Math.random()
        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int)(Math.random() * (1 - 0 + 1) + 0);
        }
    // Random
        Random randomizer = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = randomizer.nextInt(2);
        }
        ArrayShow.oneDimIntPrintValues(tab, ", ", ".");

        for (int j : tab) {
            if (j == 1) {
                ones++;
            } else {
                zeros++;
            }
        }

        System.out.println("There are " + zeros +" zeros and " + ones + " ones in this array.");

    }

}

/** Zadeklaruj jednowymiarowa tablice zmiennych typu int o rozmiarze 10 elementów i
 wypełnij ja losowo wartosciami 0 lub 1.
 Napisz program liczacy ile 0 i 1 jest w tablicy zdefiniowanej w poprzednim zadaniu.**/
