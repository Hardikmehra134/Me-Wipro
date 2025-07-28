package problem50;
import java.util.List;
import java.util.stream.Collectors;

public class Q10 {
    public static void execute(List<Employee50> employees) {
        List<String> itEmployees = employees.stream()
                .filter(e -> "IT".equals(e.getDepartment()))
                .sorted((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
                .map(Employee50::getName)
                .collect(Collectors.toList());

        System.out.println("IT Employees Sorted by Salary: " + itEmployees);
    }
}
