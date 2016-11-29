package Universe.projectEuler;

public class Problem003_LargesPrimeFactor_v2 {

    public static void main(String[] args) {

        long givenNumber = 13195L;
        int factor;
        int lastFactor;

        if (givenNumber % 2 == 0) {
            givenNumber = givenNumber / 2;
            lastFactor = 2;
            while (givenNumber % 2 == 0) {
                givenNumber = givenNumber / 2;
            }
        } else {
            lastFactor = 1;
        }
        factor = 3;
        while (givenNumber > 1) {
            if (givenNumber % factor == 0) {
                givenNumber = givenNumber / factor;
                lastFactor = factor;
                while (givenNumber / factor == 0) {
                    givenNumber = givenNumber / factor;
                }
            }
            factor = factor + 2;
        }
        System.out.println(lastFactor);

    }
}

/**     The prime factors of 13195 are 5, 7, 13 and 29.
        What is the largest prime factor of the number 600851475143 ?
 */


/** Upgrade:
        2 is the only even prime, so if we treat 2 separately we can increase factor
        with 2 every step.
 */