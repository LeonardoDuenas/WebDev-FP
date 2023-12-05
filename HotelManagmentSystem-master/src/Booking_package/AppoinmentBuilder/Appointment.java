package Booking_package.AppoinmentBuilder;
import java.util.regex.*;

public class Appointment {
    private String type;
    private String date;
    private int appointmentPrice;


    public int getAppointmentPrice() {
        return appointmentPrice;
    }

    public void setAppointmentPrice(int appointmentPrice) {
        this.appointmentPrice = appointmentPrice;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDate(String date) {
        if (isValidDate(date)) {
            this.date = date;
        }else{
            System.out.println("invalid Date "+date);
        }
    }

    public boolean isValidDate(String date){
        String pattern = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[1,2])$";
        return Pattern.matches(pattern, date);
    }

    public void displayAppointment(){
        System.out.println(this.type+"appointment, for the "+this.date+". Cost: "+this.appointmentPrice);
    }
}
