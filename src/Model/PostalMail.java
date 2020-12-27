package Model;

import java.io.File;
import java.time.LocalDate;

/**
 *
 * @author Minushi
 */
abstract class PostalMail {
    
    //Declare vatiables 
    private String referenceNo;
    private LocalDate currentDate;
    private File attachDoc;
    private String note;
    
    //Parametrized Constructor
    public PostalMail(String referenceNo, LocalDate currentDate, File attachDoc, String note) {
        this.setCurrentDate(currentDate);
        this.setNote(note);
        this.setReferenceNo(referenceNo);
        this.setattachDoc(attachDoc);
    }

    //getters
    public File getAttachDoc() {
        return this.attachDoc;
    }
    
    public String getReferenceNo() {
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
    
    public void setReferenceNo(String referenceNo) {
        this.referenceNo = referenceNo;
    }
    
    public void setCurrentDate(LocalDate currentDate) {
        this.currentDate = currentDate;
    }
    
    public void setNote(String note) {
        this.note = note;
    }
    
}
