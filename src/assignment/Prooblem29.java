package assignment;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Prooblem29 {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter Register Number: ");
		        String regNo = sc.nextLine();

		        System.out.print("Enter Mobile Number: ");
		        String mobileNo = sc.nextLine();

		        try {
		            // Check for non-alphanumeric in register number
		            if (!regNo.matches("[a-zA-Z0-9]+")) {
		                throw new NoSuchElementException("Register number has invalid characters");
		            }

		            // Check for non-digit characters in mobile number
		            if (!mobileNo.matches("\\d+")) {
		                throw new NumberFormatException("Mobile number contains non-digits");
		            }

		            // Length checks
		            if (regNo.length() != 9 || mobileNo.length() != 10) {
		                throw new IllegalArgumentException("Length is invalid");
		            }

		            // If all checks passed
		            System.out.println("valid");

		        } catch (NoSuchElementException e) {
		            System.out.println("invalid (register number invalid)");
		        } catch (NumberFormatException e) {
		            System.out.println("invalid (mobile number invalid)");
		        } catch (IllegalArgumentException e) {
		            System.out.println("invalid (length invalid)");
		        }

		        sc.close();
		    }
	}

/*Enter Register Number: 20csu134
Enter Mobile Number: 9667768003
invalid (length invalid)

Enter Register Number: 202csu134
Enter Mobile Number: 9667768003
valid
*/