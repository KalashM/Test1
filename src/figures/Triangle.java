package figures;

public class Triangle extends Shape {

    int h;
    int base;

    public Triangle (int initialX, int initialY, int initialH, int initialBase ) {
        super(initialX, initialY);
        h = initialH;
        base = initialBase;
    }
    public double square (){
        double triangleSquare = 0.5*h*base;
        return triangleSquare;
    }
}
