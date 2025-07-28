package problem50;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Problem50Main {
    public static void main(String[] args) {
    	List<Employee50> employees = Arrays.asList(
    		    new Employee50(101, "Nimisha", "HR", 50000),
    		    new Employee50(102, "Anmol", "IT", 60000),
    		    new Employee50(103, "Diksha", "HR", 70000),
    		    new Employee50(104, "Sangram", "IT", 80000),
    		    new Employee50(105, "Rohit", "Sales", 90000)
    		);  
    	System.out.println("1");
        Q1.execute(employees);
        
        System.out.println("2");
        Q2.execute(employees);
        
        System.out.println("3");
        Q3.execute(employees);
        
        System.out.println("4");
        Q4.execute(employees);
        
        System.out.println("5");
        Q5.execute(employees);
        
        System.out.println("6");
        Q6.execute(employees);
        
        System.out.println("7");
        Q7.execute(employees);
        
        System.out.println("8");
        Q8.execute(employees);
        
        System.out.println("9");
        Q9.execute(employees);
        
        System.out.println("10");
        Q10.execute(employees);
        
        System.out.println("11");
        Q11.execute(employees);
        
        System.out.println("12");
        Q12.execute(employees);
        
        System.out.println("13");
        Q13.execute(employees);
        
        System.out.println("14");
        Q14.execute(employees);
        
        System.out.println("15");
        Q15.execute(employees);
        
        System.out.println("16");
        Q16.execute(employees);
        
        System.out.println("17");
        Q17.execute(employees);
        
        System.out.println("18");
        Q18.execute(employees);
        
        System.out.println("19");
        Q19.execute(employees);
        
        System.out.println("19");
        Q20.execute(employees);
        
        System.out.println("Challenge1");
        Challenge1.execute(employees);
        
        System.out.println("Challenge2");
        Challenge2.execute(employees);
        
        System.out.println("Challenge3");
        Challenge3.execute(employees);
    	}
	}

/*
1
Employee Names:
Nimisha
Anmol
Diksha
Sangram
Rohit
2
Employees with salary > 55000:
Anmol - 60000.0
Diksha - 70000.0
Sangram - 80000.0
Rohit - 90000.0
3
Number of employees in HR department: 2
4
Employees sorted by salary in descending order:
Rohit - ₹90000.0
Sangram - ₹80000.0
Diksha - ₹70000.0
Anmol - ₹60000.0
Nimisha - ₹50000.0
5
Highest Paid: 105 - Rohit - Sales - 90000.0
6
Average Salary: 70000.0
7
Employee Names: [Nimisha, Anmol, Diksha, Sangram, Rohit]
8
Sales:
105 - Rohit - Sales - 90000.0
HR:
101 - Nimisha - HR - 50000.0
103 - Diksha - HR - 70000.0
IT:
102 - Anmol - IT - 60000.0
104 - Sangram - IT - 80000.0
9
Sales -> Total Salary: 90000.0
HR -> Total Salary: 120000.0
IT -> Total Salary: 140000.0
10
IT Employees Sorted by Salary: [Anmol, Sangram]
11
Any employee earns less than 40000? false
12
Employee Names: Nimisha, Anmol, Diksha, Sangram, Rohit
13
Top 2 highest earning employees:
105 - Rohit - Sales - 90000.0
104 - Sangram - IT - 80000.0
14
Employees after skipping first 2:
103 - Diksha - HR - 70000.0
104 - Sangram - IT - 80000.0
105 - Rohit - Sales - 90000.0
15
First 3 employee names:
Nimisha
Anmol
Diksha
16
Employees sorted by name:
102 - Anmol - IT - 60000.0
103 - Diksha - HR - 70000.0
101 - Nimisha - HR - 50000.0
105 - Rohit - Sales - 90000.0
104 - Sangram - IT - 80000.0
17
Employees sorted by department and salary (desc):
103 - Diksha - HR - 70000.0
101 - Nimisha - HR - 50000.0
104 - Sangram - IT - 80000.0
102 - Anmol - IT - 60000.0
105 - Rohit - Sales - 90000.0
18
Employee with the longest name: 101 - Nimisha - HR - 50000.0
19
Employees with salary > 75000:
104 - Sangram - IT - 80000.0
105 - Rohit - Sales - 90000.0

Employees with salary <= 75000:
101 - Nimisha - HR - 50000.0
102 - Anmol - IT - 60000.0
103 - Diksha - HR - 70000.0
19
Distinct departments:
HR
IT
Sales
Challenge1
Average salary by department:
Sales => 90000.0
HR => 60000.0
IT => 70000.0
Challenge2
Second highest salary: 80000.0
Challenge3
Employee count per department:
Sales => 1
HR => 2
IT => 2
*/