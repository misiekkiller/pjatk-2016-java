package PJA.wyk02;

public class W4_p3_LoopTypes {

    public static void main(String[] args) {

        /** WHILE **/
        System.out.println("----- WHILE LOOP -----");
        int wrt = 6;
        while (wrt > 0) {
            System.out.println("while loop");
            wrt = wrt - 1;
        }
        System.out.println();

        /** DO WHILE **/
        System.out.println("----- DO WHILE LOOP -----");
        wrt = 6;
        do {
            System.out.println("do while loop");
            wrt = wrt - 1;
        } while (wrt > 0);
        System.out.println();

        /** FOR **/
        System.out.println("----- FOR LOOP -----");
        for (int i = 6; i > 0; i--) {
            System.out.println("for loop");
        }
        System.out.println();

//		for(;;)
//			System.out.println("infinite for loop :> ");

        int res = 713;
        for (int i = 31; i >= 0; i--) {
            if ((res & (1 << i)) != 0)
                System.out.print("1");
            else
                System.out.print("0");
            if (i % 4 == 0)
                System.out.print(" ");
        }
        System.out.println();
        System.out.println();   // TODO: QUESTION dlaczego tu trzeba 2 println'y, żeby spaść o 1 linię?

        wrt = 2;
        for (int i = 0; i < 10; i++) {
            System.out.println(i * wrt);
        }
        System.out.println();

        int ileLiczbWylosowac = 5;
        double wrtLosowa;
        for (int i = 0; i < ileLiczbWylosowac; i++) {
            wrtLosowa = (Math.random() * 100);
            System.out.println(wrtLosowa);
        }
        System.out.println();

        // l=0, m=0, nic | l=1, m=1, print 1, m=0 | l=2, m=2, print 2,1 m=0 | l=3, m=3, print 1,3,2,1 |
        for (int l = 0; l < 4; l++) {
            int m = l;
            while (m > 0) {
                System.out.println("test");
                System.out.println(m);
                m--;
            }
        }
        System.out.println();

        /** LOOPIN AN ARRAY **/
        System.out.println("----- LOOPIN AN ARRAY -----");
        double[] tab = {1.0, 2.0, 3.0};
        // manual method
        System.out.println(tab[0]);
        System.out.println(tab[1]);
        System.out.println(tab[2]);
        // automatic/loop method
        for (int i = 0; i < tab.length; i++)
            System.out.println(tab[i]);
        System.out.println();

        // changing arrays values to random doubles and printing them:
        ileLiczbWylosowac = tab.length;
        for (int i = 0; i < ileLiczbWylosowac; i++) {
            tab[i] = (Math.random() * 100);
            System.out.println(tab[i]);
        }
        System.out.println();

        // new arrays parameters checked with for loop
        int tab2[] = null;
        System.out.println(tab2);
        tab2 = new int[5];
        System.out.println(tab2);
        for (int i = 0; i < tab2.length; i++)
            System.out.println(tab2[i]);
        System.out.println();

    }
}
