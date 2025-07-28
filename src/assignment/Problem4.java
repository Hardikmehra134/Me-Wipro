package assignment;
import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("enter name: ");
	        String name = sc.nextLine();
	        System.out.print("enter roll number: ");
	        String rollNo = sc.nextLine();
	        System.out.print("enter interest: ");
	        String interest = sc.nextLine();
	        System.out.println("name " + name + " roll number " + rollNo + " interest " + interest);
	        sc.close();
	}

}

/* enter name: Hardik Mehra
enter roll number: 134
enter interest: Python
name Hardik Mehra roll number 134 interest Python
*/