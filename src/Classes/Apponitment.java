
import java.time.LocalDate;
import java.time.LocalTime;


public class Apponitment {
    
    private String patient;
    private LocalDate appointmentDate;
    private LocalTime appointmentTime;
    private String symptoms;
    private String appointmentRecordStatus;
    private int appointmentNo;
   
    
    
   //getters and setters
    
    public String getPatient() {
        return patient;
    }
    public void setPatient(String patient) {
        this.patient = patient;
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
    
    
    
   
    
   
    
}
