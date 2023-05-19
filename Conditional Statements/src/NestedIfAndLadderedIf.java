public class NestedIfAndLadderedIf {
    public static void main(String[] args) {
        // Nested If and Laddered If

        // Laddered If ... else ... if
        // Laddered If ... else ... if is used when there are multiple conditions to test
        // in a single if ... else ... if

        // syntax
        // if (condition1) {
        // execute code when condition one is true
        // } else if (condition2) {
        // execute code when condition one is true (condition1 is false)
        // } else if (condition3) {
        // execute code when condition one is true (condition1 and condition2 is false)
        // }else {
        // executes when none of the above conditions is true
        // }

        int dayOfTheWeek = 10;

        if (dayOfTheWeek == 1){
            System.out.println("Today is on Sunday");
        } else if(dayOfTheWeek ==2) {
            System.out.println("Today is on Monday");
        } else if (dayOfTheWeek == 3) {
            System.out.println("Today is on Tuesday");
        } else if (dayOfTheWeek == 4) {
            System.out.println("Today is on Wednesday");
        } else if (dayOfTheWeek == 5) {
            System.out.println("Today is on Thursday");
        } else if (dayOfTheWeek == 6) {
            System.out.println("Today is on Friday");
        } else if (dayOfTheWeek == 7) {
            System.out.println("Today is on Saturday");
        } else {
            System.out.println("Invalid Day");

        }

    }
    }