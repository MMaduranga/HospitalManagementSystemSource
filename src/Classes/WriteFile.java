package Classes;

import Classes.Visitor;
import Classes.User;
import java.io.File;

import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class WriteFile {

    public void WriteInFile(Visitor visitor, File filelocation) {
        try {
            FileWriter file = new FileWriter(filelocation, true);
            PrintWriter write = new PrintWriter(file);
            write.print(visitor + "\n");
            file.close();
            write.close();

        } catch (IOException e) {
        }
    }

    public void WriteInUsersFile(User user, File filelocation) {
        try {
            FileWriter file = new FileWriter(filelocation, true);
            PrintWriter write = new PrintWriter(file);
            write.print(user + "\n");
            file.close();
            write.close();

        } catch (IOException e) {
        }
    }
}
