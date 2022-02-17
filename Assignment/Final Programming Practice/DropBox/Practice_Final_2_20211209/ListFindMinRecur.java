package practise_final;

import java.util.ArrayList;
import java.util.List;

public class ListFindMinRecur {

	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(8);
		myList.add(4);
		myList.add(4);
		myList.add(5);
		myList.add(1);
		myList.add(3);
		myList.add(7);		
		myList.add(9);
		myList.add(11);		
		myList.add(99);
		
		System.out.println(findMin(myList));
		System.out.println(findMax(myList));
		System.out.println(power(2, 4));
		System.out.println(reverseString("Hello"));

	}
	public static int findMin(List<Integer> list) {
		if(list.size() == 1) {
			return list.get(0);//must have ended condition which return value
		}
		int minVal = list.get(0);
		list.remove(0);
		
		return Math.min(minVal, findMin(list));
	}
	
	public static int findMax(List<Integer> list) {
		if(list.size() == 1) {
			return list.get(0);			
		}
		int maxVal = list.get(0);
		list.remove(0);
		
		return Math.max(maxVal, findMax(list));
	}
	
	public static double power(double x, int n) {
		if(n == 0) {
			return 1;
		}
		return x * power(x, n-1);		
	}
	
	public static String reverseString(String str) {
		 int len = str.length();
		 if(len == 1) {
			 return str;
		 }
		 String s = str.substring(len -1);
		 //System.out.println(s);
		 return s + reverseString(str.substring(0,len -1));
	 }

}
