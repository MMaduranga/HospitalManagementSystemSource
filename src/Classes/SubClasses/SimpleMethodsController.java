package Classes.SubClasses;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JTextField;

public class SimpleMethodsController {
    
    public File fileChooser() {
        JFileChooser choosefile = new JFileChooser();
      
        choosefile.showOpenDialog(null);
        File file = new File(choosefile.getSelectedFile().getAbsolutePath());
        return file;
    }
    
    public void addItemsToDropdown(ArrayList<String> strDropDownListItems, JComboBox comboBox) {
        
        for (int count = 0; count < strDropDownListItems.size(); count++) {
            comboBox.addItem(strDropDownListItems.get(count));
        }
        comboBox.setSelectedItem(null);
    }
    public void changeFilesLocation(JTextField textField) {
        String strPath = textField.getText();
        String[] strPathArray = strPath.split("\\\\");

        new ChangeFileDestination().copydir(new File(strPath), new File("src\\UsersDocuments"
                + "\\" + strPathArray[strPathArray.length - 1]));
        textField.setText("src\\UsersDocuments\\" + strPathArray[strPathArray.length - 1]);
    }
    public LocalDate typeCastDateToLocalDate(com.toedter.calendar.JDateChooser datechooser){
    DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
    return LocalDate.parse(dateFormat.format(datechooser.getDate()));
    }
}
