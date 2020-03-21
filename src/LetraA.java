import java.awt.Polygon;

/*
 * Nombre  : Edwin J Estrella Ayala
 * ID      : A00549508
 * Curso   : COMP3600
 * Asig Animaciones Multiples
 */

public class LetraA {
    
    Polygon p;
    
    LetraA(int x, int y) {
        int step = 20;
        p = new Polygon();
        p.addPoint(x, y);
        p.addPoint(x + step, y - step * 4);
        p.addPoint(x + step * 2, y - step * 4);
        p.addPoint(x + step * 3, y);
        p.addPoint(x + step * 2, y);
        p.addPoint((int) (x + step * 1.75), y - step);
        p.addPoint((int) (x + step * 1.25), y - step);
        p.addPoint((int) (x + step), y);
    }
    
    public Polygon get_p() {
        return p;
    }
}
