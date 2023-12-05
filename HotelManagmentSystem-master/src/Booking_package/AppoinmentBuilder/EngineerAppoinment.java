package Booking_package.AppoinmentBuilder;

public class EngineerAppoinment {
    private IAppBuilder builder;

    public EngineerAppoinment(IAppBuilder builder){
        this.builder = builder;
    }

    public void createAppointment(){
        this.builder.buildeType();
        this.builder.buildAppointmentPrice();
    }

    public Appointment getAppointment(){
        return this.builder.getAppointment();
    }
}
