package Controllers;

import java.io.File;
import java.util.ArrayList;
import javax.swing.JComboBox;

public class DropDownListController  {

    ReadFile readFileObj;

    public DropDownListController() {
        this.readFileObj = new ReadFile();
    }

    public void addDoctorsToDropDown(String strSpecilityArea, JComboBox listOfDoctorsComboBox) {
        ArrayList<String> totalRowsArray = this.readFileObj.readTotalFile(new File("src\\TxtFiles\\MedicalOfficer.mov"));
        String[] strDoctorLineDetails;
        for (int count = 0; count < totalRowsArray.size(); count++) {
            strDoctorLineDetails = totalRowsArray.get(count).split("~");
            if (strDoctorLineDetails[16].equalsIgnoreCase(strSpecilityArea)) {
                listOfDoctorsComboBox.addItem(strDoctorLineDetails[3] + "-" + strDoctorLineDetails[10]);
            }
        }

    }

    public void addItemsToDropdown(ArrayList<String> strDropDownListItems, JComboBox comboBox) {

        for (int count = 0; count < strDropDownListItems.size(); count++) {
            comboBox.addItem(strDropDownListItems.get(count));
        }
        comboBox.setSelectedItem(null);
    }

    public void addPatientsToDropDown(JComboBox comboBox) {

        ArrayList<String> totalRowsArray = this.readFileObj.readTotalFile(new File("src\\TxtFiles\\Pateint.mov"));

        String[] patientDetails;
        for (int count = 0; count < totalRowsArray.size(); count++) {

            patientDetails = totalRowsArray.get(count).split("~");

            comboBox.addItem(patientDetails[3]);
        }
    }
}
