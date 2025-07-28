package assignment;
import java.util.*;

public class Problem24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] speed = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter speed of racer " + (i + 1) + ": ");
            speed[i] = sc.nextInt();
            sum += speed[i];
        }

        double avg = sum / 5.0;
        System.out.println("Average speed: " + avg);
        System.out.println("\nQualifying racers:");
        for (int i = 0; i < 5; i++) {
            if (speed[i] > avg) {
                System.out.println("Racer " + (i + 1) + " with speed: " + speed[i]);
            }
        }
    }
}
/*
Enter speed of racer 1: 140
Enter speed of racer 2: 145
Enter speed of racer 3: 150
Enter speed of racer 4: 155
Enter speed of racer 5: 160
Average speed: 150.0

Qualifying racers:
Racer 4 with speed: 155
Racer 5 with speed: 160
*/