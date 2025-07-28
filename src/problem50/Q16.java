package problem50;
import java.util.List;

public class Q16 {
    public static void execute(List<Employee50> employees) {
        System.out.println("Employees sorted by name:");
        employees.stream()
                 .sorted((e1, e2) -> e1.getName().compareToIgnoreCase(e2.getName()))
                 .forEach(System.out::println);
    }
}
