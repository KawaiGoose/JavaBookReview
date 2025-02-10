package Chapter1;

import javax.swing.*;
import java.awt.*;

public class A_MyFirstApplet extends JPanel {
    // 绘画方法
    public void paintComponent(Graphics g){
        g.drawString("Im practicing!", 100, 100);
    }

    // main方法
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        A_MyFirstApplet panel = new A_MyFirstApplet();

        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
