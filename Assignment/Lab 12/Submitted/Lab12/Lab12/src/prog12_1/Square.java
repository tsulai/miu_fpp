package prog12_1;

public class Square extends ClosedCurve {
	double side;
	public Square(Double side) throws IllegalClosedCurveException{
		this(side.doubleValue());
	}
	public Square(double side) throws IllegalClosedCurveException {
		if(side < 0) {
			//System.out.println("hello squar: " + getClass());
			throw new IllegalClosedCurveException(getClass(),"Illegal sizes for a square: "+side);
		}else {
			this.side = side;
		}
		
	}
	double computeArea() {
		return(side*side);
	}

}
