package PJA.lab03;

public class P6_z3_ArrayRandomLength {

    public static void main(String[] args) {

        int[] tab = new int[(int)(Math.random() * (25 - 10 + 1) + 10)];
        System.out.println("tab.length = " + tab.length);

    }

}

/** Dana jest jednowymiarowa tablica zmiennych typu int o wielkosci losowanej przy
 kazdym uruchomieniu programu. Napisz program sprawdzajacy i wyswietlajacy informacje
 jaka jest długosc tej tablicy.*/