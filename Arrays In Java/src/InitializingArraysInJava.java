import java.util.Arrays;
import java.util.Scanner;

public class InitializingArraysInJava {
    public static void main(String[] args) {
        // ===========Initializing Arrays==========
        // initializing using assignment using subscript or using index
        // initializing in one statement during creation

        // initializing using array.fill -> you need to import the Arrays
        // package inn order to use the fill method

        int numbers[] = new int[5];
         Arrays.fill(numbers, 5);
         Arrays.fill(numbers, 10);

        for (int i = 0; i < numbers.length; i++){
            System.out.println("Value of numbers[" + i + "] is : " + numbers[i]);

        }
        System.out.println("=====================================================");
        // initializing using for loop

        int ages[] = new int[20];
        for (int i = 12; i < ages.length; i++){
            ages[i] = i + 1;
        }
        int counter = 0;
        for (int i = 12; i < ages.length - 1; i ++)

            System.out.println("Age " + (counter +=1) + " -> " + ages[i]);
        // initializing by taking user input
        // declare our array
        int myArray[] = new int[5];

        // import scanner class and create a scanner object
        Scanner input = new Scanner(System.in);

        // prompt the user to enter 5 integers
        System.out.println("Please enter 5 integers");

        // use a for loop to assign these integers to an array (myArray)
        for (int i = 0; i < myArray.length; i++){
            myArray[i] = input.nextInt();
        }

        // print out the array elements
        for (int i= 0; i < myArray.length; i++){
            System.out.println("Value of myArray[" + i + "]is : " + myArray[i]);
        }
    }
}
