package Chapter1;

import javax.swing.*;
import java.awt.*;

public class MyFirstApplet extends JPanel {
    // 绘画方法
    public void paintComponent(Graphics g){
        g.drawString("Im practicing!", 100, 100);
    }

    // main方法
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        MyFirstApplet panel = new MyFirstApplet();

        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
