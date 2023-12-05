package Booking_package.AppoinmentBuilder;

public class SpaAppoinmentBuilder implements IAppBuilder{

    Appointment appointment;

    public SpaAppoinmentBuilder(){
        this.appointment = new Appointment();
    }

    @Override
    public void buildeType() {
        this.appointment.setType("Spa");
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
