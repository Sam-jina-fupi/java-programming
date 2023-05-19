import java.util.Scanner;

public class NameAndAgeArraysExercise {
    //3. create a java program that checks the smallest age ina n arrays of ages
// then prints out a nice output if that person alongside their actual age.
// create a function to get the names of 5 persons and return an array.
// create another function that will get the ages and return an array of ages.
// create a function that will print out the nice formatted output

    // function to get names of the users
    public  static String [] GetUserNames(){
        Scanner sc = new Scanner(System.in);
        String userNamesArray[] = new String[5];
        System.out.println("Please Enter 5 names: ");
        for (int i = 0; i < userNamesArray.length; i++){
            userNamesArray[i] = sc.nextLine();
        }
        return userNamesArray;

    }
    // function to get the ages of the users
    public static int[] GetUserAge(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Age of the 5 person: ");
        int userAgeArray[] = new int[5];
        for (int i = 0; i < userAgeArray.length; i++) {
            userAgeArray[i] = sc.nextInt();
        }
        return userAgeArray;
    }

    // function to output the name and age of the youngest user
    public  static  void displayYoungestUser(String[] names, int[] ages){
        int smallestAge = ages[0];
        int youngestAge = 0;
        for (int i = 1; i < ages.length; i++){
            if (ages[i > smallestAge){
                smallestAge = ages[i];

            }
        }
        System.out.println(smallestAge);
        System.out.println();
    }

    public static void main(String[] args) {
        String names[] = GetUserNames();
        int ages[] = GetUserAge();
        displayYoungestUser(names, ages);
    }


}


