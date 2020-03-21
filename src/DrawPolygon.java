import javax.swing.JFrame;

/*
 * Nombre  : Edwin J Estrella Ayala
 * ID      : A00549508
 * Curso   : COMP3600
 * Asig Animaciones Multiples
 */

public class DrawPolygon {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Animaciones Multiples");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PolygonsJPanel polygonsJPanel = new PolygonsJPanel();
        frame.add(polygonsJPanel);
        frame.setSize(1280, 720);
        frame.setVisible(true);
    }
    
}
