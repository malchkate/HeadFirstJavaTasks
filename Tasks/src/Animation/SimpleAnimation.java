package Animation;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Katerina on 11.04.2018.
 * From page 414 (Java HeadFirst)
 */
public class SimpleAnimation {
    int x = 70;
    int y = 70;

    public static void main(String[] args) {
        SimpleAnimation gui = new SimpleAnimation();
        gui.go();
    }

    private void go() {
        JFrame frame =  new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawPanel drawPanel = new MyDrawPanel();
        frame.getContentPane().add(drawPanel);
        frame.setSize(300, 300);
        frame.setVisible(true);

        for (int i = 0; i < 130; i++){
            x++;
            y++;
            drawPanel.repaint();
            try {
                Thread.sleep(50);
            } catch (Exception ex) {}
        }

    }

    class MyDrawPanel extends JPanel{
        public void paintComponent(Graphics g){
            // Making prev oval "invisible"
            g.setColor(Color.white);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());
            // Drawing new one
            g.setColor(Color.green);
            g.fillOval(x,y,40,40);
        }
    }

}
