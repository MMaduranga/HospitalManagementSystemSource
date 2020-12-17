package Classes.MainClasses;
import Classes.SubClasses.Main;
import Classes.SubClasses.Main;
import java.io.File;
import java.time.LocalDate;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Minushi
 */
public class PostalMail extends Main {
    
    private int referenceNo;
    private LocalDate currentDate;
    private File attachDoc;
    private String note;
    
    public PostalMail(int referenceNo, LocalDate currentDate, File attachDoc, String note) {
        this.setCurrentDate(currentDate);
        this.setNote(note);
        this.setReferenceNo(referenceNo);
        this.setattachDoc(attachDoc);
    }

    //getters
    public File getAttachDoc() {
        return this.attachDoc;
    }
    
    public int getReferenceNo() {
        return this.referenceNo;
    }
    
    public LocalDate getCurrentDate() {
        return this.currentDate;
    }
    
    public String getNote() {
        return this.note;
    }

    //setters
    public void setattachDoc(File AttachDoc) {
        this.attachDoc = AttachDoc;
    }
    
    public void setReferenceNo(int referenceNo) {
        this.referenceNo = referenceNo;
    }
    
    public void setCurrentDate(LocalDate currentDate) {
        this.currentDate = currentDate;
    }
    
    public void setNote(String note) {
        this.note = note;
    }
    
}
