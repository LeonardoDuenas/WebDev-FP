package Menu_package;

public class ReceptionistIMenu implements IMenuCases{
    @Override
    public void casesHandler(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Booking room under construction... Coming soon...");
                break;
            case 2:
                System.out.println("Cancel a booking under construction... Coming soon...");
                break;
        }
    }
}
