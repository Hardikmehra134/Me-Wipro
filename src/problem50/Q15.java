package problem50;
import java.util.List;

public class Q15 {
    public static void execute(List<Employee50> employees) {
        System.out.println("First 3 employee names:");
        employees.stream()
                 .limit(3)
                 .map(Employee50::getName)
                 .forEach(System.out::println);
    }
}
