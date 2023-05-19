import java.util.ArrayList;
import java.util.Scanner;

class Declarations{
    //Initializing Scanner:
    public static Scanner sc = new Scanner(System.in);

    public static String userAccountType;
    public static String recipientAccountType;

    //Initializing Bank Account Balance
    public static int newAccountBalance = 0;

    //Creating ArrayList To Store User Accounts & User Bank Accounts
    public static ArrayList<User> listOfUsers = new ArrayList<User>();
    public static ArrayList<Account> listOfAccounts = new ArrayList<Account>();

    //Declaring variable to hold userId for logged-in user
    public static int loggedInUserId;

    //Declaring variable for holding approved user record index before login
    public static String approvedUserPassword;

    //Declaring variable to hold user input password
    public static String enteredPassword;

    public static int selectedBankingServiceOption;

    public static String generalAccountType;

}