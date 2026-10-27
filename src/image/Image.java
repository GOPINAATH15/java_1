// 10th PROGRAM
import javax.swing.*;
import java.awt.*;
import java.io.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

class ImageViewerBean extends JPanel {
    BufferedImage img;

    void setImage(String path) {
        try {
            img = ImageIO.read(new File(path));
        } catch (Exception e) {
            System.out.println("Error loading image!");
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (img != null)
            g.drawImage(img, 80, 50, this);
    }
}

public class ImageViewerTest {
    public static void main(String[] args) {
        JFrame f = new JFrame("Image Viewer");
        ImageViewerBean viewer = new ImageViewerBean();
        viewer.setImage("C:\\Users\\Niyas\\Downloads\\sm3.jpg"); // change path

        f.add(viewer);
        f.setSize(500, 400);
        f.setVisible(true);
    }
}