package assignment;

class Employee48 {
    private int id;
    private String name;
    private double salary;

    public Employee48(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

@FunctionalInterface
interface EmployeeProcessor {
    void process(Employee48 e);
}

public class Problem48 {
    public static void main(String[] args) {
        Employee48 emp = new Employee48(101, "Hardik Mehra", 1000000);

        EmployeeProcessor printDetails = e ->
            System.out.println("Name: " + e.getName() + ", Salary: " + e.getSalary());

        EmployeeProcessor printBonus = e ->
            System.out.println("Bonus: " + (e.getSalary() * 0.10));

        printDetails.process(emp);
        printBonus.process(emp);
    }
}

/*
Name: Hardik Mehra, Salary: 1000000.0
Bonus: 100000.0
*/