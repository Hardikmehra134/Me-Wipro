package assignment;
import java.util.*;

class Problem15 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int[] arr = new int[10];
     System.out.println("Enter 10 array elements:");
     for (int i = 0; i < 10; i++)
         arr[i] = sc.nextInt();
     Map<Integer, Integer> map = new HashMap<>();
     for (int n : arr)
         map.put(n, map.getOrDefault(n, 0) + 1);
     for (Map.Entry<Integer, Integer> e : map.entrySet())
         System.out.println(e.getKey() + " appears " + e.getValue() + " times");
 	}
 }