package Login_pacakge;

import Booking_package.Room;
import Users_package.Client;
import Users_package.Receptionist;

import java.util.ArrayList;
import java.util.Scanner;

public class Database {
    /* Database virtual class, to be replaced with an actual database. */

    private static ArrayList<Integer> userId = new ArrayList<>();
    private static ArrayList<Client> clients = new ArrayList<>();
    private static ArrayList<Receptionist> receptionists = new ArrayList<>();
    private static ArrayList<Room> rooms = new ArrayList<>();
    private static int clientId;


    public static int getClientId() {
        return clientId;
    }

    public static void setClientId(int clientId) {
        Database.clientId = clientId;
    }
    public static ArrayList<Room> getRooms() {
        return rooms;
    }

    public static void setRooms(ArrayList<Room> rooms) {
        Database.rooms = rooms;
    }

    public static void addClient(Client client) {
        clients.add(client);
    }
    public static Client getClient(int id){
        Client client = null;
        for(Client c : clients){
            if (c.getId() == id){
                client = c;
            }
        }
        return client;
    }

    public static void addRoom(Room room) {
        rooms.add(room);
    }

    public static ArrayList<Client> getClients() {
        return clients;
    }

    public static void addReceptionist(Receptionist receptionist) {
        receptionists.add(receptionist);
    }

    public static boolean checkReceptionistInfo(Receptionist receptionist) {
        boolean correctInfo = false;
        for (Receptionist r: receptionists) {
            if (r.getId() == receptionist.getId() && r.getPassword().equals(receptionist.getPassword())) {
                correctInfo = true;
                break;
            }
        }
        return correctInfo;
    }

    public static boolean checkClientInfo(Client client) {
        boolean correctInfo = false;
        for (Client c: clients) {
            if (c.getName().equals(client.getName()) && c.getPassword().equals(client.getPassword())) {
                correctInfo = true;
                break;
            }
        }
        return correctInfo;
    }

    public static void roomAvailability(){
        //Show all the rooms available in the database, that we don't have so just generate 6 random rooms
        Scanner input = new Scanner(System.in);
        int choice = 1;
        int index;
        Room room = null;

        try {
            while (choice !=0 && Database.clients.get(choice).getRoom() == null) {
                for (int i = 0; i < 7; i++) {
                    index = i + 1;
                    Database.addRoom(new Room());
                    System.out.println(index + ". " + Database.getRooms().get(i).displayRoom());
                }

                System.out.println("Which room would you prefer? (choose 0 to exit)");
                choice = input.nextInt();
                if (choice > 0 && choice <=7){
                    room = Database.getRooms().get(choice-1);
                    Database.getClient(Database.getClientId()).setRoom(room);
                    System.out.println("For "+Database.getClient(getClientId()).getRoom().displayRoom());
                    choice = 0;
                } else {
                    System.out.println("Invalid input. Type an integer between 0-7");
                }

            }
        } catch (Exception e){
            System.out.println("Exception rasied: "+e.getMessage());
        }
    }

}
