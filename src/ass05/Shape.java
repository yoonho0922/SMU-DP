package ass05;

import java.awt.*;
import java.util.Arrays;

public abstract class Shape {
    protected Point[] points;
    private String type;

    public Shape(String type, Point[] points) {
        this.type = type;
        this.points = points;
    }

    public abstract double calcArea();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(type).append("\n");
        for (int i = 0; i < points.length; i++) {
            sb.append("P").append(i).append(": ").append(points[i].toString()).append("\n");
        }
        sb.append("area: ").append(calcArea()).append("\n");

        return sb.toString();
    }
}
