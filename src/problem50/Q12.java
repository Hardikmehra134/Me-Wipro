package problem50;
import java.util.List;
import java.util.stream.Collectors;

public class Q12 {
    public static void execute(List<Employee50> employees) {
        String names = employees.stream()
                                .map(Employee50::getName)
                                .collect(Collectors.joining(", "));
        System.out.println("Employee Names: " + names);
    }
}
