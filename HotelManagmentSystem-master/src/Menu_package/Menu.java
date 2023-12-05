package Menu_package;

import Users_package.UserType;

import java.util.Scanner;

/*
    This class is used to create menus while allow customization.
 */
public class Menu {

    private MenuType menuType;
    private String[] menuItems;

    static UserType userType;

    private final int MENU_ITEMS_COUNT;

    public Menu(MenuType menuType, String[] menuItems) {
        this.menuType = menuType;
        this.menuItems = menuItems;
        MENU_ITEMS_COUNT = menuItems.length;
    }

    public void display() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        System.out.println(menuType + " Menu");
        System.out.println("------------------------------");
        System.out.println("Select an Option From The Menu to Execute");
        while (choice != MENU_ITEMS_COUNT) {
            System.out.println("\nOptions: ");
            int counter = 0;
            for (String menuItem: menuItems) {
                counter++;
                System.out.println(counter + ". " + menuItem);
            }
            try {
                System.out.printf("\nEnter the action you want to perform (1-%s): %n", MENU_ITEMS_COUNT);
                choice = scanner.nextInt();
            } catch (Exception exception) {
                exception.printStackTrace();
                System.out.println(exception);
                break;
            }

            //What actions should happen after the user input
            switch (menuType) {
                case MAIN -> new MainIMenu().casesHandler(choice);
                case LOGIN -> new LoginIMenu().casesHandler(choice);
                case USER -> new ClientIMenu().casesHandler(choice);
                case RECEPTIONIST -> new ReceptionistIMenu().casesHandler(choice);
                case BOOKING -> new BookingMenu().casesHandler(choice);
            }
        }
    }

}
