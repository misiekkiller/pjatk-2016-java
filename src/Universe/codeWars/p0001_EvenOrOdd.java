package Universe.codeWars;

public class p0001_EvenOrOdd {

    public static String even_or_odd(int number) {      // clever bitwise solution (not a number % 2 == 0 kind of thing)
        return (number & 1) == 0 ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        System.out.println(even_or_odd(3));
    }
}

