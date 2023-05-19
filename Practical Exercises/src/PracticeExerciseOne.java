public class PracticeExerciseOne {
    // Write a java program to store student marks and grades in two
    // different arrays.
    // Assume there are 5 students. The grades shall be generated
    // using the criteria below:
    // 0 - 39      E
    // 40 to 49    D
    // 50 to 59    C
    // 60 to 69    B
    // 70 to 100   A
    public static void main(String[] args) {
        int studentMarks[] = new int []{100, 90, 80, 90, 100};
        String studentGrades[] = new String[]{"A", "B", "C", "D", "E"};
        String grade = null;

        for (int i = 0; i < studentMarks.length; i++) {
            if (studentMarks[i] >= 70 && studentMarks[i] <= 100) {
                grade = studentGrades[i];
            } else if (studentMarks[i] >= 60 && studentMarks[i] <= 69) {
                grade = studentGrades[i];
            }  else if (studentMarks[i] >= 50 && studentMarks[i] <= 59) {
                grade = studentGrades[i];
            } else if (studentMarks[i] >= 40 && studentMarks[i] <= 49) {
                grade = studentGrades[i];
            } else if (studentMarks[i] >= 0 && studentMarks[i] <= 39) {
                grade = studentGrades[i];
            }
            System.out.println((i + 1) + "Student:" + (i + 1) + "Scored:" + grade);
        }
    }
}
