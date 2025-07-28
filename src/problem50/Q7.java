package problem50;
import java.util.List;
import java.util.stream.Collectors;

public class Q7 {
    public static void execute(List<Employee50> employees) {
        List<String> names = employees.stream()
                                      .map(Employee50::getName)
                                      .collect(Collectors.toList());
        System.out.println("Employee Names: " + names);
    }
}
