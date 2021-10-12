package ass05;

import java.awt.*;

public interface ShapeFactory {

    public Shape create(String type, Point[] points);
}
