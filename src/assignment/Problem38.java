package assignment;
import java.io.*;
import java.util.Scanner;

class Employee38 implements Serializable {
    private static final long serialVersionUID = 1L;

    private int emp_id;
    private String emp_name;
    private transient double emp_sal;

    public Employee38(int emp_id, String emp_name, double emp_sal) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_sal = emp_sal;
    }

    public void display() {
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Employee Salary (after deserialization): " + emp_sal);
    }
}

public class Problem38 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Employee Salary: ");
        double salary = scanner.nextDouble();
        Employee38 emp = new Employee38(id, name, salary);
        
        String filename = "employee.ser";
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(emp);
            System.out.println("\n✅ Employee object serialized to " + filename);
        } catch (IOException e) {
            System.out.println("❌ Serialization error: " + e.getMessage());
        }
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            Employee38 deserializedEmp = (Employee38) in.readObject();
            System.out.println("\n📋 Deserialized Employee object:");
            deserializedEmp.display();  
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("❌ Deserialization error: " + e.getMessage());
        }

        scanner.close();
	}

}

/*
 * Enter Employee ID: 12345
Enter Employee Name: Hardik Mehra
Enter Employee Salary: 56000

✅ Employee object serialized to employee.ser

📋 Deserialized Employee object:
Employee ID: 12345
Employee Name: Hardik Mehra
Employee Salary (after deserialization): 0.0
*/
