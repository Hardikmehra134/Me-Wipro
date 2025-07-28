package assignment;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Problem37 {

	public static void main(String[] args) {
		String fileName = "batchmates.txt";
        String[] names = {
            "Hardik Mehra",
            "Abhay Bhatia",
            "Jalaj Bhola",
            "Kuanl Saini",
            "Gautam Juneja"
        };

        try {
            File file = new File(fileName);
            
            if (file.createNewFile()) {
                System.out.println("✅ File created: " + file.getName());
            } else {
                System.out.println("ℹ️ File already exists.");
            }

            FileWriter writer = new FileWriter(file);
            for (String name : names) {
                writer.write(name + "\n");
            }
            writer.close();
            System.out.println("✅ Batchmates' names written to the file.\n");

        } catch (IOException e) {
            System.out.println(" Error writing file: " + e.getMessage());
        }

        System.out.println("📋 Batchmates list:");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("👤 " + line);
            }
        } catch (IOException e) {
            System.out.println("❌ Error reading file: " + e.getMessage());
        }
	}

}

/*
✅ File created: batchmates.txt
✅ Batchmates' names written to the file.

📋 Batchmates list:
👤 Hardik Mehra
👤 Abhay Bhatia
👤 Jalaj Bhola
👤 Kuanl Saini
👤 Gautam Juneja
*/