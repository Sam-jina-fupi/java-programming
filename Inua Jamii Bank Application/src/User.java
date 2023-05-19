class User {

    //Member variables:
    int userId;
    String username;
    String email;
    String password;
    String fullname;
    String contact;
    String location;

    //Member Methods For This Class:
    public User(int userID, String username, String email, String password, String fullname, String contact, String location){

        this.userId = userID;
        this.username = username;
        this.email = email;
        this.password = password;
        this.fullname = fullname;
        this.contact = contact;
        this.location = location;

    }

    //Member Methods
    public void getUserInfo(){

        System.out.println("User ID : " + userId);
        System.out.println("Username : " + username);
        System.out.println("Email : " + email);
        System.out.println("Password : " + password);
        System.out.println("Full name : " + fullname);
        System.out.println("Contact : " + contact);
        System.out.println("Location : " + location);

    }

    //Getter &Setter Methods for User class
    //Getter method for userId member
    public int getUserId(){
        return userId;
    }
    //Setter method for userId member
    public void setUserId(int userId){
        this.userId = userId;
    }

    //Getter method for username member
    public String getUsername(){
        return username;
    }
    //Setter method for username member
    public void setUsername(String username){
        this.username = username;
    }

    //Getter method for email member
    public String getEmail(){
        return email;
    }
    //Setter method for email member
    public void setEmail(String email){
        this.email = email;
    }

    //Getter method for password member
    public String getPassword(){
        return password;
    }
    //Setter method for password member
    public void setPassword(String password){
        this.password = password;
    }

    //Getter method for full name member
    public String getFullname(){
        return fullname;
    }
    //Setter method for full name member
    public void setFullname(String fullname){
        this.fullname = fullname;
    }

    //Getter method for contact member
    public String getContact(){
        return contact;
    }
    //Setter method for contact member
    public void setContact(String contact){
        this.contact = contact;
    }

    //Getter method for location member
    public String getLocation(){
        return location;
    }
    //Setter method for location member
    public void setLocation(String location){
        this.location = location;
    }

}