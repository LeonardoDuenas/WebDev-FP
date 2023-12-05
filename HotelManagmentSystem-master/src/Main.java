import Menu_package.Menu;
import Menu_package.MenuType;

public class Main {
    public static void main(String[] args) {
        String[] itemsMain = {"Client", "Receptionist", "Exit Program"};
        Menu mainMenu = new Menu(MenuType.MAIN, itemsMain);
        mainMenu.display();

    }
}