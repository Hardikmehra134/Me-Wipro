package assignment;

class InvalidSalaryException extends Exception {
    public InvalidSalaryException(String message) {
        super(message);
    }
}

class Employee47 {
    private int id;
    private String name;
    private double salary;

    public Employee47(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return "Employee[ID=" + id + ", Name=" + name + ", Salary=" + salary + "]";
    }
}

class EmployeeService {

    public void validateSalary(double salary) throws InvalidSalaryException {
        if (salary < 0) {
            throw new InvalidSalaryException("Salary cannot be negative: " + salary);
        }
    }

    public void processSalary(Employee47 emp) throws InvalidSalaryException {
        validateSalary(emp.getSalary());
        System.out.println("✅ Salary is valid: " + emp.getSalary());
    }

    public void startProcess(Employee47 emp) throws InvalidSalaryException {
        processSalary(emp);
    }
}


public class Problem47 {

	public static void main(String[] args) {
		Employee47 emp = new Employee47(101, "Hardik", -1500);

        EmployeeService service = new EmployeeService();

        try {
            service.startProcess(emp);
        } catch (InvalidSalaryException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
	}

}

//Exception caught: Salary cannot be negative: -1500.0//
