
import java.io.File;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Minushi
 */
public class PostalMail {
    private int referenceNo;
    private Date currentDate;
    private File attachDoc;
    private String note;
    
    //getters
    public int getReferenceNo(){
    return this.referenceNo;
    }
    
    public Date getCurrentDate(){
    return this.currentDate;
    }
    
    public String getNote(){
        return this.note;
    }
    
    //setters
    
    public void setReferenceNo(int referenceNo){
        this.referenceNo= referenceNo;
    }
    
    public void setCurrentDate(Date currentDate){
        this.currentDate= currentDate;
    }
    
    public void setNote(String note){
        this.note= note;
    }
    
   
    public PostalMail(int referenceNo, Date currentDate, String Note){
        this.referenceNo= referenceNo;
        this.note=Note;
        this.currentDate=currentDate;
    }
    
}