import java.awt.Polygon;

/*
 * Nombre  : Edwin J Estrella Ayala
 * ID      : A00549508
 * Curso   : COMP3600
 * Asig Animaciones Multiples
 */

public class LetraJ {
    
    Polygon p;
    
    LetraJ(int x, int y) {
        int step = 20;
        p = new Polygon();
        p.addPoint(x, y);
        p.addPoint(x, y - step * 2);
        p.addPoint(x + step, y - step * 2);
        p.addPoint(x + step, y - step);
        p.addPoint((int) (x + step * 1.5), y - step);
        p.addPoint((int) (x + step * 1.5), y - step * 3);
        p.addPoint(x, y - step * 3);
        p.addPoint(x, y - step * 4);
        p.addPoint(x + step * 4, y - step * 4);
        p.addPoint(x + step * 4, y - step * 3);
        p.addPoint((int) (x + step * 2.5), y - step * 3);
        p.addPoint((int) (x + step * 2.5), y);
    }
    
    public Polygon get_p() {
        return this.p;
    }
}
