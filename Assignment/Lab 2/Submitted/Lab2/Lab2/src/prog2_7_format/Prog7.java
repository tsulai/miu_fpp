package prog2_7_format;

import prog2_2_rand.RandomNumbers;

public class Prog7 {

	public static void main(String[] args) {
		String output = ""; String output2 = "";
		output = String.format("%16d %12d  %12d  %12d %n %n", RandomNumbers.getRandomInt(1,99), RandomNumbers.getRandomInt(1,99), RandomNumbers.getRandomInt(1,99), RandomNumbers.getRandomInt(1,99));
		
		output += String.format("%13s %2d %9s %2d %10s %2d %10s %2d %n ","+", RandomNumbers.getRandomInt(1,99), "+", RandomNumbers.getRandomInt(1,99),"+", RandomNumbers.getRandomInt(1,99), "+", RandomNumbers.getRandomInt(1,99));
		
		output += String.format("%16s %12s %13s %13s %n %n %n %n %n","____", "____", "____", "____");
		
		output2 = String.format("%16d %12d  %12d  %12d %n %n", RandomNumbers.getRandomInt(1,99), RandomNumbers.getRandomInt(1,99), RandomNumbers.getRandomInt(1,99), RandomNumbers.getRandomInt(1,99));
		
		output2 += String.format("%13s %2d %9s %2d %10s %2d %10s %2d %n ","+", RandomNumbers.getRandomInt(1,99), "+", RandomNumbers.getRandomInt(1,99),"+", RandomNumbers.getRandomInt(1,99), "+", RandomNumbers.getRandomInt(1,99));
		
		output2 += String.format("%16s %12s %13s %13s","____", "____", "____", "____");
		System.out.println(output + output2);

	}

}
