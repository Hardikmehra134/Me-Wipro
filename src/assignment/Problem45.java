package assignment;
import java.util.*;
import java.util.stream.Collectors;

class Student45 {
    private int id;
    private String name;
    private String department;

    public Student45(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Student[ID=" + id + ", Name=" + name + ", Dept=" + department + "]";
    }
}

public class Problem45 {

	public static void main(String[] args) {
		List<Student45> students = new ArrayList<>();
        students.add(new Student45(1, "Hardik", "CSE"));
        students.add(new Student45(2, "Prachi", "ECE"));
        students.add(new Student45(3, "Stephin", "CSE"));
        students.add(new Student45(4, "Arronima", "ME"));
        students.add(new Student45(5, "Raghav", "ECE"));

        Map<String, List<Student45>> groupedByDept = students.stream()
                .collect(Collectors.groupingBy(Student45::getDepartment));

        System.out.println("Students Grouped by Department:\n");
        groupedByDept.forEach((dept, stuList) -> {
            System.out.println("Department: " + dept);
            for (Student45 s : stuList) {
                System.out.println(" - " + s.getName());
            	}
        	}
        );
	}
}

/*
Students Grouped by Department:

Department: CSE
 - Hardik
 - Stephin
Department: ECE
 - Prachi
 - Raghav
Department: ME
 - Arronima
*/