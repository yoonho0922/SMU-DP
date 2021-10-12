package ass05;

import java.awt.*;

public class Rectangle extends Shape {

    public Rectangle(String type, Point[] points) {
        super(type, points);
    }

    @Override
    public double calcArea() {
        double width = Math.abs(points[0].getX()-points[1].getX());
        double height = Math.abs(points[0].getY()-points[1].getY());
        return width*height;
    }
}
