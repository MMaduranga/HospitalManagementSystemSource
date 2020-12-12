package Classes;

import java.io.File;
import java.time.LocalDate;

public class Receptionist extends Receptionist_MedicalOfficer {

    public Receptionist(int staffId, String staffEmailAddress, String userName,
            String name, String gender, int phoneNo, String idNo, String address,
            String materialStatus, String password, LocalDate DOB, File profilePic,
            LocalDate dateofJoin, File staffPhoto, File attachDoc) {
        super(staffId, staffEmailAddress, userName, name, gender, phoneNo, idNo,
                address, materialStatus, password, DOB, profilePic, dateofJoin, staffPhoto, attachDoc);
    }

    public String toString() {
        return "|~" + this.getUserName() + "~" + this.getPassword() + "~" + this.getName() + "~"
                + this.getGender() + "~" + this.getPhoneNo() + "~" + this.getIdNo() + "~" + this.getDOB()
                + "~" + this.getAddress() + "~" + this.getMaterialStatus() + "~" + this.getProFilePic()
                + "~" + this.getStaffId() + "~" + this.getStaffEmailAddress() + "~" + this.getDateOfJoin()
                + "~" + this.getStaffPhoto() + "~" + this.getAttachDoc();
    }

}
