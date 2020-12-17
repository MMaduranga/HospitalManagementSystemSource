
package Classes.SubClasses;

import java.util.Base64;


public class Formatting {
     public String Encode(String strObjectLine) {
        return Base64.getEncoder().encodeToString(strObjectLine.getBytes());
        
    }
    
    public String Decode(String strEncodedObjectLine) {
        return new String(Base64.getDecoder().decode(strEncodedObjectLine));
        
    }
}
