package figures;

public class Rectangle extends Shape {

    int sideA;
    int sideB;

    public Rectangle (int initialX, int initialY, int initislSideA, int initislSideB){
        super(initialX, initialY);
        sideA = initislSideA;
        sideB = initislSideB;
    }

    public double square(){
        double rectangleSquare = sideA*sideB;
        return rectangleSquare;
    }
}
