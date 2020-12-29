package Controllers;

import java.io.File;
import java.util.regex.*;
//CheckValidation.java
public class CheckValidation {

    public boolean checkIdNumber(String idNo, String filelocation, int location) {//check the validation of id number using id number format

        FileSecurity fileSecurity = new FileSecurity(filelocation);
        String[] objectArrayExist = new ReadFile().findObjLine(idNo, new File(fileSecurity.setFilePathToTxt()), location);
        if (objectArrayExist == null) {
            Pattern patternIdNoNew = Pattern.compile("((19|20)[0-9]{10})|([3-9][0-9]{8}(v|V))");
            Matcher matchIdNo = patternIdNoNew.matcher(idNo);
            fileSecurity.setFilePathMOV();
            return matchIdNo.matches();
        } else {
            fileSecurity.setFilePathMOV();

            return false;
        }
    }

    public boolean checkPhoneNumber(String phoneNo, String filelocation, int location) {//check validation of phone number using phone number format pattern
       FileSecurity fileSecurity = new FileSecurity(filelocation);
        String[] objectArrayExist = new ReadFile().findObjLine(phoneNo, new File(fileSecurity.setFilePathToTxt()), location);
        if (objectArrayExist == null) {
          
            Pattern patternPhoneNo = Pattern.compile("0[1-8][1-8][0-9]{7}");
            Matcher matchPhoneNo = patternPhoneNo.matcher(phoneNo);
         fileSecurity.setFilePathMOV();
            return matchPhoneNo.matches();
       } else {
            fileSecurity.setFilePathMOV();
            return false;
        }
    }

    public boolean checkUserName(String userName, String filelocation, int location) {//check validation of user name by checking user name already exsits
        FileSecurity fileSecurity = new FileSecurity(filelocation);
        String[] objectArrayExist = new ReadFile().findObjLine(userName, new File(fileSecurity.setFilePathToTxt()), location);
        if (objectArrayExist == null) {
            fileSecurity.setFilePathMOV();
            return true;
        } else {
            fileSecurity.setFilePathMOV();
            return false;
        }
    }

    public boolean checkReferenceNo(String referenceNo, String filelocation, int location) {//check the validination of reference number by checking reference number already exsits
        FileSecurity fileSecurity = new FileSecurity(filelocation);
        String[] objectArrayExist = new ReadFile().findObjLine(referenceNo, new File(fileSecurity.setFilePathToTxt()), location);
        if (objectArrayExist == null) {
            fileSecurity.setFilePathMOV();
            return true;
        } else {
            fileSecurity.setFilePathMOV();
            return false;
        }
    }
    public boolean checkEmailId(String email, String filelocation, int location) {//check the validation of email address using email address format
        FileSecurity fileSecurity = new FileSecurity(filelocation);
        String[] objectArrayExist = new ReadFile().findObjLine(email, new File(fileSecurity.setFilePathToTxt()), location);
        if (objectArrayExist == null) {
            Pattern patternEmailId = Pattern.compile(".+@.+");
            Matcher matchEmailId = patternEmailId.matcher(email);
            fileSecurity.setFilePathMOV();
            return matchEmailId.matches();
        } else {
            fileSecurity.setFilePathMOV();
            return false;
        }
    }
  
}
