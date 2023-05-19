import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        // you'll need 5 arrays

        String bookTittle[] = new String[10];
        String bookAuthor[] = new String[10];
        int yearReleased[] = new int[10];
        int bookPrice[] = new int[10];
        String Book[] = new String[10];

        Menu(bookTittle, bookAuthor, yearReleased, bookPrice, Book);
    }

    public static void Menu(String bookTittle[], String bookAuthor[], int yearReleased[],
                            int bookPrice[], String[]  Book) {
        Scanner sc = new Scanner(System.in);
        boolean isRunning;
        int choice = 6;
        do {
            System.out.println("=======================================================");

            System.out.println(" \t\t\t\t\tINVINCIBLE BOOKSHOP");

            System.out.println("=======================================================");

            System.out.println("WELCOME TO MY BOOKSHOP,CHOOSE AN OPTION FROM THE MENU");

            System.out.println(" 1. Add A Book ");
            System.out.println(" 2. Display The Books ");
            System.out.println(" 3. Update A New Book ");
            System.out.println(" 4. Search A Book By its Title ");
            System.out.println(" 5. Delete An Existing Book ");
            System.out.println(" 6. To Quit ");

            System.out.println("=======================================================");
            System.out.println(" Your Choice: ");
            choice = sc.nextInt();
            System.out.println("========================================================");
            System.out.println("Thank you !!!, For purchasing The Book ");

            // check  for the user

            if (choice == 1){
                // register new book
                System.out.println(" Enter Book Title: ");
                String bookTitle = sc.next();
                System.out.println(" Enter the Book Author: ");
                bookAuthor[0] = sc.next();
                System.out.println(" Enter the Book release year: ");
                 yearReleased[1] = sc.nextInt();
                System.out.println("Enter Book Price");
                 bookPrice[3] = sc.nextInt();

                // add the book title in the book array
                int i = 0;
                Book[i] = bookTitle;

                int y = 2;
                Book[i] = bookTitle;

                // add the author to author array
                // add the Year release to YearRelease


                //
            } else if (choice ==2) {
                // show book
                for (String book : Book){
                    System.out.println(" Book Title: " + book);
                }

            } else if (choice == 3) {
                // Update a new book

            } else if (choice == 4) {
                // Search a book

            } else if (choice == 5) {
                // Delete an existing book
            } else  {
                System.out.println(" INVALID CHOICE !!!!!!!!!!!, Please enter the correct choice: ");
            }


        } while (choice != 6);
    }
}
