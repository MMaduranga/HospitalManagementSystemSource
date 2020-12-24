
package Model;

import java.io.File;
import java.time.LocalDate;

/**
 *
 * @author Minushi
 */
public class DispatchPostalMail extends PostalMail { //inheritance 
    
    //Declare variables 
    private String toName;
    private String toAddress;
    private String fromName;
    
    //Parameterized Constructor
    public DispatchPostalMail(String referenceNo, LocalDate currentDate, File attachDoc, 
            String note, String toName, String toAddress, String fromName) {
        super(referenceNo, currentDate, attachDoc, note); //calling the constructor of the super class 
        this.setToName(toName);
        this.setToAddress(toAddress);
        this.setFromName(fromName);
    }
    //getters 

    public String getToName() {
        return this.toName;
    }
    
    public String getToAddress() {
        return this.toAddress;
        
    }
    
    public String getFromName() {
        return this.fromName;
    }

    //setters
    public void setToName(String toName) {
        this.toName = toName;
    }
    
    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }
    
    public void setFromName(String fromName) {
        this.fromName = fromName;
    }
    
    //Declare toString method 
    public String toString() {
        return "|~"+this.getFromName() + "~" + this.getToAddress() + "~" + 
                this.getToName()+ "~" + this.getNote()+ "~" + this.getAttachDoc()
                + "~" + this.getCurrentDate()+ "~" + this.getReferenceNo();
    }
    
}
