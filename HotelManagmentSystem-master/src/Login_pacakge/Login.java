package Login_pacakge;

import Menu_package.AccountActionType;
import Menu_package.Menu;
import Menu_package.MenuType;
import Users_package.Client;
import Users_package.Receptionist;
import Users_package.UserType;

import javax.xml.crypto.Data;
import java.util.Scanner;
import java.util.regex.*;

public class Login {
    Scanner scanner = new Scanner(System.in);
    AccountActionType actionType;
    UserType userType;
    int id = 0;
    String username = null, password = null;
    public Client client_created = null;
    private static final int USERNAME_MIN_LENGTH = 3;
    private static final int PASSWORD_MIN_LENGTH = 6;
    private static final int USERNAME_MAX_LENGTH = 12;
    private static final int PASSWORD_MAX_LENGTH = 20;

    public Login(AccountActionType actionType, UserType userType) {
        this.actionType = actionType;
        this.userType = userType;
        chooseAction();
    }

    private void chooseAction() {
        /* To switch between Sign_Up and Sign_In */
        if (actionType == AccountActionType.SIGN_UP) {
            createAccount();
        }
        else if (actionType == AccountActionType.SIGN_IN){
            login();
        }
    }

    private int promptForId() {
        do {
            System.out.print("Enter an id (6 digits): ");
            id = scanner.nextInt();

            if (isValidId(id)) {
                break;
            } else {
                System.out.println("Invalid username. Make sure you entered digits");
            }
        } while (true);

        return id;
    }

    private String promptForUsername() {
        String username;
        do {
            System.out.print("Enter a username (between " + USERNAME_MIN_LENGTH + " and " + USERNAME_MAX_LENGTH + " characters): ");
            username = scanner.next().trim();

            if (isValidUsername(username)) {
                break;
            } else {
                System.out.println("Invalid username. Make sure there are not special characters " +
                        "and there is at least one alphabetical character in your username.");
            }
        } while (true);

        return username;
    }

    private String promptForPassword() {
        String password;
        do {
            System.out.print("Enter a password (between " + PASSWORD_MIN_LENGTH + " and " + PASSWORD_MAX_LENGTH + " characters): ");
            password = scanner.next().trim();

            if (isValidPassword(password)) {
                break;
            } else {
                System.out.println("Invalid password. Please try again.");
            }
        } while (true);

        return password;
    }

    public void createAccount() {
        System.out.println("Create an account by providing the username and password:");
        if (userType.equals(UserType.RECEPTIONIST)) {
            id = promptForId();
        }
        String username = promptForUsername();
        String password = promptForPassword();

        try {
            switch (userType) {
                case CLIENT -> Database.addClient(new Client(username, password));
                case RECEPTIONIST -> Database.addReceptionist(new Receptionist(id, username, password));
            }
            client_created = new Client(username, password);
            Database.setClientId(client_created.getId());
            Database.addClient(client_created);

            System.out.println("Account created successfully!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private boolean isValidId(int id) {
        String pattern = "^[0-9]{6}$";
        return Pattern.matches(pattern, String.valueOf(id));
    }

    private boolean isValidUsername(String username) {
        String pattern = "^[a-zA-Z].*[0-9]?.{" + USERNAME_MIN_LENGTH + "," + USERNAME_MAX_LENGTH + "}$";
        return Pattern.matches(pattern, username);
    }

    private boolean isValidPassword(String password) {
        String pattern = "^[a-zA-Z0-9?!.$#@&*]{" + PASSWORD_MIN_LENGTH + "," + PASSWORD_MAX_LENGTH + "}$";
        return Pattern.matches(pattern, password);
    }

    private void login() {
        final int MAX_ATTEMPTS = 4;
        int attempts = 0;
        String loginType = (userType.equals(UserType.RECEPTIONIST ) ? "ID" : "Username");
        String message = "Login by using your " + loginType;
        System.out.println(message);
        try {
            askLogin();
            if (userType.equals(UserType.RECEPTIONIST)) {
                while (!Database.checkReceptionistInfo(new Receptionist(id, "LOGIN", password))) {
                    System.out.println("Invalid Information");
                    askLogin();
                }
                //Change the state to receptionistMenu.
                String[] menuItems = {"Book room", "Cancel booking"};
                Menu receptionistMenu = new Menu(MenuType.RECEPTIONIST, menuItems);
                receptionistMenu.display();
            }
            else {
                while (!Database.checkClientInfo(new Client(username, password))) {
                    System.out.println("Invalid Information");
                    askLogin();
                }
                //Change the state to ClientMenu.
                String[] menuItems = {"Book room", "Cancel your booking"};
                Menu clientMenu = new Menu(MenuType.USER, menuItems);
                clientMenu.display();
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void askLogin() {
        if (userType.equals(UserType.RECEPTIONIST)) {
            System.out.println("Id: ");
            id = scanner.nextInt();
        }
        else if (userType.equals(UserType.CLIENT)) {
            System.out.println("Username: ");
            username = scanner.next();
        }
        System.out.println("Password: ");
        password = scanner.next();
    }

}
