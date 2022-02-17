package prog4_6.case3;

import java.util.GregorianCalendar;

public class PersonWithJob {
	private Person per;
	private double salary;
	PersonWithJob(String name, GregorianCalendar dob, double salary) {
		//set value to Person class instead of super 
		per = new Person(name, dob);
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	//no more inheritance and have to set instance getter
	public String getName() {
		return per.getName();
	}
	
	public GregorianCalendar getDateOfBirth() {
		return per.getDateOfBirth();
	}
	
	public boolean equals(Object withJob) {
		if(withJob == null) return false;
		if(getClass() != withJob.getClass()) return false;
		PersonWithJob wj = (PersonWithJob) withJob;
		return getName().equals(wj.per.getName()) && getDateOfBirth().equals(wj.per.getDateOfBirth()) && salary == wj.salary;		
	}
}
