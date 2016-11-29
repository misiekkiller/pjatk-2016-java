package PJA.wyk02;

public class W3_p2_IfSwitch {

    public static void main(String[] args) {

        /** IF **/
        // Przykład 1
        if(false) {
            System.out.println("Jest true");
        } else {
            System.out.println("Jest false");
        }

        // Przykład 2
        if((3 < 7) && (3 > 5))
            System.out.println("Jest true");
        else
            System.out.println("Jest false");

        // Przykład 3
        // Math.random() returns a number from zero to one.
        int zmienna = (int)(Math.random()*30)-15;   // od -15 do 14
        System.out.println("zmienna: " + zmienna);
        if(zmienna == 9) {
            System.out.println("Jest 9");
        } else {
            System.out.println("Nie jest 9");
        }

        /** Math.random() formula
         (int)(Math.random() * ((upperbound - lowerbound) + 1) + lowerbound);
         (where lowerbound is inclusive and upperbound exclusive).
         **/

        // Przykład 4
        if (zmienna > 0) {
            System.out.println("A");
        } else if ( zmienna <= -6) {
            System.out.println("B");
        } else if (zmienna >= -10 && zmienna <= 10) {
            System.out.println("C");
        }

        // Przykład 4
        int x = (int)(Math.random()*30) - 15;

        if (x > 11)
            System.out.println("A");
        else
        if (x < -11)
            System.out.println("B");
        else
        if (x > 1)
            System.out.println("AC");
        else
        if (x <= -6)
            System.out.println("BC");
        else
            System.out.println("C");

        // Przykład 5
        final int czerwony = 12;
        final int zielony = 22;
        final int niebieski = 32;

        int color = (int)(Math.random()*67); // 0-3

        if (color == czerwony)
            System.out.println("czerwony");
        if (color == zielony)
            System.out.println("zielony");
        if (color == niebieski)
            System.out.println("niebieski");


        /** SWITCH - przykład słaby, o Jezu jaki słaby.**/
        switch (color) {
            case 1:
                System.out.println("switch czerwony");
                break;
            case zielony:
                System.out.println("switch zielony");
                break;
            case niebieski:
                System.out.println("switch niebieski");
                break;
            case czerwony + zielony:
                // to 1 | 2, czyli 0001 AND 0010 = 0000
                System.out.println("zolty");
                break;
            case czerwony + niebieski:
                // 0001 AND 0011 = 0001; 0001 OR 0011 = 0011
                System.out.println("magenta");
                break;
            case zielony + niebieski:
                System.out.println("cyan");
                break;
            case czerwony + zielony + niebieski:
                System.out.println("bialy");
                break;
            default:
                System.out.println("nie kolor");
        }

    }
}
