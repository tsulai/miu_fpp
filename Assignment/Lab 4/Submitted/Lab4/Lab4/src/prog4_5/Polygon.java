package prog4_5;
/*This file covers included for Assignment 4-5*/

public interface Polygon {
	
	//all methods in interface must be "public"
	//all instance variables in interface must be "public final"
	//implemented instance method must have keyword "default"
	
	public double[] getArrayOfSides();		
	
	//returns the sum of the values in arr
	 static double sum(double[] arr) {
		double sum = 0.00;
		for(int i = 0; i<arr.length; i++) {
			sum+= arr[i];
		}
		 return sum;
	 }
	 //In Interface - implemented instance method must have keyword "default"
		 
	 default double computePerimeter() {
		return sum(getArrayOfSides());		 
	 }



}
