package prog2_6_remove_str_dups;

import java.util.Arrays;

public class Prog6 {
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(removeDups(new String[] {"horse", "dog", "cat", "horse","dog"})));

	}

	static String[] removeDups(String[] a) {
		String[] rs = new String[a.length];
		rs[0] = a[0];
		int idx = 1;
		for(int i = 1; i<a.length; i++) {
			if(!isDupExists(rs, a[i])) {
				rs[idx] = a[i];
				idx++;
			}
		}		
		String[] newArr = new String[idx];
		for(int t = 0; t < idx; t++) {
			newArr[t] = rs[t];
		}
		return newArr;
	}
	
	static boolean isDupExists(String[] arr, String item) {
		for(int k = 0; k <arr.length; k++) {
			if(arr[k] == item) {
				return true;
			}
		}
		return false;
	}

}
