class Services{
    //Function to create new user & account
    public void createNewUserAndAccount(){
        //Starter text
        System.out.println("==========================================================");
        System.out.println("==========================================================");
        System.out.println("Welcome to the Bank App!");
        System.out.println("Create an account to start:");

        System.out.println("==========================================================");

        System.out.println("Enter Preferred Account Type Index From The Below Options :");
        System.out.println("1. Current Account");
        System.out.println("2. Savings Account");
        int userAccountTypeSelected = Declarations.sc.nextInt();
        System.out.println("Enter preferred UserID : ");
        int newUserId = Declarations.sc.nextInt();
        System.out.println("Enter preferred Username : ");
        String newUsername = Declarations.sc.next();
        System.out.println("Enter preferred Email : ");
        String newUserEmail = Declarations.sc.next();
        System.out.println("Enter preferred Password : ");
        String newUserPassword = Declarations.sc.next();
        System.out.println("Enter preferred Full Name : ");
        String newUserFullname = Declarations.sc.next();
        System.out.println("Enter v Contact : ");
        String newUserContact = Declarations.sc.next();
        System.out.println("Enter preferred Location : ");
        String newUserLocation = Declarations.sc.next();

        System.out.println("==========================================================");

        System.out.println("Your Account Is Being Created!");

        //Creating an instance of User Class with new user data from user
        User newUser = new User(newUserId, newUsername, newUserEmail, newUserPassword, newUserFullname, newUserContact, newUserLocation);

        //Populating listOfUsers ArrayList with new users
        Declarations.listOfUsers.add(newUser);

        //Creating an instance of Account Class on successful user account creation
        Account newUserAccount = new Account(newUserId, Declarations.newAccountBalance, userAccountTypeSelected);

        //Populating listOfAccounts ArrayList with new Accounts
        Declarations.listOfAccounts.add(newUserAccount);

        System.out.println("User Account & Bank Account Created Successfully!");

        System.out.println("==========================================================");

        System.out.println("New User Has Been Registered Successfully! Welcome " + newUser.fullname + ", Your User Account Details Are :");
        newUser.getUserInfo();

        System.out.println("Your Bank Account Has Been Created Successfully. Details Are :");
        newUserAccount.getAccountInfo();

        System.out.println("==========================================================");
        System.out.println("==========================================================");

        //To print list of all users and accounts present after user registration
        displayListOfAllUsersAndAccounts();
        //Go back to main menu
        allOurServicesMenu();

    }

    //Method to get user account type
    public void userAccountTypeGetter(int userAccountTypeIdToCheck){
        if (userAccountTypeIdToCheck == 1){
            Declarations.userAccountType = "Current Account";
        }else{
            Declarations.userAccountType = "Savings Account";
        }
    }

    //Method to get user account type
    public void recepientAccountTypeGetter(int recepientAccountTypeIdToCheck){
        if (recepientAccountTypeIdToCheck == 1){
            Declarations.recipientAccountType = "Current Account";
        }else{
            Declarations.recipientAccountType = "Savings Account";
        }
    }

    //Method to get user account type
    public void generalAccountTypeGetter(int generalAccountTypeIdToCheck){
        if (generalAccountTypeIdToCheck == 1){
            Declarations.generalAccountType = "Current Account";
        }else{
            Declarations.generalAccountType = "Savings Account";
        }
    }

    //Method to log user into existing account
    public void loginToExistingAccount(){
        System.out.println("==========================================================");
        System.out.println("==========================================================");
        System.out.println("Enter The Number For User You Want To Login As From The List :");
        System.out.println("==========================================================");
        for (int i=0; i<=Declarations.listOfUsers.size()-1; i++){
            System.out.println(i + ". " + Declarations.listOfUsers.get(i).userId + "    " + Declarations.listOfUsers.get(i).username + "    " + Declarations.listOfUsers.get(i).fullname + "    " + Declarations.listOfUsers.get(i).email + "    " + Declarations.listOfUsers.get(i).contact + "    " + Declarations.listOfUsers.get(i).password + "    " + Declarations.listOfUsers.get(i).location );
        }
        System.out.println("==========================================================");
        System.out.println("==========================================================");

        String loginUserId = Declarations.sc.next();

        //Checking User Input String For UserId Or Unwanted Text
        loginInputIdStringChecker(loginUserId);

        //Going Back to Main Menu
        allOurServicesMenu();
    }

    //Method for checking user input fot unwanted text in userId
    public void loginInputIdStringChecker(String toBeChecked){
        if (toBeChecked.contains("^[a-zA-Z]*$")){
            System.out.println("==========================================================");
            System.out.println("Only Integer Inputs Allowed!");
            System.out.println("==========================================================");
        }
        else{

            //if case for checking if input integer for user id is in the arraylist indexes
            if (Declarations.listOfUsers.size()-1 < Declarations.loggedInUserId){
                System.out.println("==========================================================");
                System.out.println("User Number Not Found! Enter A Valid Index From The List!");
                System.out.println("==========================================================");
            } else{
                //Assigning loggedInUserId after checking that it's an integer value and within the bounds of the member indexes of the arraylist
                Declarations.loggedInUserId = Integer.parseInt(toBeChecked);
                Declarations.approvedUserPassword = Declarations.listOfUsers.get(Declarations.loggedInUserId).password;

                //Prompting user for password of the valid user list item number
                System.out.println("==========================================================");
                System.out.println("==========================================================");
                System.out.println("Welcome " + Declarations.listOfUsers.get(Declarations.loggedInUserId).fullname + ". Kindly enter your password to continue :");
                Declarations.enteredPassword = Declarations.sc.next();
                System.out.println("==========================================================");

                //Calling method to check input password
                passwordChecker();
            }
        }
    }

    public void passwordChecker(){
        //Checking if user password is correct
        if (Declarations.approvedUserPassword.equals(Declarations.enteredPassword)){
            System.out.println("Credentials Valid! Login Successful! Here Are Services You Can Utilize From Your Account");
            //successful login menu to show here
            successfulLoginServicesMenu();
            System.out.println("==========================================================");
            System.out.println("==========================================================");
        }else{
            System.out.println("==========================================================");
            System.out.println("Wrong Password For Selected Account! Try Again!");
            System.out.println("==========================================================");
            loginToExistingAccount();
        }
    }

    public void successfulLoginServicesMenu(){
        System.out.println("==========================================================");
        //To Retrieve User account type of logged-in user
        userAccountTypeGetter(Declarations.listOfAccounts.get(Declarations.loggedInUserId).accountType);
        System.out.println("Welcome " + Declarations.listOfUsers.get(Declarations.loggedInUserId).fullname + ", Here Are Services You Can Execute From Your " + Declarations.userAccountType);
        System.out.println("Your Current Account Balance Is : " + Declarations.listOfAccounts.get(Declarations.loggedInUserId).accountBalance);
        System.out.println("Enter An Option Number To Proceed!");
        System.out.println("==========================================================");
        System.out.println("1. Funds Deposit");
        System.out.println("2. Funds Withdrawal");
        System.out.println("3. Funds Transfer");
        System.out.println("4. Check Balance");
        System.out.println("5. Logout");
        System.out.println("==========================================================");
        String holder = Declarations.sc.next();
        //Declarations.selectedBankingServiceOption = ;
        System.out.println("==========================================================");
        //To check user input string for validity
        SelectedBankingServiceOptionInputChecker(holder);
    }

    public void SelectedBankingServiceOptionInputChecker(String checkThis){
        if (checkThis.contains("^[a-zA-Z]*$")){
            System.out.println("==========================================================");
            System.out.println("Only Integer Inputs Allowed! Try Again!");
            System.out.println("==========================================================");
            successfulLoginServicesMenu();
        }else if(checkThis.equals("1")){
            fundsDeposit();
        }else if(checkThis.equals("2")){
            fundsWithdrawal();
        }else if(checkThis.equals("3")){
            fundsTransfer();
        }else if(checkThis.equals("4")){
            checkBalance();
        }else if(checkThis.equals("5")){
            logout();
        }else{
            System.out.println("==========================================================");
            System.out.println("Invalid Input!");
            System.out.println("==========================================================");
            successfulLoginServicesMenu();
        }
    }

    public void fundsDeposit(){
        System.out.println("==========================================================");
        System.out.println("Hi, " + Declarations.listOfUsers.get(Declarations.loggedInUserId).fullname + "! Enter Amount Of Funds You Want To Deposit To Your " + Declarations.userAccountType + " :");
        System.out.println("Your Current Account Balance Is : " + "Ksh. " + Declarations.listOfAccounts.get(Declarations.loggedInUserId).accountBalance);
        System.out.println("==========================================================");
        String amountToDeposit = Declarations.sc.next();
        if (amountToDeposit.contains("^[a-zA-Z]*$")){
            System.out.println("==========================================================");
            System.out.println("Only Integer Inputs Allowed! Try Again!");
            System.out.println("==========================================================");
            successfulLoginServicesMenu();
        }else{
            int previousAccountBalance = Declarations.listOfAccounts.get(Declarations.loggedInUserId).accountBalance;
            int moneyToDeposit = Integer.parseInt(amountToDeposit);
            int currentBalance = Declarations.listOfAccounts.get(Declarations.loggedInUserId).accountBalance + moneyToDeposit;
            Declarations.listOfAccounts.get(Declarations.loggedInUserId).accountBalance = currentBalance;
            System.out.println("Deposit Successful! You have successfully deposited Ksh. " + moneyToDeposit + " To Your " + Declarations.userAccountType);
            System.out.println("Your Previous Account Balance Was Ksh. " + previousAccountBalance);
            System.out.println("Your New Account Balance Is : " + Declarations.listOfAccounts.get(Declarations.loggedInUserId).accountBalance);
            successfulLoginServicesMenu();
        }
        System.out.println("==========================================================");
        System.out.println("==========================================================");
    }

    public void fundsWithdrawal(){
        System.out.println("==========================================================");
        System.out.println("Hi, " + Declarations.listOfUsers.get(Declarations.loggedInUserId).fullname + "! Enter Amount Of Funds You Want To Withdraw :");
        System.out.println("Your Current Account Balance for your " + Declarations.userAccountType + " Is : " + "Ksh. " + Declarations.listOfAccounts.get(Declarations.loggedInUserId).accountBalance);
        System.out.println("==========================================================");
        String amountToWithdraw = Declarations.sc.next();
        if (amountToWithdraw.contains("^[a-zA-Z]*$")){
            System.out.println("==========================================================");
            System.out.println("Only Integer Inputs Allowed! Try Again!");
            System.out.println("==========================================================");
            successfulLoginServicesMenu();
        }else{
            int moneyToWithdraw = Integer.parseInt(amountToWithdraw);
            if(moneyToWithdraw > Declarations.listOfAccounts.get(Declarations.loggedInUserId).accountBalance){
                System.out.println("==========================================================");
                System.out.println("Failed! You do not have sufficient Balance For This Transaction!");
                System.out.println("==========================================================");
                successfulLoginServicesMenu();
            }else{
                int currentBalance = Declarations.listOfAccounts.get(Declarations.loggedInUserId).accountBalance - moneyToWithdraw;
                Declarations.listOfAccounts.get(Declarations.loggedInUserId).accountBalance = currentBalance;
                System.out.println("==========================================================");
                System.out.println("Your Have Successfully Withdrawn : " + "Ksh. " + moneyToWithdraw + " From Your " + Declarations.userAccountType);
                System.out.println("Your New Account Balance For Your " + Declarations.userAccountType + " Is : " + Declarations.listOfAccounts.get(Declarations.loggedInUserId).accountBalance);
                successfulLoginServicesMenu();
            }
        }
        System.out.println("==========================================================");
    }

    public void fundsTransfer(){
        System.out.println("==========================================================");
        System.out.println("==========================================================");
        System.out.println("Hi " + Declarations.listOfUsers.get(Declarations.loggedInUserId).fullname + ", here you can transfer funds from your " + Declarations.userAccountType + " to another user's account. Enter index of target account from the list of accounts below to continue :");
        for(int i = 0; i <= Declarations.listOfAccounts.size() - 1; i++){
            generalAccountTypeGetter(Declarations.listOfAccounts.get(i).accountType);
            System.out.println("Index : " + i + ". User Account ID : " + Declarations.listOfAccounts.get(i).userId + "   Username : " + Declarations.listOfUsers.get(i).fullname + "    Account Type : " + Declarations.generalAccountType);
        }
        System.out.println("==========================================================");
        String accountIndexEntered = Declarations.sc.next();
        if (accountIndexEntered.contains("^[a-zA-Z]*$")){
            System.out.println("==========================================================");
            System.out.println("Only Integer Inputs From The List Index Allowed! Try Again!");
            System.out.println("==========================================================");
            successfulLoginServicesMenu();
        }else{
            int recipientAccountIndex = Integer.parseInt(accountIndexEntered);
//            recipientAccountTypeGetter(recipientAccountIndex);
            if(recipientAccountIndex > Declarations.listOfAccounts.size()-1){
                System.out.println("==========================================================");
                System.out.println("Failed! Index Entered Does Not Exist In The List Of Available Accounts!!");
                System.out.println("==========================================================");
                successfulLoginServicesMenu();
            }else{
                int currentBalanceInSenderAccount = Declarations.listOfAccounts.get(Declarations.loggedInUserId).accountBalance;
                System.out.println("Enter amount you want to transfer to " + Declarations.listOfUsers.get(recipientAccountIndex).fullname + "'s account :");
                String amountToTransfer = Declarations.sc.next();
                if (amountToTransfer.contains("^[a-zA-Z]*$")){
                    System.out.println("==========================================================");
                    System.out.println("Only Integer Inputs From The List Index Allowed! Try Again!");
                    System.out.println("==========================================================");
                    successfulLoginServicesMenu();
                }else{
                    int finalAmountToTransfer = Integer.parseInt(amountToTransfer);
                    if (finalAmountToTransfer > Declarations.listOfAccounts.get(Declarations.loggedInUserId).accountBalance){
                        System.out.println("==========================================================");
                        System.out.println("Failed! You do not have suffiecient Balance For This Transaction!");
                        System.out.println("==========================================================");
                    }else{
                        //Making the deduction in logged-in user acc balance
                        Declarations.listOfAccounts.get(Declarations.loggedInUserId).accountBalance = Declarations.listOfAccounts.get(Declarations.loggedInUserId).accountBalance - finalAmountToTransfer;

                        //Making the transfer
                        Declarations.listOfAccounts.get(recipientAccountIndex).accountBalance = Declarations.listOfAccounts.get(recipientAccountIndex).accountBalance + finalAmountToTransfer;

                        System.out.println("==========================================================");
                        System.out.println("Your Have Successfully Transferred : " + "Ksh. " + finalAmountToTransfer + " To User " + Declarations.listOfUsers.get(recipientAccountIndex).fullname + "'s " + Declarations.recipientAccountType + "!");
                        System.out.println("Your New Account Balance Is : " + Declarations.listOfAccounts.get(Declarations.loggedInUserId).accountBalance);
                        System.out.println("==========================================================");
                        System.out.println("==========================================================");
                        successfulLoginServicesMenu();
                    }
                }
            }
        }
    }

    public void checkBalance(){
        Declarations.listOfAccounts.get(Declarations.loggedInUserId).getAccountBalance();
        System.out.println("==========================================================");
        System.out.println("==========================================================");
        System.out.println("Your " + Declarations.userAccountType + "Account Balance Is :   Ksh. " + Declarations.listOfAccounts.get(Declarations.loggedInUserId).accountBalance + "    Only.");
        System.out.println("==========================================================");
        System.out.println("==========================================================");
        successfulLoginServicesMenu();
    }

    public void logout(){
        System.out.println("==========================================================");
        System.out.println("==========================================================");
        System.out.println("Successfully Logged Out!");
        System.out.println("==========================================================");
        System.out.println("==========================================================");
        allOurServicesMenu();
    }

    //Method used to print list of all users and accounts in the bank
    public void displayListOfAllUsersAndAccounts(){
        System.out.println("==========================================================");
        System.out.println("==========================================================");
        //Printing list of all users
        System.out.println("A list of all users :");
        for (int i=0; i<=Declarations.listOfUsers.size()-1; i++){
            System.out.println(i + ". " + Declarations.listOfUsers.get(i).userId + "    " + Declarations.listOfUsers.get(i).username + "    " + Declarations.listOfUsers.get(i).fullname + "    " + Declarations.listOfUsers.get(i).email + "    " + Declarations.listOfUsers.get(i).contact + "    " + Declarations.listOfUsers.get(i).password + "    " + Declarations.listOfUsers.get(i).location );
        }

        //Printing list of all accounts
        System.out.println("A list of all accounts :");
        for (int i=0; i<=Declarations.listOfAccounts.size()-1; i++){
            System.out.println(i + ". " + Declarations.listOfAccounts.get(i).userId + "    " + "Ksh" + Declarations.listOfAccounts.get(i).accountBalance);
        }

        System.out.println("==========================================================");
        System.out.println("==========================================================");
        allOurServicesMenu();
    }

    String selectedMenuOption;

    //Method used to Dispay All Services offered by the bank
    public void allOurServicesMenu(){

        System.out.println("==========================================================");
        System.out.println("1. Create New Account");
        System.out.println("2. Login To Existing Account");
        System.out.println("3. Exit Bank App!");
        System.out.println("==========================================================");
        selectedMenuOption = Declarations.sc.next();
        createAccountOrLoginInputValidator();
    }

    //Method to check input for selected menu option
    public void createAccountOrLoginInputValidator(){
        //Conditional to check user input and give appropriate output
        if (selectedMenuOption.equals("1")){
            createNewUserAndAccount();
        }
        else if (selectedMenuOption.equals("2")){
            loginToExistingAccount();
        }else if (selectedMenuOption.equals("3")){
            System.out.println("==========================================================");
            System.out.println("==========================================================");
            System.out.println("Bye ;-P !");
            System.out.println("==========================================================");
            System.out.println("==========================================================");
            System.exit(0);
        }else{
            System.out.println("Invalid Response! Not Allowed!");
            allOurServicesMenu();
        }
    }

    //Method to Create New User Account(Option 1 on main menu)

}