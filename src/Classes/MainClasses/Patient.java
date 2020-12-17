package Classes.MainClasses;

import java.io.File;
import java.time.LocalDate;

public class Patient extends User {

    private String bloodGroup;
    private String allergies;

    public Patient(String bloodGroup, String allergies, String userName,
            String name, String gender, int phoneNo, String idNo, String address,
            String materialStatus, String password, LocalDate DOB, File profilePic) {
        super(userName, name, gender, phoneNo, idNo, address, materialStatus, password, DOB, profilePic);
        this.setBloodGroup(bloodGroup);
        this.setAllergies(allergies);
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    //other methods
    public String toString() {
        return "|~" + this.getUserName() + "~" + this.getPassword() + "~" + this.getName()
                + "~" + this.getGender() + "~" + this.getPhoneNo() + "~" + this.getIdNo()
                + "~" + this.getDOB() + "~" + this.getAddress() + "~" + this.getMaterialStatus()
                + "~" + this.getBloodGroup() + "~" + this.getAllergies() + "~" + this.getProFilePic();
    }
}
