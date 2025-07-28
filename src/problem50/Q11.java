package problem50;
import java.util.List;

public class Q11 {
    public static void execute(List<Employee50> employees) {
        boolean anyLowSalary = employees.stream()
                                        .anyMatch(e -> e.getSalary() < 40000);
        System.out.println("Any employee earns less than 40000? " + anyLowSalary);
    }
}
