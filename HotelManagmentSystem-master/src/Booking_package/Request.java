package Booking_package;

public class Request {
    private String message;

    public Request(String message){
        if (message.length() < 201) {
            this.message = message;
        } else {
            System.out.println("Request exceeded the maximum amount of characters");
        }
    }

    public String getMessage() {
        return message;
    }
}
