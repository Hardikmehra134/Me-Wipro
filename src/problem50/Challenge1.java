package problem50;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Challenge1 {
    public static void execute(List<Employee50> employees) {
        Map<String, Double> avgSalaryByDept = employees.stream()
            .collect(Collectors.groupingBy(
                Employee50::getDepartment,
                Collectors.averagingDouble(Employee50::getSalary)
            ));

        System.out.println("Average salary by department:");
        avgSalaryByDept.forEach((dept, avgSalary) ->
            System.out.println(dept + " => " + avgSalary));
    }
}
