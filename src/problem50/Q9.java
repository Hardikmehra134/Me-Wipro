package problem50;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

public class Q9 {
    public static void execute(List<Employee50> employees) {
        Map<String, Double> totalSalaries = employees.stream()
                .collect(Collectors.groupingBy(Employee50::getDepartment,
                        Collectors.summingDouble(Employee50::getSalary)));

        totalSalaries.forEach((dept, total) ->
                System.out.println(dept + " -> Total Salary: " + total));
    }
}
