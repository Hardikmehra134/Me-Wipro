package problem50;
import java.util.List;
import java.util.Comparator;

public class Q17 {
    public static void execute(List<Employee50> employees) {
        System.out.println("Employees sorted by department and salary (desc):");
        employees.stream()
                 .sorted(Comparator.comparing(Employee50::getDepartment)
                                   .thenComparing(Comparator.comparing(Employee50::getSalary).reversed()))
                 .forEach(System.out::println);
    }
}
