package Universe.oracleAssociateSample;

public class MyLoop {
    public static void main(String[] args) {
        String[] sa = {"tom ", "jerry "};
        for (int x = 0; x < 3; x++) {
            for (String s : sa) {
                System.out.print(x + " " + s);
                if (x == 1) {
                    break;
                }
            }
        }
    }
}

/**
    What is the result?
        A) 0 tom 0 jerry 1 tom 1 jerry
        B) 0 tom 0 jerry 2 tom 2 jerry
        C) 0 tom 0 jerry 1 tom 2 tom 2 jerry
        D) 0 tom 0 jerry 1 tom 1 jerry 2 tom 2 jerry
 */

/**
 The following program, EnhancedForDemo, uses the enhanced for to loop through the array:

 class EnhancedForDemo {
    public static void main(String[] args){
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        for (int item : numbers) {
            System.out.println("Count is: " + item);
        }
    }
 }
 */