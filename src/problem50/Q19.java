package problem50;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q19 {
    public static void execute(List<Employee50> employees) {
        Map<Boolean, List<Employee50>> partitioned = employees.stream()
                                                               .collect(Collectors.partitioningBy(e -> e.getSalary() > 75000));
        System.out.println("Employees with salary > 75000:");
        partitioned.get(true).forEach(System.out::println);

        System.out.println("\nEmployees with salary <= 75000:");
        partitioned.get(false).forEach(System.out::println);
    }
}
