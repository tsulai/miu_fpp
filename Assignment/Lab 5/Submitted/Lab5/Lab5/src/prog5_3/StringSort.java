package prog5_3;

import java.util.Arrays;
import java.util.Comparator;

public class StringSort {
	Comparator<String> myComparator;
	//gotta pass comparator class to StringSort to sort string
	public StringSort(Comparator<String> myComparator) {
		this.myComparator = myComparator;
	}

	public String[] stringSort(String[] arr) {
		Arrays.sort(arr, myComparator);		
		return arr;
	}
}

//example syntax
//Arrays.sort(persons, new Comparator<Person>()){
//	public int compare(Person p1, Person p2) {
//		return p1.getName().compareTo(p2.getName());
//	}
//}

