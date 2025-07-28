package tank;

public class Tank1 {
	private boolean isFilled;      
	private boolean isReleased;   

	public void fillTank() {
	    isFilled = true;
	    isReleased = false;
	    System.out.println("Tank filled.");
	}
	
	public void emptyTank() {
	    isFilled = false;
	    System.out.println("Tank emptied.");
	}
	
	public void releaseTank() {
	    isReleased = true;
	    System.out.println("Tank released properly.");
	}
	
	@Override
	protected void finalize() throws Throwable {
	    try {
	        if (!isReleased) {
	            System.out.println("⚠️ Error: Tank not released before cleanup!");
	        } else {
	            System.out.println("Tank cleaned up safely.");
	        }
	    } finally {
	        super.finalize(); 
	    }
	}
}