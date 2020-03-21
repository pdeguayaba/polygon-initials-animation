import java.awt.Polygon;

/*
 * Nombre  : Edwin J Estrella Ayala
 * ID      : A00549508
 * Curso   : COMP3600
 * Asig Animaciones Multiples
 */

public class HuecoDeLaA {
    
    Polygon p;
    
    HuecoDeLaA(int x, int y) {
        int step = 20;
        p = new Polygon();
        p.addPoint((int) (x + step * 1.375), y - step * 2);
        p.addPoint((int) (x + step * 1.5), y - step * 3);
        p.addPoint((int) (x + step * 1.625), y - step * 2);
    }
    
    public Polygon get_p() {
        return p;
    }
}