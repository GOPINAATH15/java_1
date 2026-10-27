package image;

import javax.swing.*;

public class ImageViewertest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java Bean Image Viewer");
        ImageViewerBean viewer = new ImageViewerBean();
        
        viewer.setImagePath("C:/Users/asus/Downloads/7447.jpg"); // 🔁 Change to your image path

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 500);
        frame.add(viewer);
        frame.setVisible(true);
    }
}
