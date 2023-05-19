import java.util.Scanner;

import javax.security.auth.Subject;

public class Exercises {
    public static void main(String[] args) {
        // write a java program tha gets marks of 5 subjects of a student in CPL
        // Then calculate the average score and displays the grade that the student got
        // based on the average score
        // use the following ranges to grade the student
        // 80 -> 100 ->A
        // 70 - 79 -> B
        // 60 - 69 -> C
        // 50 - 59 -> D
        // 0 - 49 -> F
        // use Java operators and basic math skills
        // create the variables to hold marks for the 5 subjects

        String studentName;
        String grade = null;

        int math;
        int english;
        int swahili;
        int science;
        int sst;

        int total_score;
        int average;

        // create a scanner object
        Scanner sc = new Scanner(System.in);

        // get the student name
        System.out.print("Enter Student Name : ");

        // store the student in the studentName variable
        studentName = sc.nextLine();

        // gat the scores of the studentName

        System.out.println("Enter the score of Math");
        math = sc.nextInt();

        System.out.println("Enter the score of English");
        english = sc.nextInt();

        System.out.println("Enter the score of Swahili");
        swahili = sc.nextInt();

        System.out.println("Enter the score of Science");
        science = sc.nextInt();

        System.out.println("Enter the score of Social Studies");
        sst = sc.nextInt();

        // calculate total score
        total_score = math + english + swahili + science + sst;

        // calculate average score
        average = total_score / 5;

        // test the app
        //System.out.println("The Average score is: " + average);

        // award the student using the range below based on their average score
        // 80 -> 100 ->A
        // 70 - 79 -> B
        // 60 - 69 -> C
        // 50 - 59 -> D
        // 0 - 49 -> F

        if (average >= 80 && average <= 100) {
            grade = "A";
        } else if (average >= 70 && average <= 79) {
            grade = "B";
        } else if (average >= 60 && average <= 69) {
            grade = "C";
        } else if (average >= 50 && average <= 59) {
            grade = "D";
        } else if (average >= 0 && average <= 49) {
            grade = "Umejaribu Mjengo???";
        }
        if (average > 100) {
            System.out.println("Invalid Marks!!!");
        } else {
            System.out.println("Student Name: " + studentName + ", Average: " + average + "%, Grade: " + grade);
        }

        // display the student name, average and the grade
        // System.out.println("Student Name: " + studentName + ", Average: " + average + "%, Grade: " + grade);


    }}