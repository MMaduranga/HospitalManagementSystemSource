
package hms;


public class Receptionist_MedicalOfficer extends User {
    private int staffId;
    private String staffEmailAddress;
    //private Date dateOfJoin;
    //staff photography
  //  private file attachDOC;

    public Receptionist_MedicalOfficer(int staffId, String staffEmailAddress, String userName, String name, String gender, int phoneNo, int idNo, String address, String materialStatus, int password) {
        super(userName, name, gender, phoneNo, idNo, address, materialStatus, password);
        this.staffId = staffId;
        this.staffEmailAddress = staffEmailAddress;
    }

    public int getStaffId() {
        return staffId;
    }

    public String getStaffEmailAddress() {
        return staffEmailAddress;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public void setStaffEmailAddress(String staffEmailAddress) {
        this.staffEmailAddress = staffEmailAddress;
    }
    
    
}
