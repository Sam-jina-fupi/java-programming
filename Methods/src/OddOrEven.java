public class OddOrEven {
// write a java program that checks if a number is even or odd
// (The number is passed to the method as a parameter)

// create the method here
public class EvenOddChecker {

}
// create the main method here and call the method inside it
public static void main(String[] args) {
    int number = 10;
    if (isEven(number)) {
        System.out.println(number + " is even ");
    } else {
        System.out.println(number + " is odd ");
    }
}

    public static boolean isEven(int number) {
        return (number % 2 == 0);
    }
}
