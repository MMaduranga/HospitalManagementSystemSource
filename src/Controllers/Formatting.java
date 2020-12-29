
package Controllers;

import java.util.Base64;

//Formatting.java
public class Formatting {
    
     public String Encode(String strObjectLine) {//encode the data 
        return Base64.getEncoder().encodeToString(strObjectLine.getBytes());
        
    }
    
    public String Decode(String strEncodedObjectLine) {//decode the data
        return new String(Base64.getDecoder().decode(strEncodedObjectLine));
        
    }
}
