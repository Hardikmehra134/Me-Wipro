package assignment;
import java.util.Scanner;
import java.util.regex.Pattern;

class InvalidEmployeeCode extends Exception {
    public InvalidEmployeeCode(String message) {
        super(message);
    }
}

class Employee35 {
    private String empCode;
    private String empName;
    private String department;

    public Employee35(String empCode, String empName, String department) {
        this.empCode = empCode;
        this.empName = empName;
        this.department = department;
    }

    public void displayDetails() {
        System.out.println("\nEmployee Details:");
        System.out.println("Code       : " + empCode);
        System.out.println("Name       : " + empName);
        System.out.println("Department : " + department);
    }
}

public class Problem35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Employee Code (format: yy-F/S-xxx): ");
            String empCode = sc.nextLine();
            if (!isValidCode(empCode)) {
                throw new InvalidEmployeeCode("Invalid employee code format. Expected format: yy-F/S-xxx");
            }

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Department: ");
            String dept = sc.nextLine();
            Employee35 emp = new Employee35(empCode, name, dept);
            emp.displayDetails();

        } catch (InvalidEmployeeCode e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
    private static boolean isValidCode(String code) {
        String regex = "\\d{2}-[FS]-\\d{3}"; 
        return Pattern.matches(regex, code);
    }
}

/*
Enter Employee Code (format: yy-F/S-xxx): 02-F-134
Enter Employee Name: Hardik
Enter Department: CSE

Employee Details:
Code       : 02-F-134
Name       : Hardik
Department : CSE

*/