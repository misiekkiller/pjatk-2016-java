package PJA.koloJavy.wtorek_161122;

public class OuterClass {
    private int numer = 1;

    public class InnerClass {
        private int numer = 10;

        public void printSomething() {
            System.out.println("someIntField = " + numer);
            System.out.println("this.someIntField = " + this.numer);
            System.out.println("OuterClass someIntField = " + OuterClass.this.numer);   // czym róznią się poszczególne linijki
        }
    }
}


// shadowing, przesłanianie wartosci klasy nadrzednej wartoscia klasy podrzednej.