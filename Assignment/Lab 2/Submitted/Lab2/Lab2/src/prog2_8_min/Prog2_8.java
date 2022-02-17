package prog2_8_min;

public class Prog2_8 {

	static int min(int[] arrayOfInts) {
		int min = arrayOfInts[0];
		for(int i = 0; i<arrayOfInts.length; i++) {
			if(arrayOfInts[i] < min) {
				min = arrayOfInts[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		System.out.println(min(new int[] {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22}));
	}

}
