package Universe.codeWars;

public class p0006_IsTriangle {

    public static boolean isTriangle(int a, int b, int c) {

        boolean ifTriangle;
        ifTriangle = a + b > c && a + c > b && b + c > a;

        return ifTriangle;
    }
}


// CLEVER:
//    public static boolean isTriangle(int a, int b, int c){
//        return a + b > c && a + c > b && c + b > a;
//    }
