class Account {

    //Member variables
    int userId;
    int accountBalance;
    int accountType;

    //Member methods for this class
    public Account (int userID, int balance, int accountType) {

        this.userId = userID;
        this.accountBalance = balance;
        this.accountType = accountType;

    }

    //Member methods
    public void getAccountInfo(){

        System.out.println("User ID : " + userId);
        System.out.println("Account Balance : " + accountBalance);

    }

    //Getters & Setter for member variables
    //Getter for userId member variable
    public int getUserId(){
        return userId;
    }
    //Setter for userId member variable
    public void setUserId(int userId){
        this.userId = userId;
    }

    //Getter for accountBalance member variable
    public int getAccountBalance(){
        return accountBalance;
    }
    //Setter for accountBalance member variable
    public void setAccountBalance(int accountBalance){
        this.accountBalance = accountBalance;
    }

    //Getter for accountBalance member variable
    public int getAccountType(){
        return accountType;
    }
    //Setter for accountBalance member variable
    public void setAccountType(int accountType){
        this.accountType = accountType;
    }

}