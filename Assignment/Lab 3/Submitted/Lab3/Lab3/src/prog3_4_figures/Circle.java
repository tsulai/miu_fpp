package prog3_4_figures;

final class Circle {
	private final double radius;
	
	Circle(double radius){
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public double computeArea() {
		return Math.PI * radius * radius;
	}

}
