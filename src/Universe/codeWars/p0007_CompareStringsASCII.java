package Universe.codeWars;

public class p0007_CompareStringsASCII {

    public static Boolean compare(String s1, String s2) {

        if (s1 == null) {
            s1 = "";
        } else if (s2 == null) {
            s2 = "";
        }

        int counter1 = 0;
        int counter2 = 0;
        char[] s1Char = s1.toUpperCase().toCharArray();
        char[] s2Char = s2.toUpperCase().toCharArray();
        boolean areEqual;

        for (char S1C : s1Char) {
            if (S1C < 65 || S1C > 90) {
                counter1 = 0;
            } else {
                counter1 += S1C;
            }
        }

        for (char S2C : s2Char) {
            if (S2C < 65 || S2C > 90) {
                counter2 = 0;
            } else {
                counter2 += S2C;
            }
        }

        areEqual = counter1 == counter2;

        return areEqual;
    }

    public static void main(String[] args) {
        System.out.println(compare(null, ""));
    }
}

// A-Z 65-90

/** WOW! **/
//    public static boolean compare(String s1, String s2) {
//
//        if (s1 == null || !s1.matches("[a-zA-Z]+")) s1 = "";
//        if (s2 == null || !s2.matches("[a-zA-Z]+")) s2 = "";
//
//        return s1.toUpperCase().chars().sum() == s2.toUpperCase().chars().sum();
//    }