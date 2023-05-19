import  java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        // Switch statement in Java

        // switch statement is a statement in Java that allows the user to execute
        // the statement base on a certain value in a variable or expression

        // syntax

//        switch (variable/expression) {
//            case value1:
//                statement;
//                break;
//            case value2:
//                statement;
//                break;
//            default:
//                statement
//        }

        // example 1

//         int age = 10;
//
//         switch (age) {
//             case 21:
//                 System.out.println("You are an adult");
//                 break;
//             case 17:
//                 System.out.println("You are an underage person");
//                 break;
//             default:
//                 System.out.println("Invalid Age, Enter valid Age");
//         }

        // points to remember
        // 1. Switch can be used to evaluate a value in a variable or an expression.
        // 2. Break is used to terminate switch once a match statement is executed.
        // 3. Statements in default will be executed if not matching case statement
        //    is found.

        // Rules
        // 1. Variable in switch statement can be int, short, byte, char, string, enum,
        //    Integer, Byte, Short, Character.
        // 2. Case label cannot have a variable, it has to be a constant.
        // 3. Case label has to be of the same data type of the variable or
        //    expression result in switch parentheses.

//        int temp = 32;
//
//         switch (temp) {
//             case 23:
//             System.out.println("Uncover Tomatoes");
//             break;
//             case 30:
//                 System.out.println("Cover Your Tomatoes");
//                 break;
//             default:
//                 System.out.println("STAY INDOOR!!!");
//         }

        // Write a java program that lets a customer choose an option from a menu, then
        // the program displays the program

        // Title of the menu - OUR MENU
        // 1.
        // 2.
        // 3.
        // 4. QUIT

        // declare a choice variable
        int choice = 0;

        // create scanner object
        Scanner sc = new Scanner(System.in);

        // use a do while loop to display the menu
        do {
            System.out.println();
            System.out.println("Please select a Meal to Order");
            System.out.println("1.  Starters"    );
            System.out.println("2.  Main Course" );
            System.out.println("3.  Desert"      );
            System.out.println("4.  QUIT"        );
            System.out.println("0.  EXIT"        );

            // capture input from the user and assign it choice variable
            choice = sc.nextInt();

            //begin selection structure using statement
            switch (choice) {
                case 0:
                    System.out.println();
                    System.out.println("                   EXIT                 ");
                    break;

                case 1:
                    System.out.println();
                    System.out.println("1. Starter Order                        ");
                    System.out.println("========================================");
                    System.out.println("1. Smoked salmon platter       :Ksh. 350");
                    System.out.println("2. Tuna empanadillas           :Ksh. 250");
                    System.out.println("                               ---------");
                    System.out.println("TOTAL                          Ksh.  600");
                    System.out.println("========================================");
                    break;

                case 2:
                    System.out.println();
                    System.out.println("2. Main Course Order                    ");
                    System.out.println("========================================");
                    System.out.println("1. Creamy Tuscan Chicken Pasta :Ksh. 800");
                    System.out.println("2. Easy Turkey Tetrazzini      :Ksh. 700");
                    System.out.println("                               ---------");
                    System.out.println("TOTAL                        : Ksh. 1500");
                    System.out.println("========================================");
                    break;

                case 3:
                    System.out.println();
                    System.out.println("3. Desert Order                         ");
                    System.out.println("========================================");
                    System.out.println("1. Chocolate Chip Cookies      :Ksh. 250");
                    System.out.println("2. Key Lime Pie                :Ksh. 450");
                    System.out.println("                               ---------");
                    System.out.println("TOTAL                         :Ksh.  700");
                    System.out.println("========================================");
                    break;

                case 4:
                    System.out.println("========================================");
                    System.out.println("               GOOD BYE                 ");
                    System.out.println("Thank You For Doing Business With Us.   ");
                    System.out.println("========================================");
                    break;

                default:
                    System.out.println("           Unknown Choice!!!            ");
                    System.out.println("Please Select 1, 2 and 3 to make an Order or 0 to EXIT");
            }

            } while (choice != 6) ;

    }
}