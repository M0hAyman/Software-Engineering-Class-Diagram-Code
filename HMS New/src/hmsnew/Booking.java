/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hmsnew;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author hp
 */
public class Booking {

    private final String BookingTime;
    private String ReservationTime;
    private String Type_of_Medical_Examination;
    private String DoctorName;

    public Booking(String ReservationTime) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(" yyyy/MM/dd  ,  HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        BookingTime = dtf.format(now);
        this.ReservationTime = ReservationTime;
    }

    public String getReservationTime() {
        return ReservationTime;
    }

    public void setReservationTime(String ReservationTime) {
        this.ReservationTime = ReservationTime;
    }

    public String getType_of_Medical_Examination() {
        return Type_of_Medical_Examination;
    }

    public void setType_of_Medical_Examination(String Type_of_Medical_Examination) {
        this.Type_of_Medical_Examination = Type_of_Medical_Examination;
    }

    public String getDoctorName() {
        return DoctorName;
    }

    public void setDoctorName(String DoctorName) {
        this.DoctorName = DoctorName;
    }

    public String getBookingTime() {
        return BookingTime;
    }

    @Override
    public String toString() {
        return "Booking::" + "\n"+"{" +"\n"+ " BookingTime: " + BookingTime +"\n" + " ReservationTime: " + ReservationTime +"\n" + " Type_of_Medical_Examination: " + Type_of_Medical_Examination +"\n" + " DoctorName: " + DoctorName + "\n" +'}';
    }

}
