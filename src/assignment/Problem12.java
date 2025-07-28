package assignment;
import java.util.*;

class Student {
    private static int counter = 1;
    private int rollNo;
    private String name;
    private int eng, maths, sci;
    public Student(String name, int eng, int maths, int sci) {
        this.rollNo = counter++;
        this.name = name;
        this.eng = eng;
        this.maths = maths;
        this.sci = sci;
    }
    public int getRollNo() { return rollNo; }
    public String getName() { return name; }
    public int getEng() { return eng; }
    public int getMaths() { return maths; }
    public int getSci() { return sci; }
    public int getTotal() { return eng + maths + sci; }
    public double getPercent() { return getTotal() / 3.0; }
}
class Problem12 {
    Student[] students;
    public Problem12(Student[] students) {
        this.students = students;
    }
    public void displayRollAsc() {
        Arrays.sort(students, Comparator.comparingInt(Student::getRollNo));
        for (Student s : students)
            System.out.println(s.getRollNo() + " " + s.getName());
    }
    public void displayTopper() {
        Student top = Arrays.stream(students).max(Comparator.comparingDouble(Student::getPercent)).get();
        System.out.println("Topper: " + top.getRollNo() + " " + top.getName());
    }
    public void displayMathTopper() {
        Student top = Arrays.stream(students).max(Comparator.comparingInt(Student::getMaths)).get();
        System.out.println("Maths Topper: " + top.getRollNo() + " " + top.getName());
    }
    public void sortMathSciTotal() {
        Arrays.sort(students, Comparator.comparingInt(s -> s.getMaths() + s.getSci()));
        for (Student s : students)
            System.out.println(s.getRollNo() + " " + s.getName());
    }
    public void displayRankList() {
        Arrays.sort(students, Comparator.comparingDouble(Student::getPercent).reversed());
        int rank = 1;
        for (Student s : students)
            System.out.printf("Roll: %d, Name: %s, Total: %d, %%: %.2f, Rank: %d\n",
                    s.getRollNo(), s.getName(), s.getTotal(), s.getPercent(), rank++);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] sList = new Student[8];
        for (int i = 0; i < 8; i++) {
            System.out.println("Enter Name and marks for Student " + (i + 1));
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("English: ");
            int eng = sc.nextInt();
            System.out.print("Maths: ");
            int maths = sc.nextInt();
            System.out.print("Science: ");
            int sci = sc.nextInt();
            sList[i] = new Student(name, eng, maths, sci);
        }
        Problem12 std = new Problem12(sList);
        std.displayRollAsc();
        std.displayTopper();
        std.displayMathTopper();
        std.sortMathSciTotal();
        std.displayRankList();
    }
}

/*Enter Name and marks for Student 1
Name: Hardik
English: 85
Maths: 89
Science: 98
Enter Name and marks for Student 2
Name: Harsh
English: 90
Maths: 85
Science: 75
Enter Name and marks for Student 3
Name:  Parth
English: 85
Maths: 89
Science: 79
Enter Name and marks for Student 4
Name: Dev
English: 82
Maths: 87
Science: 85
Enter Name and marks for Student 5
Name: Abhay
English: 85
Maths: 65
Science: 98
Enter Name and marks for Student 6
Name: 45
English: 85
Maths: 75
Science: 84
Enter Name and marks for Student 7
Name: Abhay
English: 85
Maths: 95
Science: 455
Enter Name and marks for Student 8
Name: Jalaj
English: 85
Maths: 85
Science: 96
1 Hardik
2 Harsh
3 Parth
4 Dev
5 Abhay
6 45
7 Abhay
8 Jalaj
Topper: 7 Abhay
Maths Topper: 7 Abhay
6 45
2 Harsh
5 Abhay
3 Parth
4 Dev
8 Jalaj
1 Hardik
7 Abhay
Roll: 7, Name: Abhay, Total: 635, %: 211.67, Rank: 1
Roll: 1, Name: Hardik, Total: 272, %: 90.67, Rank: 2
Roll: 8, Name: Jalaj, Total: 266, %: 88.67, Rank: 3
Roll: 4, Name: Dev, Total: 254, %: 84.67, Rank: 4
Roll: 3, Name: Parth, Total: 253, %: 84.33, Rank: 5
Roll: 2, Name: Harsh, Total: 250, %: 83.33, Rank: 6
Roll: 5, Name: Abhay, Total: 248, %: 82.67, Rank: 7
Roll: 6, Name: 45, Total: 244, %: 81.33, Rank: 8
*/