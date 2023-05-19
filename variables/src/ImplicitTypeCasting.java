public class ImplicitTypeCasting {
    public static void main(String[] args) {
        // Let's start with an example
        byte b = 100;
        int x = b;
        System.out.println("Value of x :" + x);

        // Do you think this is a valid java program?
        //Ans: Yes it's a valid java program
        //what happened here is internally byte type of value was automatically
        // promoted to int type since we assigned it to int

        // Byte here has a smaller size than  of int.byte is of 1 byte and int is of 4 bytes.
        // Since the size of target data type is large we did not get any error on assignment
        // This is known as Implicit type casting in java
        // where the value of the smaller data type is assigned and converted to the value  of the bigger data type
        //implicit casting is performed by the compiler
        // Since the range of the smaller data type  is within  the range of the larger data type
        //This is also known as widening or upcasting

        // Possible conversions where Implicit casting is performed:-
        // Byte -> short -> int -> long -> float -> double
        //char -> int

        int i = 100;
        double d = i;
        System.out.println("value of d is:" + d);

        char c = 'a';
        int r = c;
        System.out.println("Value of r is:" + r);
    }
}
