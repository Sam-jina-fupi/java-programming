public class LogicalOperators {
    public static void main (String[] args){
        //Logical Operators -> There are 3 kinds of logical operators in java
        // && (and operator) : This operator return true if both operands are true
        // || (or operator) : This operator returns true if any of the operands are true
        // ! (not operator) : This operator works with only one operand and reverses the
        //boolean value


        boolean op1 = true;
        boolean op2 = true;

        //and operator
        System.out.println(op1 && op2);
        System.out.println(op1 || op2);
        System.out.println(!op1);

        //create two variables
        int x =20;
        int y = 40;

        System.out.println((x <= y) && (x <y));


    }
}
