/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hmsnew;

/**
 *
 * @author hp
 */
public class Doctor extends Employee {
//    private Employee_Login EL;

    private String Specialization;
    private boolean DoctorExcuse;
    private String Schedule = "";
    private Patient[] patient;
    private Patient CurrentPatient;
    private String Diagnosis;
    private String TreatmentMethod;
    

    
    
    public Doctor(String name) {
        super.setName(name);
    }

    public boolean isDoctorExcuse() {
        return DoctorExcuse;
    }

    public void setDoctorExcuse(boolean DoctorExcuse) {
        this.DoctorExcuse = DoctorExcuse;
    }

    public Patient[] getPatient() {
        return patient;
    }

    public void setPatient(Patient[] patient) {
        this.patient = patient;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String Specialization) {
        this.Specialization = Specialization;
    }

    public void setSchedule() {
        for (int i = 0; i < patient.length; i++) {
            if (patient[i].getBooking().getDoctorName() == this.getName() && this.Specialization == patient[i].getBooking().getType_of_Medical_Examination()) {
                this.Schedule += "Patient Name: " + patient[i].getName() + "\t" + "Reservation time: " + patient[i].getBooking().getReservationTime() + "\n";
            }
        }
    }

    public String getSchedule() {
        return Schedule;
    }

    public String getDiagnosis() {
        return Diagnosis;
    }

    public void setDiagnosis(String Diagnosis) {
        this.Diagnosis = Diagnosis;
    }

    public String getTreatmentMethod() {
        return TreatmentMethod;
    }

    public void setTreatmentMethod(String TreatmentMethod) {
        this.TreatmentMethod = TreatmentMethod;
    }
    
    
    
    public String getPatientHistory(){
        return CurrentPatient.getMedical_History();
    }

}
