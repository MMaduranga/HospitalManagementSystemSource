package Classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import Classes.WriteFile;

public class ReadFile {

    String line;

    public String[] findObjLine(String primaryKey, File filelocation, int location) {
        String[] selectedObjDetails = null;

        try {
            FileReader readUserFile = new FileReader(filelocation);//open users file to read
            BufferedReader readFile = new BufferedReader(readUserFile);

            String strLine = readFile.readLine();//save 1st line of users file to a string

            while (strLine != null) {//compare the line is not equals to null
                String strNextLine = readFile.readLine();

                if (strLine.charAt(0) == '|' && strNextLine != null
                        && strNextLine.charAt(0) == '|' || strLine.charAt(0) == '|' && strNextLine == null) {//check the validation of 1st and 2nd lines

                    String[] strDetails = strLine.split("~");//users details stored in this array
                    if (strDetails[location].equals(primaryKey)) {
                        this.line = strLine;
                        selectedObjDetails = strDetails;
                        break;
                    }
                } else if (strLine.charAt(0) == '|' && strNextLine != null && strNextLine.charAt(0) != '|') {//check the validation of 1st and 2nd lines
                    String[] strDetails = (strLine + strNextLine).split("~");//visitor details stored in this array
                    if (strDetails[location].equals(primaryKey)) {
                        this.line = strLine + strNextLine;
                        selectedObjDetails = strDetails;
                        break;
                    }
                    strNextLine = readFile.readLine();//save next line to continue the loop
                }

                strLine = strNextLine;//save next line of the txt file to rotate
            }
            readUserFile.close();//close the opened file
            readFile.close();

        } catch (IOException e) {

        }

        return selectedObjDetails;
    }

    public void deleteObj(File fileLocation) {
        ArrayList<String> linesArray = new ArrayList<>();

        try {
            FileReader readUserFile = new FileReader(fileLocation);//open users file to read
            BufferedReader readFile = new BufferedReader(readUserFile);
            String strLine = readFile.readLine();//save 1st line of users file to a string
            while (strLine != null) {//compare the line is not equals to null
                linesArray.add(strLine);
                strLine = readFile.readLine();
            }

            readUserFile.close();//close the opened file
            readFile.close();
            fileLocation.delete();
            for (int count = 0; count < linesArray.size(); count++) {
                if (linesArray.get(count).equals(this.line)) {
                    continue;
                } else {
                    new WriteFile().WriteInFile(linesArray.get(count), fileLocation);
                }
            }
        } catch (Exception e) {
        }
    }
   

}
