package PJA.lab02;

public class P4_z8_IncrementationOrder {

    public static void main(String[] args) {

        int x = 4;
        long y = x * 4 - x++;   // jeśli interesuje nas 5 zamiast 4, można uzyć ++x zamiast x++.
        if (y < 10) System.out.println("za mało");
        else System.out.println("w sam raz");

        System.out.println();
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}

// sprawdź jaki będzie wynik instrukcji, wynik uzasadnij.

/**
 Wnioski:
        1. w działaniu (y = x * 4 - x++) najpierw dochodzi do ojęcia x od 4x, a dopiero następnie inkrementacji x.
        2. inkrementacja x++ zachodzi na końcu, więc mamy tu nową wartość x, która w tym programie nie zostaje użyta.
 */