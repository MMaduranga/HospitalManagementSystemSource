package Controllers;

import java.awt.Color;

public class ColorContoller {

    private Color panelBackgroundColor;
    private Color fontColor;
    private Color buttonBackgroundColor;
    private Color componentBorderColor;

    public ColorContoller() {
        setColors();

    }

    public void setPanelBackgroundColor(Color panelColor) {
        this.panelBackgroundColor = panelColor;
    }

    public void setFontColor(Color fontColor) {
        this.fontColor = fontColor;
    }

    public void setButtonbackgroundColor(Color buttonColor) {
        this.buttonBackgroundColor = buttonColor;
    }

    public void setComponentBorderColor(Color borderColor) {
        this.componentBorderColor = borderColor;
    }

    public Color getPanelBackgroundColor() {
        return this.panelBackgroundColor;
    }

    public Color getFontColor() {
        return this.fontColor;
    }

    public Color getButtonBackgroundColor() {
        return this.buttonBackgroundColor;
    }

    public Color getComponentBorderColor() {
        return this.componentBorderColor;
    }

    public void setColors() {
        String[] colorList = new ReadFile().readLoginSavedUserAndColorFiles("src\\TxtFiles\\Colors.mov").split("~");

        String[] panelBackgroundColorCode = colorList[0].split(",");
        String[] fontColorCode = colorList[1].split(",");
        String[] buttonBackgroundColorCode = colorList[2].split(",");
        String[] componentBorderColorCode = colorList[3].split(",");

        this.setPanelBackgroundColor(new Color(Integer.valueOf(panelBackgroundColorCode[0]),
                 Integer.valueOf(panelBackgroundColorCode[1]), Integer.valueOf(panelBackgroundColorCode[2])));
        this.setButtonbackgroundColor(new Color(Integer.valueOf(buttonBackgroundColorCode[0]),
                 Integer.valueOf(buttonBackgroundColorCode[1]), Integer.valueOf(buttonBackgroundColorCode[2])));
        this.setFontColor(new Color(Integer.valueOf(fontColorCode[0]), Integer.valueOf(fontColorCode[1]),
                 Integer.valueOf(fontColorCode[2])));
        this.setComponentBorderColor(new Color(Integer.valueOf(componentBorderColorCode[0]),
                Integer.valueOf(componentBorderColorCode[1]), Integer.valueOf(componentBorderColorCode[2])));
    }
}
