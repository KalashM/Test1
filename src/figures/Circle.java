package figures;

public class Circle extends Shape {

    int radius;


    public Circle(int initialX, int initialY, int initialRadius) {
        super(initialX, initialY);
        radius = initialRadius;
    }

    public double square() {
        double circleSquare =3.14*radius*radius;
        return circleSquare;
    }
}
