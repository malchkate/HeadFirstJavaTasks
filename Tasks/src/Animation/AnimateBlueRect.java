package Animation;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Katerina on 12.04.2018.
 */
public class AnimateBlueRect {

    int x = 1;
    int y = 1;

    public static void main(String[] args) {
        AnimateBlueRect gui = new AnimateBlueRect();
        gui.go();
    }

    private void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyDrawP drawP = new MyDrawP();
        frame.getContentPane().add(drawP);
        frame.setSize(500, 270);
        frame.setVisible(true);
        for (int i = 0; i < 124; i++, y++, x++){
            x++;
            drawP.repaint();
            try {
                Thread.sleep(50);
            } catch (Exception ex) {}
        }
    }

    class MyDrawP extends JPanel{
        public void paintComponent(Graphics g){
            g.setColor(Color.WHITE);
            g.fillRect(0,0, 500, 250);
            g.setColor(Color.BLUE);
            g.fillRect(x,y,500 - 2*x, 250 - 2*y);
        }
    }
}
