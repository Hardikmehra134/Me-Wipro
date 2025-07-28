package assignment;
import java.util.Scanner;

public class Problem5 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("salary: ");
        double salary = sc.nextDouble();
        System.out.print("time of service: ");
        int years = sc.nextInt();

        if (years > 6) {
            double bonus = salary * 0.10;
            System.out.println("bonus amount: " + bonus);
        } else {
            System.out.println("not eligible");
        }
        sc.close();
	}
}

/*
salary: 37000
time of service: 5 years
not eligible

salary: 37000
time of service: 7
bonus amount: 3700.0
*/