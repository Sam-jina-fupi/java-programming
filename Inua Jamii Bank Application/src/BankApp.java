class BankApp {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("==========================================================");
        System.out.println("Welcome to The Bank App!");
        System.out.println("Here is a list of all Services we offer! Enter an Option Number to access the service!");
        Services newServices = new Services();
        newServices.allOurServicesMenu();
        System.out.println("==========================================================");
    }

}