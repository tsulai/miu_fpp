package prog12_1;

public class Rectangle extends ClosedCurve {

	private double width;
	private double length;
	public Rectangle(double width, double length)throws IllegalClosedCurveException{
		if(length < 0 || width < 0) {
			throw new IllegalClosedCurveException(getClass(),"Illegal width/length for a rectangle.");
		}else {
			this.length = length;
			this.width = width;
		}		
	}
	double computeArea() {
		return width*length;
	}
	


}
