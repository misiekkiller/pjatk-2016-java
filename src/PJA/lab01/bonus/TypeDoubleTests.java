package PJA.lab01.bonus;

public class TypeDoubleTests {
    static void test(double v) {
        // Use methods to test the double.
        if (Double.isNaN(v)) {
            System.out.println("Not a number");
        }
        if (Double.isFinite(v)) {
            System.out.println("Finite");
        }
        if (Double.isInfinite(v)) {
            System.out.println("Infinite");
        }
    }

    public static void main(String[] args) {

        // An array of doubles.
        double[] values = {Double.NaN, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, 100};

        // Test all doubles in array.
        for (double v : values) {
            System.out.println(":: TEST ::");
            System.out.println(v);
            test(v);
        }
    }
}

/**
 * Double tests.
 * The Double class has several static methods.
 * These include isNaN, isFinite and isInfinite which tell us things about the double argument we provide.
 *
 * Tip: Special values on a double like NaN are stored within the double's bytes as a special code.
 */