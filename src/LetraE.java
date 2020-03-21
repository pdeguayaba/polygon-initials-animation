import java.awt.Polygon;

/*
 * Nombre  : Edwin J Estrella Ayala
 * ID      : A00549508
 * Curso   : COMP3600
 * Asig Animaciones Multiples
 */

public class LetraE {
    
    Polygon p;
    
    LetraE(int x, int y) {
        int step = 20;
        p = new Polygon();
        p.addPoint(x, y);
        p.addPoint(x, y - step * 4);
        p.addPoint(x + step * 3, y - step * 4);
        p.addPoint(x + step * 3, y - step * 3);
        p.addPoint(x + step, y - step * 3);
        p.addPoint(x + step, (int) (y - step * 2.5));
        p.addPoint(x + step * 3, (int) (y - step * 2.5));
        p.addPoint(x + step * 3, (int) (y - step * 1.5));
        p.addPoint(x + step, (int) (y - step * 1.5));
        p.addPoint(x + step, y - step);
        p.addPoint(x + step * 3, y - step);
        p.addPoint(x + step * 3, y);
    }
    
    public Polygon get_p() {
        return p;
    }
}