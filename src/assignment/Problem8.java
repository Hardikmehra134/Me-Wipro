package assignment;
import java.util.Scanner;

public class Problem8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Total Classes ");
		int held = sc.nextInt();
		System.out.println("Classes Attended");
		int attended = sc.nextInt();
		
		double percentage = (attended*100)/ held;
		System.out.println("Attendance " + percentage );
		
		if (percentage > 70)
			System.out.println("allowed for exams");
		else {
			System.out.println("Did you have medical Reasons");
			char medical = sc.next().charAt(0);
			if (medical == 'Y')
				System.out.println("Allowed due to Medical");
			else if (medical == 'N')
				System.out.println("Not Allowed for the exams");
		}
	}
}

/*
Total Classes 
100
Classes Attended
65
Attendance 65.0
Did you have medical Reasons
Y
Allowed due to Medical

Total Classes 
100
Classes Attended
65
Attendance 65.0
Did you have medical Reasons
N
Not Allowed for the exams


*/
