package problem50;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Challenge3 {
    public static void execute(List<Employee50> employees) {
        Map<String, Long> deptCountMap = employees.stream()
            .collect(Collectors.groupingBy(
                Employee50::getDepartment,
                Collectors.counting()
            ));

        System.out.println("Employee count per department:");
        deptCountMap.forEach((dept, count) ->
            System.out.println(dept + " => " + count));
    }
}
