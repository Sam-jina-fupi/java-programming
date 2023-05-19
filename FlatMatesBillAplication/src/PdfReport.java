public class PdfReport {
    public String fileName;

    public PdfReport(String fileName){
        this.fileName = fileName;
    }

    public void generatePdf(FlatMate flatMate1, FlatMate flatMate2, Bill bill){
        System.out.println("===================================================");
        System.out.println("t/t/t/t" + this.fileName);
        System.out.println("===================================================");
        System.out.println("Total Amount: t/t/t/t" + bill.amount);
        System.out.println("Period: t/t/t/t" + bill.period);
        System.out.println("===================================================");
        System.out.println("1. Bill for: " + flatMate1.flatMateName +
                ", Days in House: " + flatMate1.daysInHouse + ", Will Pay: "
                + flatMate1.paysBill(bill, flatMate2));
        System.out.println("2. Bill for: " + flatMate2.flatMateName +
                        ", Days in House: " + flatMate2.daysInHouse + ", Will Pay: "
                + flatMate2.paysBill(bill, flatMate1));
        System.out.println("===================================================");
    }
}
