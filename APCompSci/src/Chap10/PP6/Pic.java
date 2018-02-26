package Chap10.PP6;

import javax.swing.*;
import java.awt.*;

public class Pic extends JPanel {
    static public int[] sort;
    public Pic(int[] sort) {
        this.sort=sort;
    }
    public void paintComponent(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 1260,890);
        g.setColor(Color.magenta);
        for (int i = 0; i < sort.length; i++) {
            g.fillRect(i+1, 10, 1, (int) sort[i]/2);
        }

    }
}

