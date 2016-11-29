package PJA.lab03;

public class P7_z1_PrintFromStringArray {

    public static void main(String[] args) {
        String[] slowa = {
                "Ala" , "kota" , "ma" , "ma" , "a" , "kot" , "Ale"
        };

        System.out.print(slowa[0] + " " + slowa[2] + " " + slowa[1] + " " +
                slowa[4] + " " + slowa[5] + " " + slowa[3] + " " + slowa[6] + ".");
    }

}

/** Dana jest tablica zdefiniowana jak nastepuje:
        String[] slowa = {
            "Ala" , "kota" , "ma" , "ma" , "a" , "kot" , "Ale"
        };
 Napisz program, który wypisze na ekranie Ala ma kota a kot ma Ale wykorzystujac
 tablice slowa.
 */