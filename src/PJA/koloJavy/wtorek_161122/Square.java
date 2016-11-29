package PJA.koloJavy.wtorek_161122;

public class Square extends Shape {
    int sciana;


    public Square(int x, int y, int sciana) {
        super(x, y);
        this.sciana=sciana;
    }

    @Override                       // implementacja
    public int pole() {
        return 0;
    }

    @Override
    public int jakasMethoda() {
        return 1;
    }
}
