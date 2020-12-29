package Controllers;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;

//CreatePDF.java
public class CreatePDF{
    /*  public String arrangeParagraphLines(ArrayList<String> totalLinesInFile) {//arrange the data
    String strParagraphContent = String.format("%30s %30s %30s\n\n", "NAME", "USER NAME", "PASSWORD");
    for (int count = 0; count < totalLinesInFile.size(); count++) {
    String[] strLineContent = totalLinesInFile.get(count).split("~");
    strParagraphContent += String.format("%d. %25s %25s %25s\n", count + 1,
    strLineContent[3] + "\t", strLineContent[1] + "\t", strLineContent[2]);
    }
    return strParagraphContent;
    }*/
    public void writeInPDF(String strLine,String filePath) {//write int Pdf file
        Document document = new Document();
        try {
            PdfWriter write = PdfWriter.getInstance(document, new FileOutputStream(filePath, true));
            document.open();
            document.add(new Paragraph(strLine));
            document.close();
            write.close();

        } catch (Exception e) {
        }
    }
}
