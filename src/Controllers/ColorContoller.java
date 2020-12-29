package Controllers;

import java.awt.Color;
import javax.swing.JButton;
//ColorContoller.java
public class ColorContoller {

    private Color panelBackgroundColor;
    private Color fontBorderColor;
    private int modeNumber;

    public ColorContoller() {
        selectColorMode();
        setColors();
    }

    public int getModeNumber() {
        return modeNumber;
    }

    public void setModeNumber(int modeNumber) {
        this.modeNumber = modeNumber;
    }

    public void setPanelBackgroundColor(Color panelColor) {
        this.panelBackgroundColor = panelColor;
    }

    public void setFontBorderColor(Color fontColor) {
        this.fontBorderColor = fontColor;
    }

    public Color getPanelBackgroundColor() {
        return this.panelBackgroundColor;
    }

    public Color getFontBorderColor() {
        return this.fontBorderColor;
    }

    public void setColors() {//store the colors in veriables
        if (this.getModeNumber() % 2 == 0) {

            this.setFontBorderColor(new Color(255, 255, 255));
            this.setPanelBackgroundColor(new Color(70, 70, 70));
        } else {

            this.setFontBorderColor(new Color(0, 26, 51));
            this.setPanelBackgroundColor(new Color(255, 255, 255));
        }

    }

    public void selectColorMode() {//select the color theme by reading the file
        this.setModeNumber(new ReadFile().getNumber("src\\TxtFiles\\Colors.mov"));
    }

    public void setUpButton(JButton button) {//set the theme button text and icon
        if (this.getModeNumber() % 2 == 0) {
            button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_sun_30px.png")));
            button.setText("Light Theme                     ");
        } else {
            button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_night_30px.png")));
            button.setText("Dark Theme                     ");
        }
    }
}
