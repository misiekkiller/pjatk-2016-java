package PJA.lab03;

public class P6_z7_ArrayForAnalysis {

    public static void main(String[] args) {
        int tab[] = {789 , 678 , 567};

        for (int i = 0 ; i < tab.length; i++) {
            for (int j = i; j < tab.length; j++) {
                System.out.println(tab[i] - tab[j]);
            }
        }

    }
}

/** Przeanalizuj powyższy program i wypisz wyswietlane wartosci:
 * 0, 0, 0 [NOPE!!!]
 * Poprawnie:
 * 0, 111, 222 z pierwszego kółka
 * 0, 111
 * 0
 * **/