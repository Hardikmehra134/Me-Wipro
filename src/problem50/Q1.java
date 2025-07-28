package problem50;
import java.util.*;
import java.util.stream.*;

public class Q1 {
    public static void execute(List<Employee50> employees) {
        System.out.println("Employee Names:");
        employees.stream()
                 .map(Employee50::getName)
                 .forEach(System.out::println);
    }
}
/*
Employee Names:
Nimisha
Anmol
Diksha
Sangram
Rohit
*/