package closedcurve.good;

/*This file covers for Assignment 4-2, Assignment 4-4*/

public final class Square extends ClosedCurve implements Polygon {
	private final double side;
	
	public Square(double side){
		this.side = side;
		
	}
	public double computeArea() {
		return side * side;
	}
	@Override
	public int getNumberOfSides() {
		
		return 4;
	}
	@Override
	public double computePerimeter() {
		
		return 4*side;
	}


}
