public class MethodsExamples {
    // static void displayUserName(String name){
    // System.out.println("Hello, My name is Sam " + name);
    // }

    public static void main(String[] args) {
        // Call the greetUser method function to execute
        //  greetUser();

        //   displayUserName("Sam");

         int x = 10;
         int y = 20;

        // addTwoNumbers(x, y);
        // addTwoNumbers(4, 5);
        // addTwoNumbers(100, 456);

        double r = 7.0;
        double area = areaOfACircle(r);
        System.out.println(area);

        System.out.println(areaOfACircle(14.0));

    }

    // Create a method that greets the user for example: "Hello Everyone"
    // public static void greetUser(){
    //  System.out.println("Hello Everyone");
    //   }

    // create a function that adds two numbers togethers and display their sum
    // static void addTwoNumbers(int num1, int num2){
    //  int sum;
    //  sum = num1 + num2;
    // System.out.println("The sum is: " + sum);
    // }

    // create a java method that calculates and return the area of a circle,
    // whose radius is passed as a parameter

    static  double areaOfACircle(double radius){
        double pi = Math.PI;
        double area;
        // area = pi * Math.pow(radius, 2)
        area = (radius * radius) * pi;
        return area;
    }

}
