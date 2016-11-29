package PJA.lab02;

public class P4_z9_ExclusiveOR {

    public static void main(String[] args) {

        boolean x = true, z = true;                         // niepotrzebne deklaracje.
        int y = 20;
        x = (y != 10) ^ (z = false);                        // ^ is true, kiedy 1 i 0.
        System.out.println(x + ", \n" + y + ", \n" + z + ("."));

    }
}

/**
 Jaki bedzie rezultat ponizszego programu:
        boolean x = true, z = true;
        int y = 20;
        x = (y != 10) ^ (z = false);    // ^ is true, kiedy 1 i 0.
        System.out.println(x + ", " + y + ", " + z);

 wg mnie:   x = true
            y = 20
            z = true ERROR, it's false, nie zauważyłem ponownego przypisania wartości w równaniu.
 */
