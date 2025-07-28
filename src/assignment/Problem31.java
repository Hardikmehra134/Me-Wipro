package assignment;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter an integer: ");
            int number = sc.nextInt();  
            System.out.println("You entered: " + number);
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException caught: Please enter a valid integer.");
        }

        sc.nextLine(); 

        try {
            System.out.println("Enter a word: ");
            String input = sc.nextLine();

            System.out.println("Enter index to access character: ");
            int index = sc.nextInt();

            char ch = input.charAt(index);  
            System.out.println("Character at index " + index + ": " + ch);

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: Invalid index.");
        }

        sc.close();

	}

}

/*
 * Enter an integer: 20
You entered: 20
Enter a word: Hardik
Enter index to access character: 5
Character at index 5: k

Enter an integer: 
Hardik
InputMismatchException caught: Please enter a valid integer.
Enter a word: 
Mehra
Enter index to access character: 
6
StringIndexOutOfBoundsException caught: Invalid index.
*/
