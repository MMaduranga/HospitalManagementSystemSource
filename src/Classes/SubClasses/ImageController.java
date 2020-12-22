package Classes.SubClasses;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ImageController {

    public void previewImage(String imagePath) {
        if (imagePath.length() != 0) {
            ImageIcon image = new ImageIcon(imagePath);
            Image resize = image.getImage();
            Image resizedImage = resize.getScaledInstance(900, 507, Image.SCALE_SMOOTH);
            image = new ImageIcon(resizedImage);
            JOptionPane.showMessageDialog(null, null, null, JOptionPane.INFORMATION_MESSAGE, image);
        } else {
            JOptionPane.showMessageDialog(null, "Select a Image");
        }
    }
}
