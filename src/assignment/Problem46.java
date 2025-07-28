package assignment;
import java.util.*;

class Repository<T, ID> {
    private Map<ID, T> storage = new HashMap<>();

    public void save(ID id, T entity) {
        storage.put(id, entity);
    }

    public T findById(ID id) {
        return storage.get(id);
    }

    public List<T> findAll() {
        return new ArrayList<>(storage.values());
    }

    public void deleteById(ID id) {
        storage.remove(id);
    }
}

class Employee46 {
    private int id;
    private String name;
    private double salary;

    public Employee46(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee[ID=" + id + ", Name=" + name + ", Salary=" + salary + "]";
    }
}

public class Problem46 {

	public static void main(String[] args) {
		Repository<Employee46, Integer> empRepo = new Repository<>();

        empRepo.save(1, new Employee46(1, "Hardik", 60000));
        empRepo.save(2, new Employee46(2, "Abhay", 55000));
        empRepo.save(3, new Employee46(3, "Dev", 50000));

        System.out.println("🔹 All Employees:");
        List<Employee46> allEmployees = empRepo.findAll();
        for (Employee46 e : allEmployees) {
            System.out.println(e);
        }

        System.out.println("\nEmployee with ID 2:");
        Employee46 emp = empRepo.findById(2);
        if (emp != null) {
            System.out.println(emp);
        } else {
            System.out.println("Employee not found.");
        }

        System.out.println("\nDeleting employee with ID 1...");
        empRepo.deleteById(1);

        System.out.println("\nRemaining Employees:");
        for (Employee46 e : empRepo.findAll()) {
            System.out.println(e);
        }
	}
}

/*
🔹 All Employees:
Employee[ID=1, Name=Hardik, Salary=60000.0]
Employee[ID=2, Name=Abhay, Salary=55000.0]
Employee[ID=3, Name=Dev, Salary=50000.0]

Employee with ID 2:
Employee[ID=2, Name=Abhay, Salary=55000.0]

Deleting employee with ID 1...

Remaining Employees:
Employee[ID=2, Name=Abhay, Salary=55000.0]
Employee[ID=3, Name=Dev, Salary=50000.0]

*/