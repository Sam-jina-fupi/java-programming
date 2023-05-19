public class ArraysWithMethods {
    public static void main(String[] args) {
        //1. create a function that displays the element of an array
        // call that function in the main method
//        displayArray();
        int[] myArray = {1, 2, 3, 4, 5};
        displayArray(myArray);

    }

//    public static void displayArray() {
//        int numbers[] = new int[]{1, 2, 3, 4, 5};
//        for (int i = 0; i < numbers.length; i++);
//        System.out.println("Value of numbers[" + i + "] is: " + numbers[i);
//
//    }
    public static void displayArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }



    //2. create a function that takes an array as a parameter and then prints
    //out the elements of an array


        // prompt the user for 5 integers
        // assign your array with user inputs
        //  return myArray;

}

