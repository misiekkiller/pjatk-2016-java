package Universe.projectEuler;

public class Problem005_SmallestMultiple {

    public static void main(String[] args) {

        int number = 1;
        int multiple = 0;

        while (multiple != number) {
            for (int i = 1; i <= 20; i++) {
                if (number % i == 0) {
                    multiple = number;
                } else {
                    number++;
                    break;
                }

            }
        }
        System.out.println(multiple);

    }
}

/** 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 *  What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

/**     Congratulations, the answer you gave to problem 5 is correct.
 *      You are the 331702nd person to have solved this problem.
 **/

// TODO: can be optimalised with overview, hard!