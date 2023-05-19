import java.util.Scanner;
public class Exercises {
    public static void main(String[] args) {
        // write a java program that swaps 2 numbers using a third variable

        //solution
        // declare 3 variables
        int a;
        int b;
        int temp;

        // get the values of the variables from the user -> TODO
        // 1. You need to use Scanner class - that has the input and output streams
        // 2. To use Scanner, we need to import it from java.util package
        // 3. Instantiate a Scanner object
        // Scanner sc = new Scanner(System.in);
        // 4. We have methods to read all the types of data java from the Scanner object
        // The methods are as follows
        // a -> next() : used to read strings from the keyboard eg sc.nextLine();
        // b -> nextLine() : used to read strings from the keyboard
        // c -> nextInt() : used to read integers
        // d -> nextFloat() : used to read floats
        // e -> nextLong() : used to read Long values
        // f -> nextDouble : used to read Double values
        // g -> nextChar : used to read Long values

        //create a scanner object
        Scanner sc = new Scanner(System.in);

        //prompt the user to enter the first number
        System.out.println("Please enter the first number: ");
        // assign a with the value from the user
        a = sc.nextInt();
        //prompt the user to enter the second number
        System.out.println("Please enter the second number: ");
        // assign b with the value from the user
        b = sc.nextInt();


        // assign values to our variables
        // a = 10;
        // b = 20;

        // swap the values
        // temp = a;
        // a = b;
        // b = temp;

        temp = a + b;
        a = temp - a;
        b = temp - b;

        // display the swapped values
        System.out.println("Value of temp is: " + temp);

        System.out.println("Value of a is: " + a);
        System.out.println("Value of b is: " + b);

        }
    }
