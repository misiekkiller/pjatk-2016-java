package PJA.koloJavy.wtorek_161122;

public class Main {

    public static void main(String[] args) {
        OuterClass zewnetrzna = new OuterClass();
        OuterClass.InnerClass wewnetrzna = zewnetrzna.new InnerClass();
        wewnetrzna.printSomething();

        System.out.println();

        Pies hauczer = new Pies();
        Kot muczer = new Kot();

        String dzwiekPsa = hauczer.wydajDzwiek();
        System.out.println(dzwiekPsa);
        System.out.println(muczer.wydajDzwiek());
    }

    class Circle extends Square {
        public Circle(int x, int y, int sciana) {
            super(x, y, sciana);
        }
    }

}


// albo metoda statyczna, albo obiekt ktory posiada ta metode i na tym obiekcie uzyc tej metody ! Inaczej metoda nie zadziała

