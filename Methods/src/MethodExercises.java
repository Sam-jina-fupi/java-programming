import java.util.Scanner;

public class MethodExercises {
    // create a java program that calculates the seconds that the user has
    // lived and display.

    // create the scanner object
   // Scanner input = new Scanner(System.in);

    // create the method to get the Username
    public static String getUserName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Name: ");
        String userName = input.next();
        return userName;
    }

    // create the method to get the User age
    public static int getUserAge() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Age Too: ");
        int userAge = input.nextInt();
        return userAge;
    }

    // create the method to convert the user age into seconds
        public static int  ageInSeconds(int userAge){
            int userAgeInSeconds = (userAge * 363 * 24 * 60 * 60) / 4;
            return userAgeInSeconds;
        }

    // create the method to display the finalString userName, int userAge, int ageInSeconds)
        public static String displayUserInfo(String userName, int userAge, int ageInSeconds){
        String userInfo = "Hello " + userName + ",You are " + userAge + " years old, and You" +
                " have lived for " + ageInSeconds + " seconds";
        return userInfo;
        }

    public static void main(String[] args) {
        String userName = getUserName();
        int userAge = getUserAge();
        int ageInSeconds = ageInSeconds(userAge);
        System.out.println(displayUserInfo(userName, userAge, ageInSeconds));

    }
}
