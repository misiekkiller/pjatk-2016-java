package Universe.projectEuler;

public class Problem001_MultipliesOf3And5 {

    public static void main(String[] args) {

        int multiplesSum = 0;
        for (int i = 1; i < 1000; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                multiplesSum = multiplesSum + i;
                System.out.println(i);
            }
        }
        System.out.println("Sum of all the multiples of 3 or 5 below 1000 is: " + multiplesSum);

    }
}

/**     If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
        The sum of these multiples is 23.
        Find the sum of all the multiples of 3 or 5 below 1000.

        // positive numbers: the positive integers (whole numbers) 1, 2, 3, etc., and sometimes zero as well.
        -----------------------------------------
        Congratulations, the answer you gave to problem 1 is correct.
        You are the 612727th person to have solved this problem.
 */

// TODO te wartości można wrzucać do tabeli, zrobić print tabeli, a potem sumy elementów. Make v2 z tabelą.