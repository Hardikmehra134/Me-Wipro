package assignment;
import java.util.Scanner;

public class Problem9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double Product1 = 22.50;
		double Product2 = 44.50;
		double Product3 = 9.98;
		char choice = 0;
		double Total = 0.0;
		
		do {
			System.out.println("Enter Product Number ");
			int product = sc.nextInt();
			System.out.println("Quantity ");
			int quantity = sc.nextInt();
			double price = 0;
			
			switch (product){
				case 1:
					price = Product1; break;
				case 2:
					price = Product2; break;
				case 3:
					price = Product3;
				continue;
			}
			   Total += price * quantity;

	            System.out.println("Do you want to add another item? (Y/N)");
	            choice = sc.next().charAt(0);

	        } while (choice == 'Y' || choice == 'y');

	        System.out.println("Total retail value: Rs. " + Total);

	        sc.close();
	  }
}

/*
Enter Product Number 
1
Quantity 
3
Do you want to add another item? (Y/N)
Y
Enter Product Number 
3
Quantity 
10
Enter Product Number 
2
Quantity 
2
Do you want to add another item? (Y/N)
N
Total retail value: Rs. 156.5
*/
