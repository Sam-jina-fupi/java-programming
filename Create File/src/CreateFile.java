import java.io.File;
public class CreateFile {
    public static void main(String[] args) {
        // create  a new file using the file object
        File textFile = new File("abc.txt");

        // check if the file exist or not
        System.out.println(textFile.exists());

        // check you current working directory
        String currentDirectory = System.getProperty("user.dir");

        // display my current working directory
        System.out.println("The Current Working"
                + " Directory is: " + currentDirectory);

        File srcFolder = new File("src");
        System.out.println(srcFolder.exists());

        // Using the file object
        // method                                      Description
        // createNewFile()                             creates a new file
        // if the file with existing name doesn't exist yet on the given path.
        // canWrite()
        // Checks if the application can write to the file.
        // canRead()
        // checks if the application can write to the file
        // isDirectory()
        // checks if the file is a directory
        // getName()
        // returns the name of the file.
        // lastModified()
        // returns the last modified time (in milliseconds)
        // mkdir()
        // creates a new directory with the given name.
        // delete()
        // deletes a file or directory
        // list()
        // returns the list of files or directories
    }
}