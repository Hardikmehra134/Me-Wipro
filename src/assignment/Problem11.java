package assignment;
import java.util.Scanner;

class Calculator {
    public void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    public void diff(int a, int b) {
        System.out.println("Difference: " + (a - b));
    }

    public void mul(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }

    public void div(int a, int b) {
        if (b != 0)
            System.out.println("Division: " + (a / b));
        else
            System.out.println("Cannot divide by zero.");
    }
}

public class Problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        calc.add(num1, num2);
        calc.diff(num1, num2);
        calc.mul(num1, num2);
        calc.div(num1, num2);

        sc.close();
    }
}

/*
Enter first number: 40
Enter second number: 30
Addition: 70
Difference: 10
Multiplication: 1200
Division: 1
*/