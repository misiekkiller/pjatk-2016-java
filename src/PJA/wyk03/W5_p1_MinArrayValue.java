package PJA.wyk03;

public class W5_p1_MinArrayValue {

    public static void main(String[] args) {

        /** ARAYS **/
        // zmienna typu tablicowego, czyli złożonego.
        System.out.println("----- Deklaracja, inicjacja i iteracja tablic: -----");
        int[] arr1;
        int arr2[];

        int[] tab = {1, 2, 3, 4, 5};
        System.out.println("tab[0] " + tab[0]);
        System.out.println("tab[1] " + tab[1]);
        System.out.println("tab[2] " + tab[2]);
        System.out.println();

        System.out.println("Dlugosc tablicy: " + tab.length);
        System.out.println();

        for (int i = 0; i < tab.length; i++){
            System.out.println("tab[" + i + "]" + tab[i]);
        }

        // Wypełnianie tablicy losowymi wartościami
        System.out.println("\n----- Wypełnienie tablicy losowymi wartościami: -----");
        int[] data = {
                (int)(Math.random()*100),
                (int)(Math.random()*100),
                (int)(Math.random()*100),
                (int)(Math.random()*100),
                (int)(Math.random()*100),
                (int)(Math.random()*100),
                (int)(Math.random()*100)
        };

        for (int i = 0; i < data.length; i++){
            System.out.println("data[" + i + "]: " + data[i]);
        }

        // Wyszukiwanie najmniejszego elementu tablicy.
        System.out.println("\n ----- Wyszukiwanie najmniejszego elementu tablicy data[]: -----");

        if (data == null) {
            System.out.println("Tablica nie istnieje");
        }
        else {
            int minVal = data[0];
            if (data.length > 1){
                for (int i = 1; i < data.length; i++){
                    System.out.println(data[i] + "\t<\t" + minVal + "\t = \t" + (data[i] < minVal));
                    if (data[i] < minVal) {
                        minVal = data[i];
                    }
                }
            }
            System.out.println("Najmniejsza wartość tablicy data[] to: " + minVal);
        }

    }
}