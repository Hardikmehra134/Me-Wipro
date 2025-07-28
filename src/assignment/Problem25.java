package assignment;
import java.util.*;

public class Problem25 {
    public static boolean isValid(double a, double b, double c) {
        return (a + b > c && a + c > b && b + c > a);
    }

    public static double area(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static double perimeter(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter side a (-1 to exit): ");
            double a = sc.nextDouble();
            if (a == -1) {
                System.out.println("Bye~");
                break;
            }
            System.out.print("Enter side b: ");
            double b = sc.nextDouble();
            System.out.print("Enter side c: ");
            double c = sc.nextDouble();

            if (isValid(a, b, c)) {
                System.out.printf("Area: %.2f\n", area(a, b, c));
                System.out.printf("Perimeter: %.2f\n", perimeter(a, b, c));
            } else {
                System.out.println("The input is invalid.");
            }
        }
    }
}

/*
 * Enter side a (-1 to exit): 4
Enter side b: 5
Enter side c: 6
Area: 9.92
Perimeter: 15.00
Enter side a (-1 to exit): 5
Enter side b: 6
Enter side c: 7
Area: 14.70
Perimeter: 18.00
Enter side a (-1 to exit): 6
Enter side b: 7
Enter side c: 8
Area: 20.33
Perimeter: 21.00
Enter side a (-1 to exit): -1
Bye~

*/
