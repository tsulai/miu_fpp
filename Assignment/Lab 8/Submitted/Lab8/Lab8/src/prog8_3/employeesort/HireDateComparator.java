package prog8_3.employeesort;
/*2. Create a HireDateComparator class whose compareTo method orders 
Employee objects in increasing date of hire.
 * */
import java.util.Comparator;

public class HireDateComparator  implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getHireDate().compareTo(o2.getHireDate());
	}

}
