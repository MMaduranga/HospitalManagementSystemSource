
import java.io.File;
import java.time.LocalDate;
import java.time.LocalTime;

public  class Visitor {

    private String purpose;
    private String name;
    private String idNo;
    private LocalDate date;
    private LocalTime inTime;
    private LocalTime outTime;
    private File attachDoc;
    private String note;

    
    
    
 //getters and setters   
    public String getPurpose() {
        return purpose;
    }
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
    public String getIdNo() {
        return idNo;
    }
    public void setIdNO(String idNo) {
        this.idNo = idNo;
    }

    
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }

    
    public LocalTime getInTime() {
        return inTime;
    }
    public void setInTime(LocalTime inTime) {
        this.inTime = inTime;
    }

    
    public LocalTime getOutTime() {
        return outTime;
    }
    public void setOutTime(LocalTime outTime) {
        this.outTime = outTime;
    }

    
    public File getAttachDoc(){
        return attachDoc;
    }
    public void setAttachDoc(File attachDoc){
        this.attachDoc = attachDoc;
    }
    
    
    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }

    
}
