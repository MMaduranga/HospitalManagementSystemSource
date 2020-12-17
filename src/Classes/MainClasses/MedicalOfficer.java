
package Classes.MainClasses;

import java.io.File;
import java.time.LocalDate;

/**
 *
 * @Erandika
 */

public class MedicalOfficer extends Receptionist_MedicalOfficer{
    //-----------------------------------------------Variables----------------------------------------
    private String spetialtyArea ;

    public MedicalOfficer(int staffId, String staffEmailAddress, String userName,
            String name, String gender, int phoneNo, String idNo, String address, 
            String materialStatus, String password, LocalDate DOB, File profilePic,
            LocalDate dateofJoin, File staffPhoto, File attachDoc,String spetialtyArea) {
        super(staffId, staffEmailAddress, userName, name, gender, phoneNo, idNo, address, materialStatus, password, DOB, profilePic, dateofJoin, staffPhoto, attachDoc);
    this.setSpetialtyArea(spetialtyArea);
    }
      
//-----------------------------------------------Getter---------------------------------------------
    public String getSpetialtyArea() {
        return this.spetialtyArea;
    }

  //---------------------------------------------Settter----------------------------------------------  
    public void setSpetialtyArea(String spetialtyArea) {
        this.spetialtyArea = spetialtyArea;
    }
    
 public String toString() {
        return "|~" + this.getUserName() + "~" + this.getPassword() + "~" + this.getName() + "~"
                + this.getGender() + "~" + this.getPhoneNo() + "~" + this.getIdNo() + "~" + this.getDOB()
                + "~" + this.getAddress() + "~" + this.getMaterialStatus() + "~" + this.getProFilePic()
                + "~" + this.getStaffId() + "~" + this.getStaffEmailAddress() + "~" + this.getDateOfJoin()
                + "~" + this.getStaffPhoto() + "~" + this.getAttachDoc()+"~"+this.getSpetialtyArea();
    }

}
