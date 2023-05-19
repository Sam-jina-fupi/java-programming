import java.util.Scanner;

public class UnboundedDoWhileLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        String myName = null;
//
//        do {
//            System.out.println("Please Enter Your Name"); // Samuel
//             myName = sc.next();
//            System.out.println("My name is: " + myName);
//        x++;
//        } while (x <= 5);

        // Write a do while loop that ask the user to enter two numbers
        // The numbers should be added to the sum displayed.
        // After adding and printing, the loop should ask whether the
        // user wishes to perform the operation again.
        // If so, the loop should repeat; Otherwise it should terminate.

        // Solution:

        // create a variable to store the user's choice
        int input = 0;
        // Enter the first number
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();

        // Enter the second number
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();

        // calculate the sum of the two numbers
        int sum = num1 + num2;

        // display thr sum of the two numbers
        System.out.println("The sum is: " + sum);

        // prompt the user to continue or quit
        System.out.println("Enter option 1 to continue or option 2 to quit");
        input = sc.nextInt();
        //  }while (input != 2);

        //   }


    }
}