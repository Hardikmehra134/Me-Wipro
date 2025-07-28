package assignment;
import java.util.Scanner;

class Problem17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        int wordCount = sentence.trim().split("\\s+").length;
        System.out.println("Word count: " + wordCount);
    }
}