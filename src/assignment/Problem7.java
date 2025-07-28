package assignment;
import java.util.Scanner;

public class Problem7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Total Classes ");
		int held = sc.nextInt();
		System.out.println("Classes Attended");
		int attended = sc.nextInt();
		
		double percentage = (attended*100)/ held;
		System.out.println("Attendance " + percentage );
		
		if (percentage < 70)
			System.out.println("Not allowed for exams");
		else
			System.out.println("Allowed for exams");	
	}
}

/*
Total Classes 
100
Classes Attended
80
Attendance 80.0
Allowed for exams
 
Total Classes 
100
Classes Attended
65
Attendance 65.0
Not allowed for exams

*/
