package House;

public class Kitchen {
    String[] appliances = {"Microwave", "Refrigerator", "Toaster", "Blender", "Dishwasher"};

    public void displayAppliances() {
        for (String appliance : appliances) {
            System.out.println(appliance);
        }

        String[] copied = new String[appliances.length];
        System.arraycopy(appliances, 0, copied, 0, appliances.length);
        System.out.println("Copied array:");
        for (String item : copied) {
            System.out.println(item);
        }
    }
}