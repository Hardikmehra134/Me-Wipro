package assignment;
import java.util.Scanner;

class Problem20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;
        if (num <= 1) isPrime = false;
        else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(num + (isPrime ? " is a prime number." : " is not a prime number."));
    }
}

/*
Enter a number: 50
50 is not a prime number.

Enter a number: 2
2 is a prime number.
*/