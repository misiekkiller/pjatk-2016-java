package Universe.projectEuler;

public class Problem004_LargestPalindromeProduct {

    public static void main(String[] args) {

        int number;
        String numberToString;
        int lastPalindrome = 0;

                                                /** NUMBERS GENERATOR **/
        for (int i = 100; i <= 999; i++) {
            for (int j = 100; j <= 999; j++)  {
                number = i * j;
                                                /** PALINDROME GATE **/
                numberToString = Integer.toString(number);
                String numberReversed = new StringBuilder(numberToString).reverse().toString();         // jaka konwencja skoro tu jest new?

                if (numberToString.equals(numberReversed)) {
                                                /** BIGGEST PRODUCT CONTAINER **/
                    while (number > lastPalindrome) {
                        lastPalindrome = number;
                    }
                }
            }
        }
        System.out.println(lastPalindrome);

    }
}

/** A palindromic number reads the same both ways.
    The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
    Find the largest palindrome made from the product of two 3-digit numbers.
 */

/** PLAN
 * 1. pętla generująca mnożniki liczb dwucyfrowych.                         [DONE]
 * 2. bramka odrzucająca nie-palindromy (string vs stringReversed).         [DONE]
 * 3. zmienna lastPalindrome przechowująca największy palindrom.            [DONE]
 * 4. TODO: can be improved (check overview), also use functions to store reversing methods.
 * **/

// Congratulations, the answer you gave to problem 4 is correct.
// You are the 321064th person to have solved this problem.