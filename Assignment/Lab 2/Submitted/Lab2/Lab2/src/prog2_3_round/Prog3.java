package prog2_3_round;
//Programming Assignment 2-3
public class Prog3 {

	public static void main(String[] args) {
		float f1 = 1.27F;
		float f2 =  3.881F;
		float f3 = 9.6F;
		
		float sum = f1 + f2 + f3;
		
		System.out.println("Sum of the float casted to Int: " + (int)sum );
		System.out.println("Sum of the float rounded to nearest Int: " + Math.round(sum) );

	}

}
