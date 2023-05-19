public class BreakAndContinue {
    public static void main(String[] args) {
        // break statement -> terminates code execution if something is net
        for (int x = 1; x <= 10; x++) {
            // check if x is equal to 5
            // if its equal to 5, then terminate the program
            if (x == 5) {
                break;
            }
            System.out.println(x);
        }

        System.out.println("---------------------------------------------------");
        // continue
        for (int x = 1; x <= 10; x++) {
            // check if x is equal to 5
            // if its equal to 5, then terminate the program
            if (x == 5) {
                continue;
            }
            System.out.println(x);
        }
    }
}