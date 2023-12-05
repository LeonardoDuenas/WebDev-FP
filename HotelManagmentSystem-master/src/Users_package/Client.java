package Users_package;

import Booking_package.AppoinmentBuilder.Appointment;
import Booking_package.Request;
import Booking_package.Room;


import java.util.ArrayList;

public class Client extends User {

    private static int id_counter = 1;
    private ArrayList<Appointment> appointments;
    private Room room;
    private ArrayList<Request> requests;

    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }

    public Client(String username, String password) {
        super(id_counter, username, password);
        id_counter++;
    }

    public void addAppointment(Appointment appointment) {
        this.appointments.add(appointment);
    }
    public void setAppointments(ArrayList<Appointment> appointments) {
        this.appointments = appointments;
    }
    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public void addRequest(Request request){
        this.requests.add(request);
    }



}
