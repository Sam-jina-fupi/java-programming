public class TypesOfAssignmentStatement {
    public static void main(String[] args) {
        //Types of Assignment Statements in Java
        //There are 3 types of assignment in java
        //1. Simple Assignment
        //2. Chained Assignment
        //3. Compound Assignment

        // 1. Simple Assignment
        int x = 10;
        // This is an example of a simple assignment where in value on the right is
        // assigned on the left
        // We can also have variables on the right side, so the value of variable on the RHS,
        // sits in the variable on the LHS
        int y = x;

        // 2. Chained Assignment
        // is done to assign single value to multiple variables at once
        // Example
        int a, b, c, d;
        a = b = c = d = 200;
        System.out.println(a + "..." + b + "..." + c + "..." +d);
        // output -> 200...200...200...200
        // when using chained assignment, keep in mind, you cannot perform chained assignment
        // during declaration
        // int p = q = r = s = 100;
        // Above code ia not a valid java code

        // 3. Compound Assignment
        // Whenever we use assignment operator  with some other operator to initialize
        // value, it is called compound assignment
        int z = 30;
        z += 20; // z = z + 20 ; i = i + 10 -> i += 10;
        System.out.println("Value of z is: " + z);
        // Output -> 50

        // Points To Remember
        // whenever you use compound assignment, implicit type casting is automatically
        // performed
        // Scenario 1
        byte u = 10;
        u = (byte) (10 +30); //u = u + 1;
        System.out.println("Value of b is: " + u);
        // Output -> You will get a complete time error on executing above code

        // Scenario 2
        byte v = 10;
        b += 30; // v = v + 30;
        System.out.println("Value of v is: " + v);
        // Output -> 40

        // Incas eof compound assignment operators, type casting will be performed
        // automatically.
        // So, v += 30 is equivalent to v = (type of v) (v +30)
    }
}
