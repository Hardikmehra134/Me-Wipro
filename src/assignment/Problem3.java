package assignment;

public class Problem3 {
    public static void main(String[] args) {
        int totalStudents = 90;
        int boys = 45;
        int gradeAStudents = totalStudents / 2;
        int gradeABoys = 20;
        int gradeAGirls = gradeAStudents - gradeABoys;
        System.out.println("number of girls getting grade A: " + gradeAGirls);
    }
}

//number of girls getting grade A: 25//