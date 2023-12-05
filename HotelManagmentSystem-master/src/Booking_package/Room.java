package Booking_package;

import java.util.Random;

public class Room {
    /*attributes*/
    private String type; //Deluxe or standard
    private int price;
    private String numberOfPeople; // 1 -> simple, double, triple

    public Room(){
        Random rand = new Random();
        int randomNumberOfPeople = rand.nextInt(1,4);
        int randomType = rand.nextInt(1,3);

        this.setType(randomType);
        this.setNumberOfPeople(randomNumberOfPeople);
        this.setPrice(randomNumberOfPeople, randomType);
    }

    public void setType(int num){
        switch(num){
            case 1:
                this.type = "Standard";
                break;
            case 2:
                this.type = "Deluxe";
                break;
        }
    }

    public void setNumberOfPeople(int num){
        switch(num){
            case 1:
                this.numberOfPeople = "Simple";
                break;
            case 2:
                this.numberOfPeople = "Double";
                break;
            case 3:
                this.numberOfPeople = "Triple";
                break;
        }
    }

    public void setPrice(int nop, int type){
        int startingPrice = 100;
        int endPrice = 110 * type * nop;

        Random rand = new Random();
        this.price = rand.nextInt(startingPrice, endPrice);
    }

    public String displayRoom(){
        return "Room: "+this.numberOfPeople+" "+this.type+" for $"+this.price;
    }

    public int getPrice() {
        return price;
    }
/*
    public void roomAvailability(){
        //Show all the rooms available in the database, that we don't have so just generate 6 random rooms
        Scanner input = new Scanner(System.in);
        int choice = 0;
        int index;
        try {
            while (choice != 0) {
                for (int i = 0; i < 7; i++) {
                    index = i + 1;
                    Database.addRoom(new Room());
                    System.out.println(index + ". ");
                    Database.getRooms().get(i).displayRoom();
                }

                System.out.println("Which room would you prefer? (choose 0 to exit)");
                choice = input.nextInt();
            }
        } catch (Exception e){
            System.out.println("Exception rasied: "+e.getMessage());
        }
    }*/

}