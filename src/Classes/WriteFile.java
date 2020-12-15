package Classes;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import java.io.File;

import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class WriteFile {

    public void WriteInFile(Main writingObj, File filelocation) {
        try {
            FileWriter file = new FileWriter(filelocation, true);
            PrintWriter write = new PrintWriter(file);
            write.print(writingObj + "\n");
            file.close();
            write.close();

        } catch (IOException e) {
        }
    }

    /* public void WriteInFile(DispatchPostalMail dispatchPostalMail) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    public void WriteInFile(String line, File filelocation) {
        try {
            FileWriter file = new FileWriter(filelocation, true);
            PrintWriter write = new PrintWriter(file);
            write.print(line + "\n");
            file.close();
            write.close();

        } catch (IOException e) {
        }
    }

    public void UserLog(String username, String userType) {
        try {
            FileWriter file = new FileWriter("src\\TxtFiles\\UserLog.txt", true);
            PrintWriter write = new PrintWriter(file);
            write.print("Date:" + LocalDate.now() + " Time:" + LocalDateTime.now().toLocalTime()
                    + " UserName:" + username + " UserMode:" + userType + "\n");
            file.close();
            write.close();

        } catch (IOException e) {
        }

    }
}
