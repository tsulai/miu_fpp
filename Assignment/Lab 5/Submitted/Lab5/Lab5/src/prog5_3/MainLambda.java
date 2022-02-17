package prog5_3;

import java.util.Arrays;

public class MainLambda {

	public static void main(String[] args) {
		//String[] testStrings =  { "aaa", "ddd", "eee","bbb", "ccc" };
		String[] testStrings = { "andy", "mike", "joe", "allen", "stephan" };

		StringSort ss = new StringSort((o1,o2) -> {
			if (o1.length() < o2.length()) return -1;
			else if (o1.length() > o2.length()) return 1;
			else return 0;
		});
		ss.stringSort(testStrings);
		System.out.println(Arrays.asList(testStrings));

	}

}
