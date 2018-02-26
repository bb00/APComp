package Chap7.Exercises;

import java.awt.*;
import javax.swing.*;

public class EX6 extends JPanel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Border Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        EX6 panel = new EX6();
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void drawCircle(Graphics context, int x, int y, int radius, Color colour) {
        context.setColor(colour);
        context.drawOval(x, y, radius, radius);
    }
    @Override
    public void paintComponent(Graphics g) {
    drawCircle(g, 50, 50, 25, Color.BLUE);
  }

}
