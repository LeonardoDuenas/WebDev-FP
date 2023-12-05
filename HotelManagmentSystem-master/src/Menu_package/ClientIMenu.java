package Menu_package;

import Booking_package.Room;
import Login_pacakge.Database;
import Users_package.Client;


public class ClientIMenu implements IMenuCases {
    Client currentClient = Database.getClient(Database.getClientId());
    @Override
    public void casesHandler(int choice) {
        while(choice != 3) {
            switch (choice) {
                case 1:
                    String[] bookingMenu = {"Pay for room", "Book Spa appointment", "Book Tour appointment", "Send request", "Cancel Appointment"};

                    System.out.println("Showing available rooms");
                    Database.roomAvailability(); //Display Rooms and let the user choose one

                    new Menu(MenuType.BOOKING, bookingMenu).display();
                    break;
                case 2:
                    if (currentClient.getRoom() != null) {
                        currentClient.setRoom(null);
                        System.out.println("The room you booked is cancelled, see you next time.");
                    } else {
                        System.out.println("You must book a room to cancel.");
                    }
                    break;
                case 3:
                    System.out.println("Going back...");
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }
}
