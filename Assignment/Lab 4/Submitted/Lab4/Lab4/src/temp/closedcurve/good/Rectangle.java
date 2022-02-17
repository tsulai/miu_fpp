package closedcurve.good;

public final class Rectangle extends ClosedCurve{
	
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
	
	

}
