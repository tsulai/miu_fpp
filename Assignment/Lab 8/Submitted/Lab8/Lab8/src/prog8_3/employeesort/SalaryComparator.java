package prog8_3.employeesort;
/*
 * 1. Create a SalaryComparator class whose compareTo method orders 
Employee objects in increasing order of salary.

 */
import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.getSalary()<e2.getSalary()) return -1;
		else if(e1.getSalary()>e2.getSalary()) return 1;
		else return 0;
	}
}
