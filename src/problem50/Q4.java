package problem50;
import java.util.Comparator;
import java.util.List;

public class Q4 {
    public static void execute(List<Employee50> employees) {
        System.out.println("Employees sorted by salary in descending order:");
        employees.stream()
                 .sorted(Comparator.comparingDouble(Employee50::getSalary).reversed())
                 .forEach(e -> System.out.println(e.getName() + " - ₹" + e.getSalary()));
    }
}
