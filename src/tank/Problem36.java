package tank;

public class Problem36 {

	public static void main(String[] args) {
		System.out.println("Scenario 1: Tank released properly.");
        Tank1 t1 = new Tank1();
        t1.fillTank();
        t1.emptyTank();
        t1.releaseTank();
        t1 = null;

        System.out.println("\nScenario 2: Tank NOT released.");
        Tank1 t2 = new Tank1();
        t2.fillTank();
        t2.emptyTank();
        t2 = null;
        System.gc();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}

/*
Scenario 1: Tank released properly.
Tank filled.
Tank emptied.
Tank released properly.

Scenario 2: Tank NOT released.
Tank filled.
Tank emptied.
⚠️ Error: Tank not released before cleanup!
Tank cleaned up safely.
*/