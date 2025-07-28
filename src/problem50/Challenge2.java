package problem50;
import java.util.List;
import java.util.Comparator;

public class Challenge2 {
    public static void execute(List<Employee50> employees) {
        double secondHighestSalary = employees.stream()
            .map(Employee50::getSalary)
            .distinct()
            .sorted(Comparator.reverseOrder())
            .skip(1)
            .findFirst()
            .orElse(-1.0);

        System.out.println("Second highest salary: " + secondHighestSalary);
    }
}
