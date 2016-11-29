// TODO: 29/11/2016 QUESTION dobrze to jest?
package PJA.lab01;

public class P2_z6_TypesAddition {

    public static void main(String[] args) {

        char varChar = 35;
        int varInt = 400;
        float varFloat = 3.14f;
        double varDouble = 6.99;
        byte varByte = 64;

        System.out.println(varChar + varInt);       // wynikiem jest Integer.
        System.out.println(varInt + varChar);       // wynikiem jest Integer.
        System.out.println(varFloat + varDouble);   // wynikiem jest Double.
        System.out.println(varByte + varInt);       // wynikiem jest Integer.

        // Java poszerza typy, aby uniknąć braku pamięci dla wyniku.
    }
}

/**
 * Zadanie VI PPJ ćwiczenia 2.
 *
 * Jaki bedzie rezultat dodania:
 * do zmiennej typu char zmiennej typu int,
 * do zmiennej typu int zmiennej typu char,
 * do zmiennej typu float zmiennej typu double,
 * do zmiennej typu byte zmiennej typu int.
 */