package Universe.oracleAssociateSample;

public class Calculator {
    int num = 100;
    public void calc(int num) {
        this.num = num * 10;
    }
    public void printNum(){
        System.out.println(num);
    }
    public static void main(String[] args) {
        Calculator obj = new Calculator ();
        obj.calc(2);
        obj.printNum();
    }
}

/** What is the result?
        A) 20
        B) 100
        C) 1000
        D) 2
 */