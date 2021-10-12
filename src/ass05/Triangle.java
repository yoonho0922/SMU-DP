package ass05;

import java.awt.*;

public class Triangle extends Shape {

    public Triangle(String type, Point[] points) {
        super(type, points);
    }

    @Override
    public double calcArea() {
        double width = Math.abs(points[1].getX() - points[2].getX());
        double height = Math.abs(points[0].getY() - points[1].getY());
        return width*height/2;
    }
}
