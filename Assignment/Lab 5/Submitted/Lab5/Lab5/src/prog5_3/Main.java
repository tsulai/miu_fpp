package prog5_3;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		StringSort ss = new StringSort(new StringLengthComparator(false));//not ascending

		String[] testStrings = { "andy", "mike", "joe", "allen", "stephan" };
		//String[] testStrings = { "aaa", "bbb", "ccc", "ddd", "eee" };
		ss.stringSort(testStrings);

		System.out.println(Arrays.asList(testStrings));
	}
}
