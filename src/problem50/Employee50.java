package problem50;

public class Employee50 {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee50(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return id + " - " + name + " - " + department + " - " + salary;
    }
}