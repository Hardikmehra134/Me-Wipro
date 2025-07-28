package assignment;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Problem43 {

	public static void main(String[] args) {
		 String filePath = "C:\\Users\\mehra\\Desktop\\Wipro\\Java\\My work\\WiproAssignment1Java\\src\\assignment\\sample.txt"; 
		 
	        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
	            String line;
	            System.out.println("Reading contents of the file:");
	            while ((line = br.readLine()) != null) {
	                System.out.println(line); // Print each line
	            }
	        } 
	        catch (IOException e) {
	            System.out.println("Error reading the file: " + e.getMessage());
	            e.printStackTrace(); 
	        }
	}

}

/*
Reading contents of the file:
Hi this is a Sample file
Hardik Mehra
*/
