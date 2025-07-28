package problem50;
import java.util.List;

public class Q14 {
    public static void execute(List<Employee50> employees) {
        System.out.println("Employees after skipping first 2:");
        employees.stream()
                 .skip(2)
                 .forEach(System.out::println);
    }
}
