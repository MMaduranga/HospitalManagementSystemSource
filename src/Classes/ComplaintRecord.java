/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Date;
import java.io.File;
import java.time.LocalDate;
/**
 *
 * @Erandika
 */
public class ComplaintRecord {
 //-----------------Variables------------------------
   private String complaintType;
   private int PhoneNo; 
   private LocalDate currentDate;
   private String description;
   private String actionTaken;
   private File file;
//------------------------Getters----------------------
    public String getComplaintType() {
        return this.complaintType;
    }

    public int getPhoneNo() {
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

    public File getFile() {
        return this.file;
    }
   
//--------------------Setters-------------------------------

    public void setComplaintType(String complaintType) {
        this.complaintType = complaintType;
    }

    public void setPhoneNo(int PhoneNo) {
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

    public void setFile(File file) {
        this.file = file;
    }
 
    
    
}



