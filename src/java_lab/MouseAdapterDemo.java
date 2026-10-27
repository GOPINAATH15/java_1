package java_lab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseAdapterDemo extends JFrame {

    JLabel label;

    public MouseAdapterDemo() {
        setTitle("MouseAdapter Demo");
        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("Move or click the mouse");
        label.setBounds(100, 100, 250, 30);
        add(label);

        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                label.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
            }

            public void mousePressed(MouseEvent e) {
                label.setText("Mouse Pressed");
            }

            public void mouseReleased(MouseEvent e) {
                label.setText("Mouse Released");
            }

            public void mouseEntered(MouseEvent e) {
                label.setText("Mouse Entered the Frame");
            }

            public void mouseExited(MouseEvent e) {
                label.setText("Mouse Exited the Frame");
            }
        });
    }

    public static void main(String[] args) {
        MouseAdapterDemo frame = new MouseAdapterDemo();
        frame.setVisible(true);
    }
}
