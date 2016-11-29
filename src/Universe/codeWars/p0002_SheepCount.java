package Universe.codeWars;

public class p0002_SheepCount {

    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int counter = 0;
        for (Boolean i : arrayOfSheeps) if (i) counter++;
        return counter;
    }

    public static void main(String[] args) {
        Boolean array[] = {true, false, true, true};
        System.out.println(countSheeps(array));

    }
}
