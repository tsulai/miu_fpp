package closedcurve.good;
/*This file covers for Assignment 4-4*/
public class Test2 {
	
	public static void main(String[] args) {

		Polygon[] objects = {
				new Square(3),				
				 new Triangle(4,5,6),
				 new Rectangle(3,4)
				 };		

		for(Polygon p : objects) {
			System.out.println("For this " + p.getClass().getSimpleName() + "\n" + "Number of sides = " + p.getNumberOfSides() + "\nPerimeter = " + p.computePerimeter());
			
		}
	}
    

}
