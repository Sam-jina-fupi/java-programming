import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create Scanner object
        Scanner input = new Scanner(System.in);


        // prompt the user for info and preferred seat
        System.out.println("Your Full Name: ");
        String fullName = input.next();

        System.out.println("Preferred Seat Number: ");
        String seatNumber = input.next();

        System.out.println("Your Card Type: ");
        String cardType = input.next();

        System.out.println(" Your card Number: ");
        long cardNumber = input.nextLong();

        System.out.println(" Your Card CVC: ");
        int cardCvc = input.nextInt();

        System.out.println(" Card Holder Name: ");
        String cardHolder = input.next();

        // create all the object
        User user = new User(fullName);
        Seat seat = new Seat();
        Card card = new Card("Visa", 37635494, "Samuel", 567,900);

        Ticket ticket= new Ticket();
        seat.occupy(card);
        //ticket.generateTicketId()







    }
}