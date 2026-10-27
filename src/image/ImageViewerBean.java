package image;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.beans.*;

public class ImageViewerBean extends JPanel implements java.io.Serializable {
    private BufferedImage image;

    public ImageViewerBean() {
        // Default constructor
    }

    public void setImagePath(String path) {
        try {
            image = ImageIO.read(new File(path));
            repaint();
        } catch (Exception e) {
            System.out.println("Image loading failed: " + e.getMessage());
        }
    }

    public String getImagePath() {
        return "";
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            int x = (getWidth() - image.getWidth()) / 2;
            int y = (getHeight() - image.getHeight()) / 2;
            g.drawImage(image, x, y, this);
        }
    }
}

