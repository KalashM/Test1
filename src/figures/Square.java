package figures;

public class Square extends Shape {

    int side;

    public Square(int initialX, int initialY, int initialSide) {
        super(initialX, initialY);
        side = initialSide;
    }


    public double square() {
        double squareSquare = side*side;
        return squareSquare;
    }

}
