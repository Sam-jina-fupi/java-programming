public class Student {
    // class states
    String admNo;
    String firstName;
    String lastName;
    String email;
    String course;
    String modeOfStudy;

    // class default constructor
    public Student(){
        this.admNo = "POO193131";
        this.firstName = "Samuel";
        this.lastName = "Mugo";
        this.email = "smburumugo@gmail.com";
        this.course = "Java Programming";
    }

    public Student(String admNo, String firstName, String lastName, String email, String course, String modeOfStudy){
        this.admNo = admNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.course = course;
        this.modeOfStudy = modeOfStudy;

    }


    // class methods
    void displayStudentInfo(){
        System.out.println("Admission No: " + admNo);
        System.out.println("Student Name: " + firstName + lastName);
        System.out.println("Student Email Address:" + email);
        System.out.println("Student Course" + course);
    }
}
