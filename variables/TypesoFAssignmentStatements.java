public class TypesoFAssignmentStatements {
    public static void main(String[] args){
        //Type of Assignment Statements in Java
        // There are 3 types of assignment statements in java
        //1. Simple Assignment
        //2. chained assignment
        //3. Compound assignment

        // 1. Simple assignment
        int x = 10;
        // This is an example of a simple assignment where in value on the right is
        // assigned og the left.
        // We can also have variables o the right side,so the value of the variable on the right hand-side,
        //sits in the variable on the left hand side.
        int y = x;
        // 2.Chained assignment
        // is done to assign single value to multiple variables at once
        // Example
        int a, b, c, d;
        a = b = c = d = 200;
        System.out.println(a + "..." + b + "..." + c + "..." + d + "...");
        // Output -> 200...200...200...200
        // When using chained assignment, keep in mind, you cannot perform chained assignment during declaration
        //int p = q = r = s =100;
        //Above code is not a valid java program

        // 3. Compound Assignment
        //Whenever we use assignment operator with some other operator to initialize
        // value it is called COMPOUND ASSIGNMENT.
        int z =30;
        z += 20; // z = z +20
        System.out.println("Value of z is:" + z);
        // Output is 50

        // Points to remember
        // Whenever you use compound assignment implicit type casting is automatically
        // performed
        // Scenario
        byte u = 10;
        u = (byte)(u + 30);
        System.out.println("Value of u is:" + u);
        //  Output -> You will get a compile time error on executing above code

        // Scenario 2
        byte v = 10;
        v += 30; // v = v + 30;
        System.out.println("Value of v is:" + v);
        // output -> 40


        // In case  of Compound assignment operators, type casting will be performed
        // automatically.
        // So, v += 30 is equivalent to v = (type of v)(v + 30)
    }
}
