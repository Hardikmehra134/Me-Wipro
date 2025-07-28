package assignment;
import java.util.Scanner;

class Problem14 {
    public void area(double side) {
        System.out.println("Area of square: " + (side * side));
    }
    public void area(double l, double b) {
        System.out.println("Area of rectangle: " + (l * b));
    }
    public void perimeter(double side) {
        System.out.println("Perimeter of square: " + (4 * side));
    }
    public void perimeter(double l, double b) {
        System.out.println("Perimeter of rectangle: " + (2 * (l + b)));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Problem14 s = new Problem14();
        System.out.print("Enter side of square: ");
        double side = sc.nextDouble();
        s.area(side);
        s.perimeter(side);
        System.out.print("Enter length and breadth of rectangle: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        s.area(l, b);
        s.perimeter(l, b);
    }
}
/*
import java.util.Scanner;
class Problem18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed string: " + reversed);
    }
}
*/