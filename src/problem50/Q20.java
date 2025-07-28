package problem50;
import java.util.List;

public class Q20 {
    public static void execute(List<Employee50> employees) {
        System.out.println("Distinct departments:");
        employees.stream()
                 .map(Employee50::getDepartment)
                 .distinct()
                 .forEach(System.out::println);
    }
}
