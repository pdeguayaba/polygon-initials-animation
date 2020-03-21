import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import javax.swing.Timer;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.logging.*;

/*
 * Nombre  : Edwin J Estrella Ayala
 * ID      : A00549508
 * Curso   : COMP3600
 * Asig Animaciones Multiples
 */

public class PolygonsJPanel extends JPanel implements ActionListener {
    /*
     *  Clase Timer para hacerlo ciclico
     */
    Timer timer = new Timer(100, this);
    
    /*
     *  Declaracion de variables
     */
    double rotation;
    double rotation1;
    double sizeOfA;
    double setpOfA;
    double sizeOfJ;
    double setpOfJ;
    double rotationOfX;
    double rotationOfY;
    
    AffineTransform transform;
    AffineTransform transform1;
    AffineTransform transform2;
    AffineTransform transform3;
    AffineTransform transform4;
    
    /*
     * Inicializacion de variables
     */
    public PolygonsJPanel() {
        timer = new Timer(50, this);
        timer.start();
        rotation = 0;
        rotation1 = 0;
        sizeOfA = 1;
        setpOfA = 0.05;
        sizeOfJ = 0;
        setpOfJ = 0.05;
        rotationOfX = 0;
        rotationOfY = 0;
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        /*
         *  Objeto para la letra E
         */
        LetraE e = new LetraE(0, 0);
        g.setColor(Color.red);

        Graphics2D g2d = (Graphics2D)g; 
        /*
         * Transformaciones a la letra E para rotar alrededor de las iniciales
         */
        transform4 = new AffineTransform();
        transform4.translate(400, 300);
        // Rotar con la variable rotation que cambia ciclicamente
        transform4.rotate(rotation);
        transform4.translate(100, 100);
        
        g2d.transform(transform4);
        
        /*
         * Transformacion de E para rotar sobre su propio eje
         */
        transform = new AffineTransform();
        // Rotar con centro (0, 0) y rotation1
        transform.rotate(rotation1, 0, 0);
        transform.translate(0, 0);

        g2d.transform(transform);  
        
        // Dibjuar la Letra E
        g2d.fillPolygon(e.get_p());
        
        /*
         * Crear el transform1 sin afectar otras transformaciones
         */
        try {
            transform1 = g2d.getTransform().createInverse();
        } catch (NoninvertibleTransformException ex) {
            Logger.getLogger(PolygonsJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        /*
         * Objeto para la letra J
         * *************************
         * EN ESTA PARTE NO LOGRE  *
         * EL EFECTO QUE PIDE LAN  *
         * ASIGNACION.             *
         * *************************
         */
        LetraJ j = new LetraJ(0, 0);
        g.setColor(Color.black);

        Graphics2D g2d1 = (Graphics2D)g;
        transform1.translate(400, 350);
        transform1.scale(1, 1);
        transform1.shear(sizeOfJ, 0);

        g2d1.transform(transform1);
        // Dibujar la Letra J
        g2d1.fillPolygon(j.get_p());
        
        /*
         * Crear el transform2 sin afectar otras transformaciones
         */
        try {
            transform2 = g2d.getTransform().createInverse();
        } catch (NoninvertibleTransformException ex) {
            Logger.getLogger(PolygonsJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        /*
         * Objeto para la letra A
         */
        LetraA a = new LetraA(0, 0);
        g.setColor(Color.blue);

        Graphics2D g2d2 = (Graphics2D)g;
        transform2.translate(600, 350);
        transform2.scale(sizeOfA, sizeOfA);

        g2d2.transform(transform2);
        // Dibujar parte de la Letra A
        g2d2.fillPolygon(a.get_p());
        
        /*
         * Crear el transform3 sin afectar otras transformaciones
         */
        try {
            transform3 = g2d2.getTransform().createInverse();
        } catch (NoninvertibleTransformException ex) {
            Logger.getLogger(PolygonsJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        /*
         * Resto de la letra A (Hueco)
         */
        HuecoDeLaA at = new HuecoDeLaA(0, 0);

        Graphics2D g2d3 = (Graphics2D)g;
        g2d2.setColor(Color.white);

        transform2.translate(700, 400);

        transform2.scale(sizeOfA, sizeOfA);
        // Dibuja el hueco de la Letra A
        g2d2.fillPolygon(at.get_p());
    }
    
    public void actionPerformed(ActionEvent e) {
        /*
         * Cambia el size de la letra A
         */
        if(sizeOfA < 1 || sizeOfA > 2)
            setpOfA = -setpOfA;
        sizeOfA += setpOfA;
        
        /*
         * Cambios a la letra J
         */
        if(sizeOfJ < -1 || sizeOfJ > 0)
            setpOfJ = -setpOfJ;
        sizeOfJ += setpOfJ;
        
        /*
         * Rotacion de E alrededor de las letras
         */
        rotation -= Math.PI / 64;
        /*
         * Rotacion de E sobre su propio eje
         */
        rotation1 += Math.PI / 4;
        repaint();
    }
}