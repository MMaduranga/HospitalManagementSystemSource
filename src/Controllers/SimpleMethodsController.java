package Controllers;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
//SimpleMethodsController.java
public class SimpleMethodsController {

    public File fileChooser() {//set visible a file chooser
        JFileChooser choosefile = new JFileChooser();

        choosefile.showOpenDialog(null);
        File file = new File(choosefile.getSelectedFile().getAbsolutePath());
        return file;
    }

   

    public void changeFilesLocation(JTextField textField) {//change the users uploading file location by making a copy of it
        String strPath = textField.getText();

        textField.setText(this.changeFilesLocation(strPath));
    }

    public String changeFilesLocation(String strPath) {

        String[] strPathArray = strPath.split("\\\\");

        new ChangeFileDestination().copydir(new File(strPath), new File("src\\UsersDocuments"
                + "\\" + strPathArray[strPathArray.length - 1]));
        return "src\\UsersDocuments\\" + strPathArray[strPathArray.length - 1];
    }

    public LocalDate typeCastDateToLocalDate(com.toedter.calendar.JDateChooser datechooser) {//change the type of date to local date
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return LocalDate.parse(dateFormat.format(datechooser.getDate()));
    }
}
