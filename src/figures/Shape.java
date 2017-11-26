package figures;


public class Shape {

    int x;
    int y;

    @Override
    public String toString() {
        return "Center: " + x + " " + y;
     }

    public Shape ( int initialX, int initialY ) {
        x = initialX;
        y = initialY;
    }

    public double square(){
        return  0;
    }

}
