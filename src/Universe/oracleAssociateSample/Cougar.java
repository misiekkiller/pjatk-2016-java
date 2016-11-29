package Universe.oracleAssociateSample;

class Feline {
    public String type = "f ";
    public Feline() {
        System.out.print("feline ");
    }
}
public class Cougar extends Feline {
    public Cougar() {
        System.out.print("cougar ");
    }
    void go() {
        type = "c ";
        System.out.print(this.type + super.type);
    }
    public static void main(String[] args) {
        new Cougar().go();
    }
}


/**What is the result?
        A) cougar c f
        B) feline cougar c c
        C) feline cougar c f
        D) Compilation fails.
*/