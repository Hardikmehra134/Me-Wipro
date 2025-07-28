package problem50;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q8 {
    public static void execute(List<Employee50> employees) {
        Map<String, List<Employee50>> grouped = employees.stream()
                                                         .collect(Collectors.groupingBy(Employee50::getDepartment));
        grouped.forEach((dept, emps) -> {
            System.out.println(dept + ":");
            emps.forEach(System.out::println);
        });
    }
}
