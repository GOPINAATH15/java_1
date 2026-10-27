package java_lab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CustomShapeFrame extends JFrame implements ActionListener {
    String selectedShape = "None";
    Color selectedColor = Color.BLACK;

    public CustomShapeFrame(int width, int height, int x, int y) {
        setTitle("Custom Shape Drawer");
        setSize(width, height);
        setLocation(x, y);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create menu bar
        JMenuBar menuBar = new JMenuBar();

        // Shape menu
        JMenu shapeMenu = new JMenu("Shapes");
        String[] shapes = {"Line", "Rectangle", "Oval"};
        for (String shape : shapes) {
            JMenuItem item = new JMenuItem(shape);
            item.addActionListener(this);
            shapeMenu.add(item);
        }

        // Color menu
        JMenu colorMenu = new JMenu("Colors");
        JMenuItem red = new JMenuItem("Red");
        JMenuItem blue = new JMenuItem("Blue");
        JMenuItem green = new JMenuItem("Green");

        red.addActionListener(this);
        blue.addActionListener(this);
        green.addActionListener(this);

        colorMenu.add(red);
        colorMenu.add(blue);
        colorMenu.add(green);

        menuBar.add(shapeMenu);
        menuBar.add(colorMenu);
        setJMenuBar(menuBar);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(selectedColor);

        switch (selectedShape) {
            case "Line":
                g.drawLine(50, 100, 250, 100);
                break;
            case "Rectangle":
                g.fillRect(50, 120, 200, 80);
                break;
            case "Oval":
                g.fillOval(50, 120, 200, 80);
                break;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if (cmd.equals("Line") || cmd.equals("Rectangle") || cmd.equals("Oval")) {
            selectedShape = cmd;
        } else if (cmd.equals("Red")) {
            selectedColor = Color.RED;
        } else if (cmd.equals("Blue")) {
            selectedColor = Color.BLUE;
        } else if (cmd.equals("Green")) {
            selectedColor = Color.GREEN;
        }

        repaint();
    }

    public static void main(String[] args) {
        CustomShapeFrame frame = new CustomShapeFrame(500, 400, 200, 200);
        frame.setVisible(true);
    }
}