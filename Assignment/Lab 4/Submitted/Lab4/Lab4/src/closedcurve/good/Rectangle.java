package closedcurve.good;

/*This file covers for Assignment 4-2, Assignment 4-4*/

public final class Rectangle extends ClosedCurve implements Polygon{
	
	private final double width;
	private final double length;
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}	
	public double getLength() {
		 return length;
	}
	
	public double getWidth() {
		 return width;
	}
	
	@Override
	double computeArea() {
		return width * length;
	}
	@Override
	public int getNumberOfSides() {
		return 4;
	}
	@Override
	public double computePerimeter() {
		return 2*(width + length);
	}
	

}
