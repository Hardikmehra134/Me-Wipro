package assignment;
import java.util.function.Function;
import java.util.function.Predicate;

public class Problem28 {

	public static void main(String[] args) {
        Function<Integer, Integer> square = x -> x * x;
        System.out.println("Square of 5: " + square.apply(5));

        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println("Is 10 even? " + isEven.test(10));

        Function<String, Integer> strLength = s -> s.length();
        System.out.println("Length of 'Hardik': " + strLength.apply("Hardik"));

        Predicate<String> isPalindrome = s -> s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());
        System.out.println("Is 'level' a palindrome? " + isPalindrome.test("level"));
        }
	}

/*
Square of 5: 25
Is 10 even? true
Length of 'Hardik': 6
Is 'level' a palindrome? true
*/