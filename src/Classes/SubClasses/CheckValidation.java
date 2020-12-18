package Classes.SubClasses;

import java.io.File;
import java.util.regex.*;

public class CheckValidation {

    public boolean checkIdNumber(String idNo, File filelocation, int location) {
        String[] objectArrayExist = new ReadFile().findObjLine(idNo, filelocation, location);
        if (objectArrayExist == null) {
            Pattern patternIdNoNew = Pattern.compile("((19|20)[0-9]{10})|([3-9][0-9]{8}(v|V))");
            Matcher matchIdNo = patternIdNoNew.matcher(idNo);

            return matchIdNo.matches();
        } else {
            return false;
        }
    }

    public boolean checkPhoneNumber(String phoneNo, File filelocation, int location) {

        String[] objectArrayExist = new ReadFile().findObjLine(phoneNo, filelocation, location);
        if (objectArrayExist == null) {
            Pattern patternPhoneNo = Pattern.compile("0[1-8][1-8][0-9]{7}");
            Matcher matchPhoneNo = patternPhoneNo.matcher(phoneNo);

            return matchPhoneNo.matches();
        } else {
            return false;
        }
    }

    public boolean checkUserName(String userName, File filelocation, int location) {
        String[] objectArrayExist = new ReadFile().findObjLine(userName, filelocation, location);
        if (objectArrayExist == null) {

            return true;
        } else {
            return false;
        }
    }

    public boolean checkEmailId(String email) {
        Pattern patternEmailId = Pattern.compile(".+@.+");
        Matcher matchEmailId = patternEmailId.matcher(email);

        return matchEmailId.matches();
    }

}
