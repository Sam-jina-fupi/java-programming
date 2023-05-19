public class Seat {
    // seat attributes
    String database;
    String seat_id = "B5";
    double price = 1000;
    boolean availability = true;

    // seat method to check if a seat id free or taken
    String is_free(){
        // if(availability == true){
        //System.out.println("Seat no: " + seat_id + "is Available. ");
        //  System.out.println("You can proceed and book it. ");
        //} else {
        //   System.out.println("Seat No " + seat_id + "is not available.");
        // }
        String seatStatus = null;
        if (availability == true){
            seatStatus = "Free";

        } else {
            seatStatus = "Taken";
        }
        return  seatStatus;
    }


    // seat method to occupy a seat if it's not taken/free
    void occupy(Card card){

        if (is_free() == "Free"){
            System.out.println("Check if your account has money to purchase the seat");
            // Check if your card/account has money to purchase the seat
            if (card.validate()>= price){
                double balance = card.validate();
                card.balance = balance - price;
                availability = false;
                System.out.println(" Purchase of seat: " + seat_id + " was successful");

                System.out.println(" Your new balance is: " + card.balance);

            } else {
                // if no money in account, tell the user they have no funds to purchase the seat
                System.out.println("There was a Problem with your card.");
            }
        } else {
            System.out.println(" Seat is taken!!!!!");
        }

    }
}