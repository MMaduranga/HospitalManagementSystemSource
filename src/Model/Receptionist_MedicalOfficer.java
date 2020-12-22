package Model;

import java.io.File;
import java.time.LocalDate;

public class Receptionist_MedicalOfficer extends User {

    private int staffId;
    private String staffEmailAddress;
    private LocalDate dateOfJoin;
    private File staffPhoto;
    private File attachDoc;

    public Receptionist_MedicalOfficer(int staffId, String staffEmailAddress,
            String userName, String name, String gender, int phoneNo,
            String idNo, String address, String materialStatus, String password, 
            LocalDate DOB, File profilePic,LocalDate dateofJoin,File staffPhoto,File attachDoc) {
        super(userName, name, gender, phoneNo, idNo, address, materialStatus, password, DOB, profilePic);
        this.setStaffId(staffId);
        this.setStaffEmailAddress(staffEmailAddress);
        this.setAttachDoc(attachDoc);
        this.setStaffPhoto(staffPhoto);
        this.setDateOfJoin(dateofJoin);
    }

    public void setDateOfJoin(LocalDate date) {
        this.dateOfJoin = date;
    }

    public void setStaffPhoto(File file) {
        this.staffPhoto = file;
    }

    public void setAttachDoc(File attachDoc) {
        this.attachDoc = attachDoc;
    }

    public int getStaffId() {
        return staffId;
    }

    public String getStaffEmailAddress() {
        return staffEmailAddress;
    }

    public File getAttachDoc() {
        return this.attachDoc;
    }

    public File getStaffPhoto() {
        return this.staffPhoto;
    }

    public LocalDate getDateOfJoin() {
        return this.dateOfJoin;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public void setStaffEmailAddress(String staffEmailAddress) {
        this.staffEmailAddress = staffEmailAddress;
    }

}
