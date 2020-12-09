
package hms;

public class Patient extends User{
    private String bloodGroup;
    private String allergies;

    
   
    public Patient(String bloodGroup, String allergies, String userName, String name, String gender, int phoneNo, int idNo, String address, String materialStatus, int password) {
        super(userName, name, gender, phoneNo, idNo, address, materialStatus, password);
        this.bloodGroup = bloodGroup;
        this.allergies = allergies;
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

    
    
}
