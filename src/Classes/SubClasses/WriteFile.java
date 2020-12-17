package Classes.SubClasses;

import java.io.File;

import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import Classes.SubClasses.FileSecurity;

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
}
