/*
Date : 25-11-2020
Author : H.A.N.Sahani Hettiarachchi
Version : 1
Description : Class for User
*/
//import packages
package Model;

import java.io.File;
import java.time.LocalDate;
//Declare variables
public class User extends Main{

    private String userName;
    private String name;
    private String gender;
    private String phoneNo;
    private String idNo;
    private LocalDate dob;
    private String address;
    private String materialStatus;
    private String password;
    private File profilePic;
//Constructor
    public User(String userName, String name, String gender, String phoneNo,
            String idNo, String address, String materialStatus, String password, LocalDate dob, File profilePic) {
        this.setUserName(userName);
        this.setName(name);
        this.setGender(gender);
        this.setPhoneNo(phoneNo);
        this.setIdNo(idNo);
        this.setAddress(address);
        this.setMaterialStatus(materialStatus);
        this.setPassword(password);
        this.setDOB(dob);
        this.setProfilePic(profilePic);
    }
//Generate Setters
    public void setProfilePic(File profilepic) {
        this.profilePic = profilepic;
    }

    public void setDOB(LocalDate date) {
        this.dob = date;
    }
//Generate Getters
    public String getUserName() {
        return this.userName;
    }

    public String getName() {
        return this.name;
    }

    public String getGender() {
        return this.gender;
    }

    public String getPhoneNo() {
        return this.phoneNo;
    }

    public String getIdNo() {
        return this.idNo;
    }

    public String getAddress() {
        return this.address;
    }

    public String getMaterialStatus() {
        return this.materialStatus;
    }

    public String getPassword() {
        return this.password;
    }
//Generate Setters
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMaterialStatus(String materialStatus) {
        this.materialStatus = materialStatus;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getDOB() {
        return this.dob;
    }
//Generate Getters
    public File getProFilePic() {
        return this.profilePic;
    }
}
