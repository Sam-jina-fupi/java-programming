public class FlatMate {
    public String flatMateName;
    public double daysInHouse;

    public  FlatMate (String flatMateName, double daysInHouse){
        this.flatMateName = flatMateName;
        this.daysInHouse = daysInHouse;
    }

    public double paysBill(Bill bill, FlatMate flatMate2){
        double weight = (this.daysInHouse / (this.daysInHouse + flatMate2.daysInHouse));
        double toPay = bill.amount * weight;
        return Math.round(toPay);
    }
}
