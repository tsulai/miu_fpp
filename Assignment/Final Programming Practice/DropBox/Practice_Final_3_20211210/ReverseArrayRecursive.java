package practise_final;

public class ReverseArrayRecursive {

	public static void main(String[] args) {
		int[] testArr = {9,8,7,6,5,4,3,2,1};
		printReverseArray(testArr);

	}	
	public static void printReverseArray(int[] arr) {
		int len = arr.length;
		if(len == 1) {
			System.out.print(arr[0] );
		}else {
			int[] recurArr = new int[len-1]; 
			System.arraycopy(arr, 0, recurArr, 0, len -1);
			//System.out.println(java.util.Arrays.toString(recurArr));
			System.out.print(arr[len-1]+ ",");
			printReverseArray(recurArr);
		}		
	}
	
	private void printHelper(int[] arr) {
		
	}

}
