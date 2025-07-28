package assignment;
import java.util.Scanner;

interface MinFunction {
    float minimum3(float a, float b, float c);
}

public class Problem30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float num1 = sc.nextFloat();
        System.out.print("Enter second number: ");
        float num2 = sc.nextFloat();
        System.out.print("Enter third number: ");
        float num3 = sc.nextFloat();
        MinFunction minRef = (a, b, c) -> Math.min(Math.min(a, b), c);
        // Call the method and display result
        float result = minRef.minimum3(num1, num2, num3);
        System.out.println("Minimum of the three numbers: " + result);

        sc.close();
	}

}

/*
Enter first number: 10
Enter second number: 20
Enter third number: 30
Minimum of the three numbers: 10.0
*/