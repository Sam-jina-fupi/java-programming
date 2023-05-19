import java.io.FileWriter;
import java.io.IOException;

    public class  writingToFiles {
        public static void main(String[] args) throws IOException {
            // create an instance of FileWriter class
            FileWriter fileWriter = new FileWriter("abc.txt", false);


            // Write to the file
            fileWriter.write("Sample Text");

            // create an array of characters to write to file
            char[] myCharacterArray = new char[]{'a','b','c'};

            // write the array to our file
            fileWriter.write(myCharacterArray);
            fileWriter.write('x');

            // close the filewriter object
            fileWriter.flush();
            fileWriter.close();

        }
    }
