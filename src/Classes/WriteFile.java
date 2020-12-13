package Classes;

import Classes.Visitor;
import Classes.User;
import Classes.ComplaintRecord;
import java.io.File;

import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

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

    public void WriteInFile(DispatchPostalMail dispatchPostalMail) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
