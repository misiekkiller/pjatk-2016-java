package Universe.codeWars;

public class p0008_Stringy {

    public static String stringy(int size) {
        String str = "";
        for (int i = 1; i <= size; i++) {
            if (i % 2 == 0) {
                str +=0;
            } else {
                str +=1;
            }
        }
        return str;
    }

//    public static String stringy(int size) {
//        StringBuilder sb = new StringBuilder();
//        for (int i = 1; i < size + 1; i++)
//            sb.append(i & 1);
//        return sb.toString();
//    }

}
