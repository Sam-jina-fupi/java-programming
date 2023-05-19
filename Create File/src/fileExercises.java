import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

    public class fileExercises {
        public static void main(String[] args) throws IOException {
            // Write a program that captures username and age
            // then writes user info to a file
            FileWriter fw = new FileWriter("users.txt", false);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter your name: ");
            String username = br.readLine();

            System.out.println("Enter your age too: ");
            int userAge = br.read();

            fw.write("Name " + username + " Age: " + userAge + "\n");

            fw.close();
        }
    }
