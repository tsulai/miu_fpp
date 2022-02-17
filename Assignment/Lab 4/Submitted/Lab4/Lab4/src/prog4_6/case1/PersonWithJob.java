package prog4_6.case1;

import java.util.GregorianCalendar;

public class PersonWithJob extends Person {
	private double salary;
	PersonWithJob(String name, GregorianCalendar dob, double salary) {
		super(name, dob);
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	@Override
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(!(ob instanceof PersonWithJob)) return false;
		PersonWithJob withJob = (PersonWithJob) ob;
		return getName().equals(withJob.getName()) && getDateOfBirth().equals(withJob.getDateOfBirth());
	}
}
