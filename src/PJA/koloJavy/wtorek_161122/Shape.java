package PJA.koloJavy.wtorek_161122;

public abstract class Shape {
    int x;
    int y;

    public Shape(int x, int y){
        this.x=y;
        this.y=y;
    }
    public abstract int pole(); //metoda abstrakcyjna (nigdy nie może być statyczna, nie mamy jej ciała)

    public int jakasMethoda() {
        return -1;
    }

}

//klasa abstrakcyjna to szablon,
