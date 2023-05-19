public class Main {
    public static void main(String[] args) {

        System.out.println("OOP ->Inheritance");
        // create a Full-time student object
        FullTimeStudent Sam = new FullTimeStudent("POO193131", "Samuel", "Mugo",
                "smburumugo@gmail.com", "Python Programming", "Full Time");



//        Sam.displayStudentInfo();
//        Sam.displayModeOfStudy();

        PartTimeStudent Elvis = new PartTimeStudent();( "POO193132", "Elvis", "Kimathi",
                "elvis@gmail.com", "Python Programming", "Part Time");


    }
    // Inheritance in Java
    // Inheritance is a process in java using

    // Class whose properties are getting acquired  is know as super class/ base class

    // Points to remember about inheritance:
    // You can inherit parent cals using extended keyword in java
    // on inheritance all the methods and variables(which are not declared as private)from the parent
    // calls are inherited by child class in a java
    // You can call methods from rhe parent class using child class object
    // using dot(.) operator

    // syntax :

    // class <child-class> extends <parent-class>{

    }





        }
    }
}