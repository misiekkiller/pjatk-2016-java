package Universe.oracleAssociateSample;

public class MyStuff {
    String name;
    MyStuff(String n) {
        name = n;
    }
    public static void main(String[] args) {
        MyStuff m1 = new MyStuff("guitar");
        MyStuff m2 = new MyStuff("tv");
        System.out.println(m2.equals(m1));
    }
    public boolean equals(Object o) {
        MyStuff m = (MyStuff) o;
        return m.name != null;
    }
}

/**
 A) The output is true and MyStuff fulfills the Object.equals() contract.
 B) The output is false and MyStuff fulfills the Object.equals() contract.
 C) The output is true and MyStuff does NOT fulfill the Object.equals() contract.
 D) The output is false and MyStuff does NOT fulfill the Object.equals() contract
 */