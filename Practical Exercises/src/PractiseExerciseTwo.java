import java.util.Scanner;

public class PractiseExerciseTwo {
    // Write a java program to calculate charges for sending particles when
    // the charges are as follows.
    // For the first 1KG Ksh 15.00,
    // For additional weight, for every 500gm or fraction thereof: Ksh 8.00


        public static void main(String[] args) {
            // create variable to store weight, charge
            double weight = 1;
            double charges = 0;

            // Enter weight of the particle
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter weight in kg: ");
            weight = sc.nextDouble();

            if (weight <= 0) {
                System.out.println("Invalid weight!");
            } else {
                if (weight <= 1) {
                    charges = 15.00;
                } else {
                    double additionalWeight = Math.ceil((weight - 1) * 2);
                    charges = 15.00 + additionalWeight * 8.00;
                }

                System.out.printf("Charges for sending particles: Ksh %.2f", charges);
            }

            sc.close();
        }
    }