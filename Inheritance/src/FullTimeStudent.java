public class FullTimeStudent  extends Student{
    // class state
    public  FullTimeStudent(String admNO, String firstName , String lastName,
                            String email, String cousre, String modeOfStudy){
        this.admNo = admNO;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.course = cousre;
        this.modeOfStudy = modeOfStudy;
    }

    // behavior
    void displayModeOfStudy(){
        System.out.println("Mode Of Study: " + modeOfStudy);

    }

}
