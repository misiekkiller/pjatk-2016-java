package Universe.codeWars;

public class p0009_NextPerfectSquare {

    public static long findNextSquare(long sq) {
        long base = (long)Math.sqrt(sq);
        long newBase = base+1;
        long nextSquare = (long)Math.pow(newBase, 2);
        if (sq % base != 0) {
            nextSquare = -1;
        }
        return nextSquare;


    }

//    public static long findNextSquare(long sq) {
//        long root = (long) Math.sqrt(sq);                             // bo to longi, nie mają decymali, więc ich potęga (...)
//        return root * root == sq ? (root + 1) * (root + 1) : -1;
//    }

}

// KYU 7.