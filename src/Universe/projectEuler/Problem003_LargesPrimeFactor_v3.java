package Universe.projectEuler;

public class Problem003_LargesPrimeFactor_v3 {

    public static void main(String[] args) {

        long n = 600851475143L;
        int factor;
        int lastFactor;
        double maxFactor;

        if (n % 2 == 0) {
            lastFactor = 2;
            n = n / 2;
            while (n % 2 == 0) {
                n = n / 2;
            }
        } else {
            lastFactor = 1;
        }
        factor = 3;
        maxFactor = Math.sqrt(n);
        while (n > 1 && factor <= maxFactor){
            if (n % factor == 0) {
                n = n / factor;
                lastFactor = factor;
                while (n % factor == 0) {
                    n = n / factor;
                }
                maxFactor = Math.sqrt(n);
            }
            factor = factor + 2;
        }

        if (n == 1) {
            System.out.println(lastFactor);
        }
        else {
            System.out.println(n);
        }

    }
}

/**     The prime factors of 13195 are 5, 7, 13 and 29.
        What is the largest prime factor of the number 600851475143 ?
 */


/** Update:
        The largest primefactor in the number you were asked was not very large.
        Suppose now that the number to be factored is 2*1009*(some big prime) then it would take
        quite a time for factor to reach that prime. This can be improved upon by the following
        key realisation: every number n can at most have one prime factor greater than n. If we,
        after dividing out some prime factor, calculate the square root of the remaining number we
        can use that square root as upper limit for factor. If factor exceeds this square root
        we know the remaining number is prime.
 */