package House;

import House.Hall;
import House.Kitchen;

public class House1 {
    public static void main(String[] args) {
        Hall hall = new Hall();
        hall.displayMessage();

        Kitchen kitchen = new Kitchen();
        kitchen.displayAppliances();
    }
}
