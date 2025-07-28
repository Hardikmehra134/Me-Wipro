package problem50;
import java.util.List;

public class Q6 {
    public static void execute(List<Employee50> employees) {
        double avgSalary = employees.stream()
                                    .mapToDouble(Employee50::getSalary)
                                    .average()
                                    .orElse(0.0);
        System.out.println("Average Salary: " + avgSalary);
    }
}
