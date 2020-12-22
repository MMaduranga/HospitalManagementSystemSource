package Controllers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import Controllers.WriteFile;

public class ReadFile {

    String line;

    public String[] findObjLine(String primaryKey, File filelocation, int location) {
        String[] selectedObjDetails = null;

        try {
            FileSecurity fileSecurity = new FileSecurity(filelocation.toString());
            FileReader readUserFile = new FileReader(fileSecurity.setFilePathToTxt());//open users file to read
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
            fileSecurity.setFilePathMOV();
            readFile.close();

        } catch (IOException e) {

        }

        return selectedObjDetails;
    }

    public void deleteObj(File fileLocation) {
        ArrayList<String> linesArray = new ArrayList<>();

        try {
            FileSecurity fileSecurity = new FileSecurity(fileLocation.toString());
            FileReader readUserFile = new FileReader(fileSecurity.setFilePathToTxt());//open users file to read
            BufferedReader readFile = new BufferedReader(readUserFile);
            String strLine = readFile.readLine();//save 1st line of users file to a string
            while (strLine != null) {//compare the line is not equals to null
                linesArray.add(strLine);
                strLine = readFile.readLine();
            }

            readUserFile.close();//close the opened file
            readFile.close();
            new File(fileSecurity.setFilePathToTxt()).delete();
            for (int count = 0; count < linesArray.size(); count++) {
                if (linesArray.get(count).equals(this.line)) {
                    continue;
                } else {
                    new WriteFile().WriteInFile(linesArray.get(count), fileLocation);
                }
            }
            fileSecurity.setFilePathMOV();
        } catch (Exception e) {
        }
    }

    public int getNumber(String filePath) {
        int intStaffId = 0;
        try {
            FileSecurity fileSecurity = new FileSecurity(filePath);
            FileReader readUserFile = new FileReader(fileSecurity.setFilePathToTxt());//open users file to read
            BufferedReader readFile = new BufferedReader(readUserFile);
            intStaffId = Integer.valueOf(readFile.readLine());

            readUserFile.close();//close the opened file
            fileSecurity.setFilePathMOV();
            readFile.close();
        } catch (IOException e) {
        }
        return intStaffId;
    }

    public ArrayList<String> getItemsForDropdownList(File fileLocation) {
        String strDropDownListItems = "";
        String[] strDropDownListItemsArray;
        ArrayList<String> dropDownlistArray = new ArrayList<>();
        try {
            FileSecurity fileSecurity = new FileSecurity(fileLocation.toString());
            FileReader readUserFile = new FileReader(fileSecurity.setFilePathToTxt());//open users file to read
            BufferedReader readFile = new BufferedReader(readUserFile);
            String strLine = readFile.readLine();//save 1st line of users file to a string
            while (strLine != null) {
                strDropDownListItems += strLine;
                strLine = readFile.readLine();
            }
            readFile.close();
            fileSecurity.setFilePathMOV();
            readUserFile.close();
        } catch (IOException e) {
        }
        strDropDownListItemsArray = strDropDownListItems.split("~");
        for (int count = 0; count < strDropDownListItemsArray.length; count++) {
            dropDownlistArray.add(strDropDownListItemsArray[count]);
        }

        return dropDownlistArray;
    }

    public String readLoginSavedUser() {
        try {
            FileSecurity fileSecurity = new FileSecurity("src\\TxtFiles\\SavedUser.mov");
            FileReader readUserFile = new FileReader(fileSecurity.setFilePathToTxt());//open users file to read
            BufferedReader readFile = new BufferedReader(readUserFile);
            String strLine = readFile.readLine();
            readFile.close();
            fileSecurity.setFilePathMOV();
            readUserFile.close();
            return strLine;
        } catch (Exception e) {
            return null;
        }
    }

    public ArrayList<String> readTotalFile(File fileLocation) {
        ArrayList<String> totalRowsArray = new ArrayList<>();
        try {
            FileSecurity fileSecurity = new FileSecurity(fileLocation.toString());
            FileReader readUserFile = new FileReader(fileSecurity.setFilePathToTxt());//open users file to read
            BufferedReader readFile = new BufferedReader(readUserFile);
            String strLine = readFile.readLine();
            while (strLine != null) {//compare the line is not equals to null
                String strNextLine = readFile.readLine();

                if (strLine.charAt(0) == '|' && strNextLine != null
                        && strNextLine.charAt(0) == '|' || strLine.charAt(0) == '|' && strNextLine == null) {//check the validation of 1st and 2nd lines
                    totalRowsArray.add(strLine);
                } else if (strLine.charAt(0) == '|' && strNextLine != null && strNextLine.charAt(0) != '|') {
                    totalRowsArray.add(strLine + strNextLine);
                    strNextLine = readFile.readLine();
                }
                strLine = strNextLine;
            }
            readFile.close();
            fileSecurity.setFilePathMOV();
            readUserFile.close();
        } catch (IOException e) {
        }

        return totalRowsArray;
    }
}
