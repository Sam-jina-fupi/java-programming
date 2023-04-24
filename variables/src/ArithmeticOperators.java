public class ArithmeticOperators {
    //Arithmetic Operators in java
    // types of operators
    // 1. arithmetic operators ->
    // + (addition)- used to perform addition on two or more operands
    // - (subtraction) - used to perform subtraction on two operands
    // * (multiplication) - used to perform multiplication on two operands
    // / (division) - used to perform division on two operands
    // % (modulus) - returns the remainder of the operation after division
    // ++ (increment) - increments the value  by 1
    // -- (decrement) - decrements the value by 1



    //increment and decrement operators in java
    //increment operators ar of 2 types
    //1. Pre increment -> value is decremented first and then assigned or used in an expression
    //2. Post increment -> value is assigned or used in an expression first and the incremented

    //decrement operators are of 2 type
    //1. Pre increment -> value is decremented first and then assigned or used in an expression
    //2. Post increment -> value is assigned or used in an expression first and the decremented





    //5. Conditional Operators
    // ?
    public static void main(String[] args) {
        int x = 20;
        int y = 30;
        //Addition
        System.out.println(x + "+" + y + "=" + (x+y));
        //Subtraction
        System.out.println(y + "-" + x + "=" + (y-x));
        //Multiplication
        System.out.println(x + "x" + y + "=" + (x*y));
        //Division
        System.out.println(y + "/" + y + "=" + (y/x));
        //Modulus
        System.out.println(x + "%" + y + "=" + (x%y));
        //Decrement
        System.out.println(y + "--"  + "=" + (y--));
        //Increment
        System.out.println(y + "++"  + "=" + (y++));
    }
}
