package PJA.lab01.bonus;

public class TypeDouble {
    public static void main(String[] args) {

        // Use double local variables.
        double value1 = 1.0d;
        double value2 = 1;
        double value3 = (double) 1;

        // A double can be assigned to a float value.
        float test = 1.0f;
        double value4 = test;

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);
    }
}

/**
 *  Here we try casting some doubles.
 *  We can convert ints and floats (and other smaller numeric types) to doubles without a cast.
 *  This is a widening cast.
 *
 *  Suffix: The lowercase "d" indicates double literal. So if we want a literal of type double, use the "d" as a suffix.
 *
 *  Double is best reserved for special situations.
 *  If floating point is necessary, a double is a simpler choice than float, as floats can be easily cast to doubles.
 */