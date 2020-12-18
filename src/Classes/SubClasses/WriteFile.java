package Classes.SubClasses;

import java.io.File;

import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import Classes.SubClasses.FileSecurity;
import java.util.ArrayList;

public class WriteFile {

    public void WriteInFile(Main writingObj, File filelocation) {
        FileSecurity fileSecuryty = new FileSecurity(filelocation.toString());

        try {
            FileWriter file = new FileWriter(fileSecuryty.setFilePathToTxt(), true);
            PrintWriter write = new PrintWriter(file);

            write.print(writingObj + "\n");
            file.close();
            write.close();
            fileSecuryty.setFilePathMOV();
        } catch (IOException e) {
        }
    }

    public void WriteInFile(String line, File filelocation) {
        FileSecurity fileSecuryty = new FileSecurity(filelocation.toString());
        try {
            FileWriter file = new FileWriter(fileSecuryty.setFilePathToTxt(), true);
            PrintWriter write = new PrintWriter(file);
            write.print(line + "\n");
            file.close();
            write.close();
            fileSecuryty.setFilePathMOV();
        } catch (IOException e) {
        }
    }

    public void UserLog(String username, String userType) {

        try {
            FileSecurity fileSecuryty = new FileSecurity("src\\TxtFiles\\UserLog.mov");
            FileWriter file = new FileWriter(fileSecuryty.setFilePathToTxt(), true);
            PrintWriter write = new PrintWriter(file);

            write.print("Date:" + LocalDate.now() + " Time:" + LocalDateTime.now().toLocalTime() + " UserName:" + username + " UserMode:" + userType + "\n");
            file.close();
            write.close();
            fileSecuryty.setFilePathMOV();
        } catch (IOException e) {
        }

    }

    public void setStaffId() {

        try {
            FileSecurity fileSecuryty = new FileSecurity("src\\TxtFiles\\StaffIdNo.mov");
            int intNewStaffIdNo = new ReadFile().getStaffIdNo() + 1;
            FileWriter file = new FileWriter(fileSecuryty.setFilePathToTxt());
            PrintWriter write = new PrintWriter(file);
            write.print(intNewStaffIdNo);
            file.close();
            write.close();
            fileSecuryty.setFilePathMOV();
        } catch (IOException e) {
        }
    }

    public void AddpdownListItem(ArrayList<String> strNewItem, File fileLocation) {
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
