package ass05;

import java.awt.*;

public class Trapezoid extends Shape {

    public Trapezoid(String type, Point[] points) {
        super(type, points);
    }

    @Override
    public double calcArea() {
        double width = Math.abs(points[0].getX() - points[3].getX())
                + Math.abs(points[1].getX() - points[2].getX());
        double height = Math.abs(points[0].getY()-points[2].getY());

        return width*height/2;
    }
}
