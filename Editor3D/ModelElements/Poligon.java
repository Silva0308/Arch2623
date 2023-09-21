package Editor3D.ModelElements;

import java.util.ArrayList;
import java.util.List;

import Editor3D.Staff.Point3D;

/**
 * Класс - модель полигона.
 */
public class Poligon {
    public List<Point3D> points = new ArrayList<Point3D>();
    
    /**
     * конструктор
     *
     * @param point
     */
    public Poligon(Point3D point) {
        points.add(point);
    }
}