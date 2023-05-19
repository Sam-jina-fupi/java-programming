import java.util.Scanner;

public class Weight {


        public static void main(String[] args){
            // create variable to store weight, price
            double weight;
            double price = 0;
            double priceRate = 15.00;

            // Enter the weight of the particle

            Scanner sc = new Scanner(System.in);

            System.out.println(Math.floor(4.9));
            System.out.println(Math.ceil(4.9));

            System.out.println("Please Enter the weight of the particle: ");

            weight = sc.nextDouble();

            if (weight <= 1) {

                System.out.println("You are required to pay: ksh. " + priceRate);

            } else if (weight > 1) {

                double unit = weight - 1;
                double multiple = unit / 0.5;
                double roundedMultiple = Math.ceil(multiple);
                double additionalCost = roundedMultiple * 8;
                double totalCost = 15 + additionalCost;
                System.out.println("You are required to pay: Ksh. " + totalCost);

            }
        }
    }
