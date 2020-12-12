package Classes;
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
    private int phoneNo;
//constructor
    public Visitor(String purpose,String name,String idNo,LocalDate date,
            LocalTime intime,LocalTime outtime,File attachdoc,String note,int phoneNo){
    this.setPurpose(purpose);
    this.setName(name);
    this.setDate(date);
    this.setIdNO(idNo);
    this.setAttachDoc(attachdoc);
    this.setInTime(intime);
    this.setOutTime(outtime);
    this.setNote(note);
    this.setPhoneNo(phoneNo);
    }
    
    
 //getters and setters
    public void setPhoneNo(int phoneNo){
    this.phoneNo=phoneNo;
    }
    public int getPhoneNo(){
    return this.phoneNo;
    }
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
//other methods
    @Override
    public String toString(){
    return "|~"+this.getPurpose()+"~"+this.getName()+"~"+this.getPhoneNo()+"~"
            +this.getIdNo()+"~"+this.getDate()+"~"+this.getInTime()+"~"+this.getOutTime()+
            "~"+this.getNote()+"~"+this.getAttachDoc();
    }
    
}
