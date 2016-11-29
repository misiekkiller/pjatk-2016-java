package PJA.lab01.bonus;

public class TypeFloatsDoubleCast {
    public static void main(String[] args) {

        // Cast double to float.
        double valueD = 200.75d;
        float valueF = (float) valueD;
        System.out.println(valueF);
    }
}

/**
 * Float cast. With an explicit cast, we can convert a double to a float.
 * We can also specify casts when not required just to make our code clearer.
 */