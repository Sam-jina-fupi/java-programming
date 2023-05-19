public class Main {
    public static void main(String[] args) {
        // TITLE: FlatMates Bill Application

        // Description: An App that gets as input the amount of bill for a particular period
        // and the days that each of the flatmates stayed  in the house and returns
        // how much each flatmate has to pay, and it also generates a PDF report
        // stating the names of the flatmates, the period and how much each of had to pay.

        // Objects : (Think of the nouns available in the description)
        // -> object types => or just classes in other words.

        // Bill:
        // amount
        // period

        // Flatmate:
        // name
        // days_ in_ house
        // pays_bill(bill)

        // PdfReport
        // file_name
        // generate_pdf(flat_mate2, flat_mate2, bill)

        // create the objects
        FlatMate Joy = new FlatMate("Joy",
                3);
        FlatMate Frida = new FlatMate("Frida",
                28);

        Bill bill = new Bill(20000, "April 2023");
        // System.out.println(Joy.paysBill((bill, Joy));
        // System.out.println(Frida.paysBill((bill, Frida));

        PdfReport report =  new PdfReport("CPL Flats Rent " +
                "Total Bill");
        report.generatePdf(Joy, Frida, bill);
    }
        }