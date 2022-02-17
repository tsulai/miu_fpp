package prog8_3.employeesort;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Employee[] arr = {new Employee("Bob", 2000, 1989, 10, 03), 
				new Employee("Steve", 3000, 1989, 10, 03), 
				new Employee("Alice", 50000, 1989, 10, 03)};
//		System.out.println(Arrays.toString(arr));
//		Arrays.sort(arr, new NameComparator());
//		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr, new SalaryComparator());
		System.out.println(Arrays.toString(arr));
	}
}
   ///////output:
   //[Bob: 2000, Steve: 3000, Alice: 50000]
   //[Alice: 50000, Bob: 2000, Steve: 3000]
   //[Bob: 2000, Steve: 3000, Alice: 50000]


