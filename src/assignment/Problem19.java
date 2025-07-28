package assignment;
import java.util.Scanner;

class Problem19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine().toLowerCase();
        int vowels = 0;
        for (char c : input.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) vowels++;
        }
        System.out.println("Number of vowels: " + vowels);
    }
}

/*
Enter a string: Hardik
Number of vowels: 2
*/