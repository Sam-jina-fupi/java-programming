import java.util.Random;
import java.util.Scanner;

public class Ticket {
    String ticketId;
    String user;
    double price;
    String seat;

    // create a random number object
    Random randomNumber = new Random();
    Scanner sc = new Scanner(System.in);

    // a method to generate a ticket/receipt purchase was successful
    void  to_pdf(){

    }

    void generateTicketId(){
        Random randomNumber = new Random();
        int low = 1;
        int high = 6;
        int ranNumber = randomNumber.nextInt(6);
        // System.out.println("Random Number between 1 and 10: " + ranNumber);

        // create a random number guesser game between 1 and 6
        System.out.println("Hello User, Guess a number between 1 and 6: ");
        int userNumber = sc.nextInt();

        if (userNumber == ranNumber) {
            System.out.println("Congrats!!!, You guessed it correctly, The " +
                    "Number was: " + ranNumber);
        }else {
            System.out.println("Sorry, You did not guess it correctly. Please " +
                    "try again. The Number was: " + ranNumber);
        }
    }
}
