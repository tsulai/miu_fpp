package prog2_4_parse;
//Programming Assignment 2-4

public class Prog4 {

	public static void main(String[] args) {
		String myString = Data.records;
		String[] arr1 = myString.split(",|\\:");
		for(int i = 0; i < arr1.length; i = i+5) {
			System.out.println(arr1[i]);
		}			
	}

}
