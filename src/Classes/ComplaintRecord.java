/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms.pkg1;

import java.util.Date;
import java.io.File;
/**
 *
 * @Erandika
 */
public class ComplaintRecord {
 //-----------------Variables------------------------
   private String complaintType;
   private int PhoneNo; 
   private date currentDate;
   private String description;
   private String actionTaken;
   private File file;
//------------------------Getters----------------------
    public String getComplaintType() {
        return complaintType;
    }

    public int getPhoneNo() {
        return PhoneNo;
    }

    public date getCurrentDate() {
        return currentDate;
    }

    public String getDescription() {
        return description;
    }

    public String getActionTaken() {
        return actionTaken;
    }

    public File getFile() {
        return file;
    }
   
//--------------------Setters-------------------------------

    public void setComplaintType(String complaintType) {
        this.complaintType = complaintType;
    }

    public void setPhoneNo(int PhoneNo) {
        this.PhoneNo = PhoneNo;
    }

    public void setCurrentDate(date currentDate) {
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



