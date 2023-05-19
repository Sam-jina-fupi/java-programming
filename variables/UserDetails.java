import java.util.Scanner;
public class UserDetails {
    // Write a java program that prompts a user to enter their name,gender and age. then display a nice output.
    //Hello{Muthoni} You are {Male} student and your {20} years old

    public static void main(String[] args) {
        // Declear our variables
        String username;
        String userGender;
        String userAge;

        // instanciate the scanner object
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your name: ");

        //get the name of and assign it to the user
        username = sc.next();

        //promt user to enter gender
        System.out.print("Please enter your Gender: ");

        // get the gender and assign it to the user
        userGender = sc.next();

        //
        System.out.print("Please enter your Age too: ");

        userAge= sc.next();

        //display the output in a nice format
        System.out.print(" Hello " + username + " You are a " + userGender + " student, and  you are " +userAge + " years old. ");

    }
}
// write a java program that calculates the area and circumference of a circle. the user should provide the radius to our program