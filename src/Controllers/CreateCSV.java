package Controllers;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;

public class CreateCSV {

    public void writeInCSVFile(File fileLocation, ArrayList<String> totalLinesInFile) {
        try {
            PrintWriter write = new PrintWriter(fileLocation);
            String strParagraphContent = String.format("%s,%s,%s,%s\n", "NO", "NAME", "USER NAME", "PASSWORD");
            for (int count = 0; count < totalLinesInFile.size(); count++) {
                String[] strLineContent = totalLinesInFile.get(count).split("~");
                strParagraphContent += String.format("%d,%s,%s,%s\n", count + 1,
                        strLineContent[3], strLineContent[1], strLineContent[2]);
            }
            write.write(strParagraphContent);
            write.close();
        } catch (Exception e) {
        }
    }

    public void writeInCSVFile(File fileLocation, String totalLines) {
        try {
            PrintWriter write = new PrintWriter(fileLocation);

            write.write(totalLines);
            write.close();
        } catch (Exception e) {
        }
    }
}
