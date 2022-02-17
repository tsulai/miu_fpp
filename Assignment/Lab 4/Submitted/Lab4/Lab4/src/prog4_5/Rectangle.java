package prog4_5;

/*This file covers for Assignment 4-5*/

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
	public double[] getArrayOfSides() {
		
		return new double[] {width, width, length, length};
	}
	@Override
	double computeArea() {
		// TODO Auto-generated method stub
		return 0;
	}


}
