package Iterfaces;

/**
 * Created by Edgaras on 06/06/2016.
 */
public class Rectangle implements Shape {

    public double width;
    public double height;

    public Rectangle (double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    //implemented methods
    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2.0 * (width + height);
    }
}
