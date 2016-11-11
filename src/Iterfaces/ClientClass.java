package Iterfaces;

/**
 * Created by Edgaras on 06/06/2016.
 */
public class ClientClass {

    public static void main(String[] args) {

        //creating array of shapes
        Shape [] shapes = new Shape[3];
        shapes[0] = new Rectangle(15,15);
        shapes[1] = new Triangle(25,25,25);
        shapes[2] = new Circle(10);

        for (int i = 0; i < shapes.length; i ++)
        {
            System.out.println("area = " + shapes[i].getArea() +
            ", perimeter = " + shapes[i].getPerimeter());
        }
    }
}
