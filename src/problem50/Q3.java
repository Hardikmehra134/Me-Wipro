package problem50;
import java.util.List;

public class Q3 {
    public static void execute(List<Employee50> employees) {
        long count = employees.stream()
                              .filter(e -> e.getDepartment().equalsIgnoreCase("HR"))
                              .count();

        System.out.println("Number of employees in HR department: " + count);
    }
}
