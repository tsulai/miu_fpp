package prog2_5_reverse;
//Programming Assignment 2-5
import java.util.Scanner;

public class Prog5 {

	public static void main(String[] args) {
		String inputString = "";

		Scanner sc = new Scanner(System.in);

		System.out.print("Type your input string : ");

		inputString = sc.nextLine();

		String reversedString = "";

		for(int i = inputString.length()-1; i>=0; i--)
		{
			reversedString = reversedString + inputString.charAt(i);
		}

		System.out.print("The reversed string of the is: " + reversedString );
		sc.close();
	}
	
	

}
