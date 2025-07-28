package assignment;
import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("marks ");
		int marks = sc.nextInt();
		
		if(marks < 25)
			System.out.println("Grade = F");
		else if(marks <= 45)
			System.out.println("Grade = E");
		else if(marks <= 50)
			System.out.println("Grade = D");
		else if(marks <= 60)
			System.out.println("Grade = C");
		else if(marks <= 80)
			System.out.println("Grade = B");
		else if(marks > 80)
			System.out.println("Grade = A");
	}

}

/*marks 
56
Grade = C

marks 
98
Grade = A
*/