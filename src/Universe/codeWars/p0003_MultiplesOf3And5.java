package Universe.codeWars;

public class p0003_MultiplesOf3And5 {

    public static int multiplesOf3And5(int number) {
        int multipleSum = 0;
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                multipleSum = multipleSum + i;
            }
        }
        return multipleSum;
    }

    public static void main(String[] args) {

        System.out.println(multiplesOf3And5(10));

    }
}

/** DIFFERENT APPROACH #1 **/
//import java.util.stream.IntStream;
//
//public class Solution {
//    public int solution(int number) {
//        return IntStream.range(0, number)
//                .filter(n -> (n % 3 == 0) || (n % 5 == 0))
//                .sum();
//    }
//}

/** DIFFERENT APPROACH #2**/
/*
    The sum of multiples of 3 is 3 + 6 + 9 + ... = 3 (1+2+3+...)
    The sum of mulitples of 5 is 5 + 10 + 15 + ... = 5 (1+2+3+...)
    If we just sum these, we'll get double values when a number is divisble by both,
    so we substract the sum of multiples of 15, which is obtained in a similar manner.
    The upper bound cannot be floor function because the inputed number shouldn't count.
*/
//import java.lang.Math;
//public class Solution {
//    public int solution(int n) {
//        int a = (int) Math.ceil(n/3d) - 1;
//        int b = (int) Math.ceil(n/5d) - 1;
//        int c = (int) Math.ceil(n/15d) - 1;
//        return (3 * a * (a+1) + 5 * b * (b+1) - 15 * c * (c + 1)) / 2;
//    }
//}