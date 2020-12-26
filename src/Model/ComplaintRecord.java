package Model;

import java.io.File;
import java.time.LocalDate;

/**
 *
 * @Erandika
 */
public class ComplaintRecord extends Main{
    //-----------------Variables------------------------

    private String complaintBy;
    private String complaintType;
    private String PhoneNo;
    private LocalDate currentDate;
    private String description;
    private String actionTaken;
    private String note;
    private File attachDoc;

    public ComplaintRecord(String complaintType, String complaintBy, String phoneNo,
            LocalDate date, String description, String actionTaken, String note, File attachDoc) {
this.setComplaintType(complaintType);
this.setComplaintBy(complaintBy);
this.setPhoneNo(phoneNo);
this.setCurrentDate(date);
this.setNote(note);
this.setDescription(description);
this.setActionTaken(actionTaken);
this.setAttachDoc(attachDoc);
    }
//------------------------Getters----------------------

    public String getComplaintType() {
        return this.complaintType;
    }

    public String getComplaintBy() {
        return this.complaintBy;
    }

    public String getNote() {
        return this.note;
    }

    public String getPhoneNo() {
        return this.PhoneNo;
    }

    public LocalDate getCurrentDate() {
        return this.currentDate;
    }

    public String getDescription() {
        return this.description;
    }

    public String getActionTaken() {
        return this.actionTaken;
    }

    public File getAttachDoc() {
        return this.attachDoc;
    }

//--------------------Setters-------------------------------
    public void setComplaintType(String complaintType) {
        this.complaintType = complaintType;
    }

    public void setComplaintBy(String complaintBy) {
        this.complaintBy = complaintBy;
    }

    public void setPhoneNo(String PhoneNo) {
        this.PhoneNo = PhoneNo;
    }

    public void setCurrentDate(LocalDate currentDate) {
        this.currentDate = currentDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setActionTaken(String actionTaken) {
        this.actionTaken = actionTaken;
    }

    public void setAttachDoc(File file) {
        this.attachDoc = file;
    }

    public void setNote(String note) {
        this.note = note;
    }
//other methods

    @Override
    public String toString() {
        return "|~" + this.getComplaintType() + "~" + this.getPhoneNo() + "~"
                + this.getComplaintBy() + "~" + this.getActionTaken() + "~" + this.getCurrentDate()
                + "~" + this.getDescription() + "~" + this.getNote() + "~" + this.getAttachDoc();
    }
}
