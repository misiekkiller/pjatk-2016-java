package PJA.lab03;

public class P7_z2_HowManyCharsInString {

    public static void main(String[] args) {
        char letter = 'A';
        String zdanie = "Ala ma kota";
        char[] zdanieArrayLC = zdanie.toLowerCase().toCharArray();
        char[] zdanieArrayUP = zdanie.toUpperCase().toCharArray();
        int counterOfA = 0;

        for (int i = 0; i < zdanieArrayLC.length; i++) {
            if (zdanieArrayLC[i] == letter || zdanieArrayUP[i] == letter) {
                counterOfA++;
            }
        }

        System.out.println("'" + letter + "' " + "occurs " + counterOfA + " times in the sentence \"" + zdanie + "\".");
    }
}

/**  Dana jest tablica zmiennych typu char przechowujaca ciag znaków “Ala ma
 *   kota”. Napisz program liczacy ile razy w tablicy wystapiła litera ’a’.
 */