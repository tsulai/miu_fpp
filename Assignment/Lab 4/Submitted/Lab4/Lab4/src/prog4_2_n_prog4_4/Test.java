package prog4_2_n_prog4_4;
/*This file covers for Assignment 4-2*/
public class Test {
	
	public static void main(String[] args) {

		ClosedCurve[] objects = {new Triangle(4,5,6),
								 new Square(3),
								 new Rectangle(3,7),
								 new Circle(3),
								 };
		//compute areas
		for(ClosedCurve cc : objects) {
			System.out.println(cc.computeArea());
			
		}
    
	}

}