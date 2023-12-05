package Menu_package;

import Users_package.UserType;

public class MainIMenu implements IMenuCases {
    @Override
    public void casesHandler(int choice) {
        String[] menuItems = {"Sign In", "Sign Up", "Go back"};
        switch (choice) {
            case 1:
                System.out.println("Client Login...");
                Menu.userType = UserType.CLIENT;
                break;
            case 2:
                System.out.println("Receptionist Login...");
                Menu.userType = UserType.RECEPTIONIST;
                break;
            case 3:
                System.out.println("Exiting...");
                return;

        }

        Menu loginMenu = new  Menu(MenuType.LOGIN, menuItems);
        loginMenu.display();
    }
}
