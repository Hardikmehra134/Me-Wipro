package problem50;
import java.util.List;

public class Q18 {
    public static void execute(List<Employee50> employees) {
        Employee50 longestNameEmp = employees.stream()
                                             .max((e1, e2) -> Integer.compare(e1.getName().length(), e2.getName().length()))
                                             .orElse(null);

        System.out.println("Employee with the longest name: " + (longestNameEmp != null ? longestNameEmp : "None"));
    }
}
