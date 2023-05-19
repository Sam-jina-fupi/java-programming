public class Car {
        // class state/variables/properties/members

        String color;
        String model;
        int noOfWheels;
        int noOfDoors;
        int noOfSeats;
        int horsePower;
        int gearLevel = 0;

        // class constructor
        public Car(String model, String  color, int noOfDoors, int noOfWheels, int noOfSeats){
                this.model = model;
                this.color = color;
                this.noOfWheels = noOfWheels;
                this.noOfSeats = noOfSeats;
        }

        // default constructor
        public Car(){
                this.model = "LX570";
                this.color = "Black";
                this.noOfWheels = 4;
                this.noOfSeats = 7;
        }


        // methods/behavior/actions
        public void  shiftGear(){
            gearLevel++;
            System.out.println(" You are on Gear: " + gearLevel);

        }
        public void  engageBreak(){

        }
        public void  accelerate(){

        }
    }
