package prog3_4_figures;

public class Main {

	public static void main(String[] args) {
		Rectangle rt = new Rectangle(3.5, 1.2);
		System.out.println("Area of Rectangle is " + rt.computeArea());
		
		Triangle tr = new Triangle(4.5, 9.88);
		System.out.println("Area of Triangle is " + tr.computeArea());
		
		Circle cc = new Circle(20.5566);
		System.out.println("Area of Circle is " + cc.computeArea());

	}

}
