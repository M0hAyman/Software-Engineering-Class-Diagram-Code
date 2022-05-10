/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hmsnew;
import java.lang.String;
/**
 *
 * @author hp
 */
public class Patient extends Person {

    private static int Patient_ID;
    private int NationalID;
    private Booking booking;
    protected String Medical_History = "";
    
    
    
    
    
    public Patient() {
        Patient_ID++;
    }

    public Patient(String name) {
        super(name);
        Patient_ID++;
    }

    public String getMedical_History() {
        return Medical_History;
    }

    public void setMedical_History(String Medical_History) {
        this.Medical_History = Medical_History;
    }

    @Override
    public void setNationalID(int NationalID) {
        this.NationalID = NationalID;
    }

    @Override
    public int getNationalID() {
        return NationalID;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public Booking getBooking() {
        return booking;
    }

    public static int getPatient_ID() {
        return Patient_ID;
    }

    private void login_info() {
        System.out.println("HospitalID: " + Patient_ID + "\n" + "NationalID: " + NationalID);
    }

    @Override
    public void Show_All_Info() {
        this.login_info();
        super.Show_All_Info();

    }
}