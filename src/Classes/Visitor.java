
import java.time.LocalDate;
import java.time.LocalTime;


public abstract class Visitor {
    private String purpose;
    private String name;
    private String idNo;
    private LocalDate date;
    private LocalTime inTime;
    private LocalTime outTime;
    private String note;
   
    public void setPurpose(String purpose){
        this.purpose = purpose;
    }
    public String getPurpose(){
        return purpose;
    }
  
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    
    public void setIdNO(String idNo){
        this.idNo = idNo;
    }
    public String getIdNo(){
        return idNo;
    }
    
    public void setDate(LocalDate date){
        this.date = date;
    }
    public LocalDate getDate(){
        return date;
    }

     public void setInTime(LocalTime inTime){
        this.inTime = inTime;
    }
    public LocalTime getInTime(){
        return inTime;
    }
    
     public void setOutTime(LocalTime outTime){
        this.outTime = outTime;
    }
    public LocalTime getOutTime(){
        return outTime;
    }
    
    public void setNote(String note){
        this.note = note;
    }
    public String getNote(){
        return note;
    }
 

    
}
    
    

