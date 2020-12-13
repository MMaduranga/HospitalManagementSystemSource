package Classes;

import java.time.LocalDate;
import java.time.LocalTime;

public class Apponitment extends Main{

    private String patient;
    private LocalDate appointmentDate;
    private LocalTime appointmentTime;
    private String symptoms;
    private String appointmentRecordStatus;
    private int appointmentNo;
    private String medicalOfficer;

    public Apponitment(String patient, LocalDate appointmentDate,
            LocalTime appointmentTime, String symptoms, String appointmentRecordStatus,
             int appointmentNo, String medicalOfficer) {
        this.setPatient(patient);
        this.setAppointmentDate(appointmentDate);
        this.setAppointmentNo(appointmentNo);
        this.setAppointmentRecordStatus(appointmentRecordStatus);
        this.setMedicalOfficer(medicalOfficer);
        this.setSymptoms(symptoms);
        this.setAppointmentTime(appointmentTime);
    }

    //getters and setters
    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public void setMedicalOfficer(String medicalOfficer) {
        this.medicalOfficer = medicalOfficer;
    }

    public String getMedicalOfficer() {
        return this.medicalOfficer;
    }

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDate appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public LocalTime getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(LocalTime appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getAppointmentRecordStatus() {
        return appointmentRecordStatus;
    }

    public void setAppointmentRecordStatus(String appointmentRecordStatus) {
        this.appointmentRecordStatus = appointmentRecordStatus;
    }

    public int getAppointmentNo() {
        return appointmentNo;
    }

    public void setAppointmentNo(int appointmentNo) {
        this.appointmentNo = appointmentNo;
    }

    @Override
    public String toString() {
        return "|~" + this.getAppointmentRecordStatus() + "~" + this.getMedicalOfficer() + "~"
                + this.getPatient() + "~" + this.getSymptoms() + "~" + this.getAppointmentDate()
                + "~" + this.getAppointmentNo() + "~" + this.getAppointmentTime();
    }
}
