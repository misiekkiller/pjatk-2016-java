package Universe.codeWars;

public class p0005_SmallestIntInArray {

    public static int findSmallestInt(int[] args) {
        int minVal = args[0];
        for (int i = 1; i < args.length; i++) {
            if (args[i] < minVal) {
                minVal = args[i];
            }
        }
        return minVal;
    }

    public static void main(String[] args) {
        int[] array = {12,45,67,88,-19};
        System.out.println(findSmallestInt(array));
    }
}

//import java.util.stream.IntStream;
//
//public class SmallestIntegerFinder {
//    public static int findSmallestInt(int[] args) {
//        return IntStream.of(args).min().getAsInt();
//    }
//}

//import java.util.Arrays;
//public class SmallestIntegerFinder {
//    public static int findSmallestInt(int[] args) {
//        Arrays.sort(args);
//        return args[0];
//    }
//}