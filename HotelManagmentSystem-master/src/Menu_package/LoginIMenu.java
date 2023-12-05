package Menu_package;

import Login_pacakge.Login;

public class LoginIMenu implements IMenuCases {
    @Override
    public void casesHandler(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Sign In...");
                new Login(AccountActionType.SIGN_IN, Menu.userType);
                break;
            case 2:
                System.out.println("Sign Up...");
                new Login(AccountActionType.SIGN_UP, Menu.userType);
                break;
            case 3:
                System.out.println("Going back to main menu...");
                break;
        }
    }
}
