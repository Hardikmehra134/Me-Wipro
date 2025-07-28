package assignment;

public class Problem10 
{
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide the number of eggs as a command-line argument.");
            return;
        }
        int eggs = Integer.parseInt(args[0]);

        int gross = eggs / 144;
        int remainingAfterGross = eggs % 144;

        int dozen = remainingAfterGross / 12;
        int remainingEggs = remainingAfterGross % 12;

        System.out.println("Your number of eggs is " + gross + " gross, " + dozen + " dozen, and " + remainingEggs + ".");
    }
}
