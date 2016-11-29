package PJA.lab02.bonus;

public class test {

    public static void main(String[] args) {

        int x = 0;
        int liczba = 0;
        //Empty String
        String  primeNumbers = "";

        for (x = 1; x <= 10; x++) {
            int licznik = 0;
            for (liczba = x; liczba >= 1; liczba--) {
                if(x % liczba == 0) {
                    licznik++;
                }
            }
            if (licznik == 2) {
                //Appended the Prime number to the String
                primeNumbers = primeNumbers + x + " ";
            }
        }
        System.out.println("Prime numbers from 1 to 10 are: ");
        System.out.println(primeNumbers);
    }
}