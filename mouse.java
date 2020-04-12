import java.awt.MouseInfo;
import java.awt.Point;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class mouse extends JFrame {
    public mouse() {
        setSize(110,50);
        setResizable(false);
        setAlwaysOnTop(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel loc = new JLabel() ;
        add(loc);
        setVisible(true);
        while(true) {
            Point nl = MouseInfo.getPointerInfo().getLocation();
            loc.setText(" x: " + (int) nl.getX() + "  y: " + (int) nl.getY());
        }
    }
    
    public static void main(String[] args) {
        new mouse();
    }
}