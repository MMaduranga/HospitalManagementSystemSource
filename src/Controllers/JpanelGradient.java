package Controllers;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
//JpanelGradient.java
public class JpanelGradient extends JPanel {

    private Color firstColor;
    private Color secondColor;
    private int count;

    public JpanelGradient(Color first, Color second, int count) {//set the colors wich in parameters
        this.firstColor = first;
        this.secondColor = second;
        this.count = count;
    }

    @Override
    protected void paintComponent(Graphics g) {//make the color gradient and set it in panel
        Graphics2D g2D = (Graphics2D) g;
        int width = getWidth();
        int height = getHeight();
        GradientPaint gp;
      
            gp = new GradientPaint(0, 0, firstColor, this.count, height, secondColor);
        
        g2D.setPaint(gp);
        g2D.fillRect(0, 0, width, height);

    }
}
