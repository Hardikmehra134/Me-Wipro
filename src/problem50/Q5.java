package problem50;
import java.util.Comparator;
import java.util.List;

public class Q5 {
    public static void execute(List<Employee50> employees) {
        employees.stream()
                 .max(Comparator.comparingDouble(Employee50::getSalary))
                 .ifPresent(emp -> System.out.println("Highest Paid: " + emp));
    }
}
