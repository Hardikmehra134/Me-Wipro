package assignment;
import java.util.regex.Pattern;
import java.util.Scanner;

class Employee {
    private String empId;
    private String name;
    private int yearOfBirth;
    public Employee(String empId, String name, int yearOfBirth) throws IllegalArgumentException {
        if (!isValidEmpId(empId)) {
            throw new IllegalArgumentException("Invalid Employee ID format. Must be like '81-F-112' or '79-S-254'");
        }

        this.empId = empId;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    private boolean isValidEmpId(String empId) {
        String regex = "\\d{2}-[FS]-\\d{3}";  // 2 digits - F/S - 3 digits
        return Pattern.matches(regex, empId);
    }

    // Print details
    public void printDetails() {
        System.out.println("Employee Details:");
        System.out.println("ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Year of Birth: " + yearOfBirth);
    }
}

public class Problem34 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        try {
            // User input
            System.out.print("Enter Employee ID (format: yy-D-nnn): ");
            String empId = scanner.nextLine();

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Year of Birth: ");
            int yearOfBirth = scanner.nextInt();

            // Create and display employee
            Employee emp = new Employee(empId, name, yearOfBirth);
            emp.printDetails();

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
	}

}
