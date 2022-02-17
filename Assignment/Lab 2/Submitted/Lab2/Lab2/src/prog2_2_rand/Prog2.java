package prog2_2_rand;
//Programming Assignment 2-2
public class Prog2 {

	public static void main(String[] args) {
		//1. get a random number x in the range 1 .. 9 and compute πx
		int x = RandomNumbers.getRandomInt(1,9);
		double resultX = 1;
		for(int i = 1; i <= x; i++) {
			resultX *= Math.PI;
		}		
		System.out.println("Random Number is: " + x + " &  π to power " + x + " is: " + resultX);
		
		//2. get a random number y in the range 3 .. 14 and compute yπ
		int y = RandomNumbers.getRandomInt(3,14);
		double resultY = 1;
		for(int j = 1; j<= Math.PI; j++) {
			resultY *= y;
		}
		System.out.println("Random Number is: " + y + " & " + y + " to power π is: " + resultY);
	}

}
