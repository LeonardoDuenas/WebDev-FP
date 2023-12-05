package Booking_package.AppoinmentBuilder;

public class TourAppoinmentBuilder implements IAppBuilder{
    Appointment appointment;

    public TourAppoinmentBuilder(){
        this.appointment = new Appointment();
    }
    @Override
    public void buildeType() {
        this.appointment.setType("Tour");
    }

    @Override
    public void buildAppointmentPrice() {
        this.appointment.setAppointmentPrice(150);
    }

    @Override
    public Appointment getAppointment() {
        return this.appointment;
    }
}
