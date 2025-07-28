package assignment;
interface Drawable {
    void drawingColor();
    void thickness();
}

interface Fillable {
    void fillingColor();
    void size();
}
class Line implements Drawable, Fillable {
    public void drawingColor() {
        System.out.println("Line drawing color: Black");
    }
    public void thickness() {
        System.out.println("Line thickness: 2px");
    }
    public void fillingColor() {
        System.out.println("Line filling color: None");
    }
    public void size() {
        System.out.println("Line size: Length only");
    }
}
class Circle implements Drawable, Fillable {
    public void drawingColor() {
        System.out.println("Circle drawing color: Blue");
    }
    public void thickness() {
        System.out.println("Circle thickness: 3px");
    }
    public void fillingColor() {
        System.out.println("Circle filling color: Red");
    }
    public void size() {
        System.out.println("Circle size: Radius");
    }
}
class Square implements Drawable, Fillable {
    public void drawingColor() {
        System.out.println("Square drawing color: Green");
    }
    public void thickness() {
        System.out.println("Square thickness: 1px");
    }
    public void fillingColor() {
        System.out.println("Square filling color: Yellow");
    }
    public void size() {
        System.out.println("Square size: Side");
    }
}

public class Proble22 {
	public static void main(String[] args) {		
		Drawable d = new Line();
		Fillable f= new Line();
		
		Drawable d1 = new Circle();
		Fillable f1= new Circle();
		
		Drawable d2 = new Square();
		Fillable f2= new Square();
		
		System.out.println("Line");
		d.drawingColor();
		d.thickness();
		f.fillingColor();
		f.size();
		
		System.out.println("\nSquare");
		d2.drawingColor();
		d2.thickness();
		f2.fillingColor();
		f2.size();
		
		System.out.println("\nCircle");
		d1.drawingColor();
		d1.thickness();
		f1.fillingColor();
		f1.size();
	}

}


/*
Line
Line drawing color: Black
Line thickness: 2px
Line filling color: None
Line size: Length only

Square
Square drawing color: Green
Square thickness: 1px
Square filling color: Yellow
Square size: Side

Circle
Circle drawing color: Blue
Circle thickness: 3px
Circle filling color: Red
Circle size: Radius
*/