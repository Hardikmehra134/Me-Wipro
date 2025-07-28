package problem50;

import java.util.List;

public class Q2 {
    public static void execute(List<Employee50> employees) {
        System.out.println("Employees with salary > 55000:");
        employees.stream()
                 .filter(e -> e.getSalary() > 55000)
                 .forEach(e -> System.out.println(e.getName() + " - " + e.getSalary()));
    }
}

/*
Employees with salary > 55000:
Anmol - 60000.0
Diksha - 70000.0
Sangram - 80000.0
Rohit - 90000.0
*/