import java.util.Scanner;
public class SwitchCaseDefaultExercises {
    public static void main(String[] args) {
        // Write a java program to accept the grade of the student from the console and
        // congratulate him/her.
        // Required : Use Switch Case Statement

        // if the grade is 'A', print 'Excellent'
        // if the grade is 'B', print 'Amazing'
        // if the grade is 'C', print 'Well Done'
        // if the grade is 'D', print 'You can do better next time'
        // if the grade is anything else apart from the above, print 'Invalid Grade Entered!!!'

        // Solution:

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the grade of the student: ");
        char grade = input.next().charAt(0);

        switch (grade) {
                    case 'A':
                        System.out.println("Excellent");
                    case 'B':
                        System.out.println("Amazing");
                    case 'C':
                        System.out.println("Well Done");
                    case 'D':
                        System.out.println("You can do better next time");
                        break;
                    default:
                        System.out.println("Invalid Grade Entered!!!");
                        break;
                }
            }
        }
