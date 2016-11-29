package Universe.projectEuler;

public class Problem003_LargesPrimeFactor_v1 {

    public static void main(String[] args) {

        long givenNumber = 16L;
        int factor = 2;
        int lastFactor = 1;
        while (givenNumber > 1) {
            if (givenNumber % factor == 0) {
                lastFactor = factor;                            // zachowanie lastFactora do wyświetlenia, mniejsze się nadpisują
                givenNumber = givenNumber / factor;
                while (givenNumber % factor == 0) {             // ten while redukuje givenNumber do 1 i kończy operację
                    givenNumber = givenNumber / factor;
                }
            }
            factor++;
        }
        System.out.println(lastFactor);

    }
}

/**     The prime factors of 13195 are 5, 7, 13 and 29.
        What is the largest prime factor of the number 600851475143 ?
 */


/**
 *
 */