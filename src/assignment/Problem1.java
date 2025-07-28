package assignment;

public class Problem1 {

	public static void main(String[] args) {
		int num = 2345;
        num += 8;
        int quotient = num / 3;
        int result = (quotient % 5) * 5;
        System.out.println("Final result: " + result);
	}

}

//output: Final result: 20 //