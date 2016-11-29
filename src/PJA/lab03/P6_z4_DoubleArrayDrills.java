package PJA.lab03;

public class P6_z4_DoubleArrayDrills {

    public static void main(String[] args) {

        double[] tab = new double [10];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = (Math.random() * (10 + 10 + 1) - 10);
        }
        System.out.println("Zawartość tablicy: ");
        for (int i = 0; i < tab.length; i++) {
            System.out.printf("%.2f", tab[i]);
            System.out.print("  ");
        }
        System.out.println("\n");
        System.out.println("Parzyste indeksy: ");
        for (int i = 0; i < tab.length; i++) {
            if (i % 2 == 0) {
                System.out.printf("%.2f", tab[i]);
                System.out.print("  ");
            }
        }

        System.out.println("\n");
        System.out.println("Nieparzyste inty: ");
        for (int i = 0; i < tab.length; i++) {
            if ((int)tab[i] % 2 != 0) {
                System.out.printf("%.2f", tab[i]);
                System.out.print("  ");
            }
        }

    }
}

/** Zadeklaruj tablice zmiennych typu double o rozmiarze 10 elementów. A nastepnie:
  wypełnij tablice losowymi liczbami
  wyswietl na ekranie zawartosc całej tablicy
  wyswietl na ekranie tylko liczby o parzystym indeksie
  wyswietl na ekranie tylko elementy tablicy, których przekonwertowane na int
 wartosci sa nieparzyste **/

// TODO: QUESTION jak jeszcze można ograniczyć liczbe miejsc po przecinku? printf zmusza do rozbijania printów.