import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
        // if ... else in java

        // if statement
        // You may face scenarios where you might want to execute certain block of code
        // based on certain condition; this is where if else statement comes into the picture.

        // syntax of if statement
        // if (condition){
        // code to be executed if the condition is true

        //  }

        // Here, the statements within the braces are executed if tee condition is true,
        // however, if the condition is false the code is skipped.

        int age = 10;
        // check if the age is below 18 -> display : You are an underage

        if (age < 18){
            System.out.println("Sorry, You are below 18 years");
        }

        if (age < 18) System.out.println("Sorry, You are below 18 years");

        int temperature = 30;
        // check if the temperature is below 23 -> display :
        if (temperature > 24){
            System.out.println("Please cover your tomatoes");
        }

        // if ... else
        // There might be scenarios where you might need to execute certain codes if
        // the condition is false.
        // Now in this case, you can use if with else statement

        // syntax of if else statement in java
       //  if(condition) {
            // code to be executed if the condition is true
        // }else {
            // code to be executed if the condition is false
        // }

        String favFruit = "Apple";

        if (favFruit == "Mango") {
            System.out.println("Your favourite fruit is Mango.");
        }else {
            System.out.println("Your favourite fruit is Apple Fruit.");
        }

        // write a java software for banks, which will allow users above 21 years of age
        // to sign up and create an account if the user is below 21 years of age
        // don't allow then to create an account. (Eligible -> above 21;
        // Ineligible -> 21)
        // test it with sampleInput1 = 18 sampleInput2 -> 25

        // create the user age variable
        int userAge;

        // create the scanner object
        Scanner sc = new Scanner(System.in);

        //ask the user for their age
        System.out.println("How old is your age?");

        // get that age and assign it to userAge variable
        userAge = sc.nextInt();

        // check if the user is eligible -> Yes -> allow them to create an account
        if (userAge > 21) {
            System.out.println("You are Eligible");
        }else{
            System.out.println("Sorry, You are Ineligible");
        }

    }
}
