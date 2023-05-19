public class ExplicitTypeCasting {
    public static void main(String[] args) {
        // Explicit type casting in java

        // Do you think the code below is a valid java program?
        int x = 100;
        byte y = (byte)x;
        System.out.println("Value of y is: " +y);

        // Answer: No
        // Explanation:
        // Here we are getting an error since we are trying to assign byte which is a
        // smaller data type to int which is larger than byte.
        // Implicit type Casting si snot performed in this case for thr same reason
        // since there ius a possibility of lose of information since larger data type
        // has larger range than that of a smaller data type

        // To do explicit type casting you have to add data type post assignment operator
        // byte y = (byte) x;
        // The above statement will compile successfully

        // points to remember
        // -> Explicit type casting is performed when value of larger data type is assigned
        //    to a variable of smaller data type
        // -> Explicit casting is performed by the programmer - this is also known as
        //    narrowing or down casting

        // Possible conversions where explicit type casting is performed:-
        // double -> float -> long -> int -> short -> byte
        // int -> char

        int a = 97;
        char b = (char)a;
        System.out.println(b);
        System.out.println(b);

    }


}
