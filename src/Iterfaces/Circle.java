package Iterfaces;

/**
 * Created by Edgaras on 06/06/2016.
 */
public class Circle implements Shape {

    private double radius;


    public Circle (double radius)
    {
        this.radius = radius;
    }
    //methods that are implemented
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2.0 * Math.PI * radius;
    }
}
