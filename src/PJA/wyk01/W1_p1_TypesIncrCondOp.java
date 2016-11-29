package PJA.wyk01;

public class W1_p1_TypesIncrCondOp {

    public static void main(String[] args) {

        // ZAMIANA TYPÓW
        char chr = 'a';

        System.out.println(chr + " -> " + (int)chr);
        System.out.println((char)(chr+1) + " -> " + chr+1);

        // INKREMENTACJA
        int zmCalInt = 100;
        System.out.println(zmCalInt += 100);
        System.out.println(zmCalInt);

        System.out.println(zmCalInt++ + 5);
        System.out.println(++zmCalInt);

        System.out.println("========================");
        int zmCalkowitaInt = 10;
        System.out.println(zmCalkowitaInt);
        System.out.println(zmCalkowitaInt++);
        System.out.println(++zmCalkowitaInt);

        int wrt = zmCalkowitaInt++ + 5;
        System.out.println(wrt);
        System.out.println(zmCalkowitaInt);

        // OPERATOR WARUNKOWY ? :
        System.out.println( "jest " + (
                6 > 9 ?
                        (zmCalInt < 0 ? "a" : "b") :
                        "false")
        );

    }
}
