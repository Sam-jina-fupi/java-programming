public class Card {
        String database;
        String cardType;
        long cardNumber;
        int cardCvc;
        String cardHolder;
        double balance;

        // constructor
        public Card(String cardType, long cardNumber, int cardCvc,
                    String cardHolder, double balance) {
                this.cardType = cardType;
                this.cardNumber = cardNumber;
                this.cardCvc = cardCvc;
                this.cardHolder = cardHolder;
                this.balance = balance;
        }

        double validate() {
                if (balance > 0) {
                        return balance;
                }
                return 0;
        }
}

