package assignment;
import java.util.Optional;

class MissingFieldException extends RuntimeException {
    public MissingFieldException(String message) {
        super(message);
    }
}

class Employee49 {
    private int id;
    private String name;
    private Optional<String> email;
    private Optional<String> department;

    public Employee49(int id, String name, String email, String department) {
        this.id = id;
        this.name = name;
        this.email = Optional.ofNullable(email);             
        this.department = Optional.ofNullable(department);   
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Optional<String> getEmail() {
        return email;
    }

    public Optional<String> getDepartment() {
        return department;
    }

    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);

        System.out.println("Email: " + email.orElse("Email not provided"));

        String dept = department.orElseThrow(() ->
            new MissingFieldException("Department is required but missing!"));
        System.out.println("Department: " + dept);
    }
}

public class Problem49 {
    public static void main(String[] args) {
        Employee49 emp1 = new Employee49(101, "Hardik Mehra", "hardik@example.com", "Data Science");
        emp1.printDetails();

        System.out.println("\n---\n");

        Employee49 emp2 = new Employee49(102, "Harsh Bhatia", null, "Development");
        emp2.printDetails();

        System.out.println("\n---\n");

        try {
            Employee49 emp3 = new Employee49(103, "Jalaj Bhola", "jalaj@example.com", null);
            emp3.printDetails();
        } catch (MissingFieldException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

/*
ID: 101
Name: Hardik Mehra
Email: hardik@example.com
Department: Data Science

---

ID: 102
Name: Harsh Bhatia
Email: Email not provided
Department: Development

---

ID: 103
Name: Jalaj Bhola
Email: jalaj@example.com
Error: Department is required but missing!
*/