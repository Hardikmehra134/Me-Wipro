package problem50;
import java.util.List;
import java.util.stream.Collectors;

public class Q13 {
    public static void execute(List<Employee50> employees) {
        List<Employee50> top2 = employees.stream()
                                         .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                                         .limit(2)
                                         .collect(Collectors.toList());
        System.out.println("Top 2 highest earning employees:");
        top2.forEach(System.out::println);
    }
}
