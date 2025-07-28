package assignment;

class LowSalException extends Exception {
    class LowSalException(String message) {
        super(message);
    }
}

class Emp {
    int empId;
    String empName;
    String designation;
    double basic;
    final double hra;

    public Emp(int empId, String empName, String designation, double basic) throws LowSalException {
        this.empId = empId;
        this.empName = empName;
        this.designation = designation;
        this.basic = basic;

        if (basic < 50000) {
            throw new LowSalException("Basic salary is less than ₹50000. Not allowed.");
        }

        this.hra = calculateHRA(); 
    }

    private double calculateHRA() {
        switch (designation.toLowerCase()) {
            case "manager":
                return 0.10 * basic;
            case "teamleader":
                return 0.12 * basic;
            case "hr":
                return 0.05 * basic;
            default:
                return 0.0;
        }
    }

    public void printDET() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Designation: " + designation);
        System.out.println("Basic Salary: ₹" + basic);
        System.out.println("HRA: ₹" + hra);
    }
}

public class Problem33 {
	public static void main(String[] args) 
	{
		try {
            Emp emp1 = new Emp(101, "Hardik", "Manager", 60000);
            emp1.printDET();
        } catch (LowSalException e) {
            System.out.println("Exception: " + e.getMessage());
        }
	}
}
