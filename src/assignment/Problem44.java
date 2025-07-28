package assignment;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee44 {
    private int id;
    private String name;
    private double salary;

    public Employee44(int id, String name, double salary) {
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
        return "Employee [ID=" + id + ", Name=" + name + ", Salary=" + salary + "]";
    }
}
public class Problem44 {
		public static void main(String[] args) {
	        List<Employee44> empList = new ArrayList<>();
	        empList.add(new Employee44(101, "Hardik", 31500));
	        empList.add(new Employee44(102, "Harsh", 32500));
	        empList.add(new Employee44(103, "Abhay", 45600));
	        empList.add(new Employee44(104, "Dev", 65000));

	        System.out.println("Original Employee List: ");
	        empList.forEach(System.out::println);

	        empList.sort(Comparator.comparingDouble(Employee44::getSalary).reversed());

	        System.out.println("\nSorted by Salary: ");
	        empList.forEach(System.out::println);

	        empList.sort((e1, e2) -> e1.getName().compareToIgnoreCase(e2.getName()));

	        System.out.println("\nSorted by Name: ");
	        empList.forEach(System.out::println);
	}
}

/*
Original Employee List: 
Employee [ID=101, Name=Hardik, Salary=31500.0]
Employee [ID=102, Name=Harsh, Salary=32500.0]
Employee [ID=103, Name=Abhay, Salary=45600.0]
Employee [ID=104, Name=Dev, Salary=65000.0]

Sorted by Salary: 
Employee [ID=104, Name=Dev, Salary=65000.0]
Employee [ID=103, Name=Abhay, Salary=45600.0]
Employee [ID=102, Name=Harsh, Salary=32500.0]
Employee [ID=101, Name=Hardik, Salary=31500.0]

Sorted by Name: 
Employee [ID=103, Name=Abhay, Salary=45600.0]
Employee [ID=104, Name=Dev, Salary=65000.0]
Employee [ID=101, Name=Hardik, Salary=31500.0]
Employee [ID=102, Name=Harsh, Salary=32500.0]
*/
