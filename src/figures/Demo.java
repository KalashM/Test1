package figures;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {

       Circle circle1 = new Circle(5, 7, 3);
       Square square1 = new Square(10,5, 3);
       Rectangle rectangle1 = new Rectangle(4,4, 8,10);
       Triangle triangle1 = new Triangle(2,1,8,9);

       ArrayList<Shape> shapes = new ArrayList<Shape>();
       shapes.add(circle1);
       shapes.add(square1);
       shapes.add(rectangle1);
       shapes.add(triangle1);

        System.out.println(shapes);

        for ( Shape i:shapes){
            System.out.println(i.square());
        }
    }
}
