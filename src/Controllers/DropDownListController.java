package Controllers;

import java.io.File;
import java.util.ArrayList;
import javax.swing.JComboBox;
//DropDownListController.java

public class DropDownListController {

    ReadFile readFileObj;

    public DropDownListController() {
        this.readFileObj = new ReadFile();
    }

    public void addDoctorsToDropDown(String strSpecilityArea, JComboBox listOfDoctorsComboBox) {//add doctors to doctors dropdowns in users interfaces
        ArrayList<String> totalRowsArray = this.readFileObj.readTotalFile(new File("src\\TxtFiles\\MedicalOfficer.mov"));
        String[] strDoctorLineDetails;
        for (int count = 0; count < totalRowsArray.size(); count++) {
            strDoctorLineDetails = totalRowsArray.get(count).split("~");
            if (strDoctorLineDetails[16].equalsIgnoreCase(strSpecilityArea)) {
                listOfDoctorsComboBox.addItem(strDoctorLineDetails[3] + "-" + strDoctorLineDetails[10]);
            }
        }

    }

    public void addItemsToDropdown(ArrayList<String> strDropDownListItems, JComboBox comboBox) {//add items to dropdown by raeding the file

        for (int count = 0; count < strDropDownListItems.size(); count++) {
            comboBox.addItem(strDropDownListItems.get(count));
        }
        comboBox.setSelectedItem(null);
    }

    public void addPatientsToDropDown(JComboBox comboBox) {//add patients to the patient dropdown by reading the patient file

        ArrayList<String> totalRowsArray = this.readFileObj.readTotalFile(new File("src\\TxtFiles\\Pateint.mov"));

        String[] patientDetails;
        for (int count = 0; count < totalRowsArray.size(); count++) {

            patientDetails = totalRowsArray.get(count).split("~");

            comboBox.addItem(patientDetails[3]);
        }
    }
}
