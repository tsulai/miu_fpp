package prog4_5;

/*This file covers for Assignment 4-5*/

public final class Square extends ClosedCurve implements Polygon {
	private final double side;
	
	public Square(double side){
		this.side = side;
		
	}

	@Override
	public double[] getArrayOfSides() {
		return new double[] {side, side, side, side};
	}

	@Override
	double computeArea() {
		// TODO Auto-generated method stub
		return 0;
	}


}
