package Controllers;

import java.io.File;

import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import Controllers.FileSecurity;
import java.util.ArrayList;
//WriteFile.java

public class WriteFile {

    public void WriteInFile(String line, File filelocation) {//write the objects of users in files

        try {
            FileSecurity fileSecuryty = new FileSecurity(filelocation.toString());
            FileWriter file = new FileWriter(fileSecuryty.setFilePathToTxt(), true);
            PrintWriter write = new PrintWriter(file);
            write.print(line + "\n");
            file.close();
            write.close();
            fileSecuryty.setFilePathMOV();
        } catch (IOException e) {
        }
    }

    public void writeInSavedUserFile(String line, File fileLocation) {//write the saved login data in saveduser file 
        try {
            FileSecurity fileSecuryty = new FileSecurity(fileLocation.toString());
            FileWriter file = new FileWriter(fileSecuryty.setFilePathToTxt());
            PrintWriter write = new PrintWriter(file);
            write.print(line);
            file.close();
            write.close();
            fileSecuryty.setFilePathMOV();
        } catch (Exception e) {
        }
    }

    public void UserLog(String username, String userType) {//write the user login details in the file

        try {
            FileSecurity fileSecuryty = new FileSecurity("src\\TxtFiles\\UserLog.mov");
            FileWriter file = new FileWriter(fileSecuryty.setFilePathToTxt(), true);
            PrintWriter write = new PrintWriter(file);

            write.print("|~" + LocalDate.now() + "~" + LocalDateTime.now().toLocalTime() + " ~" + username + "~" + userType + "\n");
            file.close();
            write.close();
            fileSecuryty.setFilePathMOV();
        } catch (IOException e) {
        }

    }

    public void setNumber(String filePath) {// write numbers in the file 

        try {
            FileSecurity fileSecuryty = new FileSecurity(filePath);
            int intNewStaffIdNo = new ReadFile().getNumber(filePath) + 1;
            FileWriter file = new FileWriter(fileSecuryty.setFilePathToTxt());
            PrintWriter write = new PrintWriter(file);
            write.print(intNewStaffIdNo);
            file.close();
            write.close();
            fileSecuryty.setFilePathMOV();
        } catch (IOException e) {
        }
    }

    public void AddpdownListItem(ArrayList<String> strNewItem, File fileLocation) {// write in dropdownlist item file for add new items
        try {
            FileSecurity fileSecuryty = new FileSecurity(fileLocation.toString());
            new File(fileSecuryty.setFilePathToTxt()).delete();

            FileWriter file = new FileWriter(fileSecuryty.setFilePathToTxt(), true);
            PrintWriter write = new PrintWriter(file);
            write.print(strNewItem.get(0));
            for (int count = 1; count < strNewItem.size(); count++) {
                write.print("~" + strNewItem.get(count));
            }
            file.close();
            write.close();
            fileSecuryty.setFilePathMOV();
        } catch (IOException e) {
        }
    }

}
