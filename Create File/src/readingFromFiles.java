import java.io.FileReader;
import java.io.IOException;

    public class readingFromFiles {
        public static void main(String[] args) throws IOException {
            // create a fileReader object
            FileReader fileReader = new FileReader("abc.txt");
            int i = fileReader.read();

//        while(i!= -1){
//            System.out.println((char)i);
//            i = fileReader.read();
//        }
            char[] c = new char[100];
            fileReader.read(c,0,1);
            System.out.println(c);

            for (char x :c){
                System.out.println("char: " + i);
            }

            fileReader.close();
        }
    }
