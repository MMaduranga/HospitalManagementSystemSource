
package Classes;

import java.io.File;
import java.time.LocalDate;

public class ReceivedPostalMail extends PostalMail {

    private String fromName;
    private String fromAddress;
    private String toName;

    public ReceivedPostalMail(int referenceNo, LocalDate currentDate, File attachDoc,
            String note, String fromName, String fromAddress, String toName) {
        super(referenceNo, currentDate, attachDoc, note);
        this.setFromName(fromName);
        this.setFromAddress(fromAddress);
        this.setToName(toName);
    }

    //getters
    public String getFromName() {
        return this.fromName;
    }

    public String getFromAddress() {
        return this.fromAddress;
    }

    public String getToName() {
        return this.toName;
    }

    //setters
    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public void setToName(String toName) {
        this.toName = toName;
    }

    public String toString() {
        return "|~" + this.getFromAddress() + "~" + this.getFromName() + "~"
                + this.getToName() + "~" + this.getNote() + "~" + this.getAttachDoc()
                + "~" + this.getCurrentDate() + "~" + this.getReferenceNo();
    }
}
