public class ConditionalOperators {
    public static void main(String[] args) {
        // 5. Conditional Operators Or ternary in Java
        // ? :

        // Operators in java can be classified into 3 types depending on the number of
        // operands they operate on:-
        // 1. Unary Operators - are operators which take only 1 operand.
        // example: ++, --
        // 2. Binary Operators - are operators which take 2 operands.
        // example: +, -, /, *
        // 3. Ternary Operators - are operators which take 3 operands. There is only
        // one ternary operator in java which is also known as conditional operator.

        // syntax
        // boolean-expression ? true-expression : false-expression

        // if a boolean expression is evaluated to true, then the true expression is
        // evaluated. if boolean expression is evaluated to false, then the false expression is
        // evaluated.

        // Example of ternary operator in use: (short hand of if statement)
        // lets use ternary operator to find out greatest of two numbers

        int a = 10, b = 20;
        int max = (a > b) ? a :b;
        System.out.println("The Greatest number is: " + max);

        // ternary operators can also be nested
        // Example:
        int maxNum = (10 > 20) ? 40 : ((50 >60) ? 90 : 100);
        System.out.println("The Greatest number is: " + maxNum);
    }
}
