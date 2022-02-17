package prog4_5;

public class Test3 {
	public static void main(String[] args) {

		Polygon[] objects = {
				new Square(3),				
				 new Triangle(4,5,6),
				 new Rectangle(3,4)
				 };		

		for(Polygon p : objects) {
			System.out.println("For this " + p.getClass().getSimpleName() + "\nPerimeter = " + p.computePerimeter());
			
		}
	}
}
