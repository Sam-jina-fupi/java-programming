public class ArraysExercises {
    //1. Create a java program that calculates the average of an array.(use functions):- find average
//                                                                                     - param -> array

    // create the main method here
    public static void main(String[] args) {
        // declare an array of any size of integers
        int ages[] = new int[]{1,2,3,4,5,21};

        // pass that array to findAverage() method
        int avg = findAverage(ages);

        // display the average of our array elements
        System.out.println("The average is: " + avg);
    }

    // create the findAverage method here
    // then call it in the main method
    public static int findAverage(int numbers[]) {
        // create two variables - sum and average
        // [1, 2, 3, 4, 5]
        int sum = 0;
        int average;

        // crate a loop to extract a single element and add it to sum
        for (int counter = 0; counter < numbers.length; counter++) {
            sum = sum + numbers[counter];
        }

        // find the average
        average = sum / numbers.length;
        return average;
    }



//2. Write a java program that takes an array of integers as a parameter and then returns the smallest integer in
//   that array
// create a method that takes an array of integers as a parameter
// then checks for the smallest integer in that array and return it.
// call the function in the main method and pass an array to it.

public class SmallestIntegerFinder {

    public static int findSmallestInteger(int[] arr) {
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }
    public static int findSmallest(int[] numbers){
        // create a variable to store the smallest number
        int smallest = 0;
        // use a for loop and if statements to find the smallest number

        return smallest;
    }
}

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 2, 9, 1};
        int smallest = findSmallestInteger(arr);
        System.out.println("The smallest integer in the array is: " + smallest);
    }
}