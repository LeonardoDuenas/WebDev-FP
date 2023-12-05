package Menu_package;

import Booking_package.AppoinmentBuilder.*;
import Booking_package.Request;
import Login_pacakge.Database;
import Users_package.Client;

import java.util.Scanner;

public class BookingMenu implements IMenuCases{
    //1. Pay service
    //2. book spa - DONE
    //3. book tour - DONE
    //4. send request - DONE
    //5. cancel appointment - DONE
    Client currentClient = Database.getClient(Database.getClientId());
    @Override
    public void casesHandler(int choice) {
        Scanner input = new Scanner(System.in);
        String date;
        EngineerAppoinment e;
        Appointment appointment = null;

        switch (choice){
            case 1:
                int totalPrice = 0;
                System.out.println("The total for the room would be: "+currentClient.getRoom().getPrice());
                totalPrice += currentClient.getRoom().getPrice();
                if (currentClient.getAppointments() != null){
                    for(Appointment appointment1 : currentClient.getAppointments()) {
                        appointment1.displayAppointment();
                        totalPrice += appointment1.getAppointmentPrice();
                    }
                }

                System.out.println("The total is "+totalPrice);
                System.out.println("Pay made successfully");
                break;
            case 2:

                System.out.println("Creating your spa appointment...");
                IAppBuilder spaApp = new SpaAppoinmentBuilder();
                e = new EngineerAppoinment(spaApp);
                e.createAppointment();
                appointment = e.getAppointment();

                System.out.println("For which date would you like the appointment? (dd/mm)");
                date = input.nextLine();
                appointment.setDate(date); //Validation done here

                System.out.println("Appoinmnt test: "+appointment.getAppointmentPrice());
                currentClient.addAppointment(appointment);

                System.out.println("Appointment made succesfully");
                break;
            case 3:
                System.out.println("Creating your tour appointment...");
                IAppBuilder tourApp = new TourAppoinmentBuilder();
                e = new EngineerAppoinment(tourApp);
                e.createAppointment();
                appointment = e.getAppointment();

                System.out.println("For which date would you like the appointment? (dd/mm)");
                date = input.nextLine();
                appointment.setDate(date);

                currentClient.addAppointment(appointment);
                System.out.println("Appointment made succesfully");
                break;
            case 4:
                String message = "";

                System.out.println("Make your request: (Max. 200)");

                try {
                    message = input.nextLine();
                }catch (Exception ex){
                    System.out.println(ex.getMessage());
                }

                Request request = new Request(message);
                currentClient.addRequest(request);
                break;
            case 5:
                if (currentClient.getAppointments() != null) {
                    currentClient.setAppointments(null);
                    System.out.println("Current appointment cancelled.");
                } else {
                    System.out.println("Make an appointment first");
                }
                break;
            case 6:
                System.out.println("Going back...");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
