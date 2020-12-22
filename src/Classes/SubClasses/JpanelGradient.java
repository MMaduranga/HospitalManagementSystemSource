package Classes.SubClasses;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class JpanelGradient extends JPanel {

    private Color firstColor;
    private Color secondColor;
    private int count;

    public JpanelGradient(Color first, Color second, int count) {
        this.firstColor = first;
        this.secondColor = second;
        this.count = count;
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        int width = getWidth();
        int height = getHeight();
        GradientPaint gp;
        if (count == 1) {
            gp = new GradientPaint(0, 0, firstColor, 600, height, secondColor);
        } else {
            gp = new GradientPaint(0, 0, secondColor, 700, width, firstColor);
        }
        g2D.setPaint(gp);
        g2D.fillRect(0, 0, width, height);

    }
}
