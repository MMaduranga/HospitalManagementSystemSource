
package hms;

/**
 *
 * @author USER PC
 */
public class User {
    private String userName ;
    private String name;
    private String gender;
    private int phoneNo;
    private int idNo;
    //private date dob;
    private String address;
    private String materialStatus;
    private int password;
    //private photo profilePic;

    public User(String userName, String name, String gender, int phoneNo, int idNo, String address, String materialStatus, int password) {
        this.userName = userName;
        this.name = name;
        this.gender = gender;
        this.phoneNo = phoneNo;
        this.idNo = idNo;
        this.address = address;
        this.materialStatus = materialStatus;
        this.password = password;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getName() {
        return this.name;
    }

    public String getGender() {
        return this.gender;
    }

    public int getPhoneNo() {
        return this.phoneNo;
    }

    public int getIdNo() {
        return this.idNo;
    }

    public String getAddress() {
        return this.address;
    }

    public String getMaterialStatus() {
        return this.materialStatus;
    }

    public int getPassword() {
        return this.password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setIdNo(int idNo) {
        this.idNo = idNo;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMaterialStatus(String materialStatus) {
        this.materialStatus = materialStatus;
    }

    public void setPassword(int password) {
        this.password = password;
    }
    
}
