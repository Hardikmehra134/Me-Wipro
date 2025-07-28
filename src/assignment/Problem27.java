package assignment;

enum Currency{
	one,two,three,four,five,six;
}
public class Problem27 {

	public static void main(String[] args) {
		 for (Currency c : Currency.values()) {
	            System.out.print(c + ": ");
	            switch (c) {
	                case one:
	                    System.out.println("₹1 note - smallest denomination.");
	                    break;
	                case two:
	                    System.out.println("₹2 note - commonly used.");
	                    break;
	                case three:
	                    System.out.println("₹3 note - frequently circulated.");
	                    break;
	                case four:
	                    System.out.println("₹4 note - medium denomination.");
	                    break;
	                case five:
	                    System.out.println("₹5 note - convenient for small purchases.");
	                    break;
	                case six:
	                    System.out.println("₹6 note - widely accepted.");
	                    break;
	           }
	       }
	  }
}

/*
one: ₹1 note - smallest denomination.
two: ₹2 note - commonly used.
three: ₹3 note - frequently circulated.
four: ₹4 note - medium denomination.
five: ₹5 note - convenient for small purchases.
six: ₹6 note - widely accepted.
*/