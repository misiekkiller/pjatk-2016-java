package Universe.oracleAssociateSample;
import java.util.*;

public class App {
    public static void main(String[] args) {
        List p = new ArrayList();
        p.add(7);
        p.add(1);
        p.add(5);
        p.add(1);
        p.remove(1);
        System.out.println(p);
    }
}

/**
    What is the result?
        A)[7, 1, 5, 1]
        B)[7, 5, 1]
        C)[7, 5]
        D)[7, 1]
 */