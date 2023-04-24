public class AssignmentOperators {
    public static void main (String[] args){
        //4. Assignment Operators
        // = (assignment operator) : this operator assign the value on the RHS to the
        //variable on the LHS
        // += : can be used as a short form of (a = a + b); using this operator we can
        //rewrite the above statement as (a +=4)

        // -= : can be used as a short form of (a = a - b); using this operator we can
        //rewrite the above statement as (a -=4)

        // *= : can be used as a short form of (a = a * b); using this operator we can
        //rewrite the above statement as (a *=4)

        // /= :can be used as a short form of (a = a +b); using this operator we can
        //rewrite the above statement as (a /= 4)

        // %= :can be used as a short form of (a = a % b); using this operator we can
        //rewrite the above statement as (a %= 4)

        int a = 2;
        int b = 3;

        System.out.println(a += b);
        System.out.println(a -= b);
        System.out.println(a *= b);
        System.out.println(a /= b);
        System.out.println(a %= b);

    }

}
