package prog4_1_department;

import java.time.LocalDate;

class DeptEmployee {
	
	private String name;
	private LocalDate hireDate;
	private double salary;
	
	DeptEmployee(String name, double salary, int yearOfHire, int monthOfHire, int dayOfHire){
		this.name = name;
		this.salary = salary;
		this.hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
		
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public LocalDate getHireDate() {
		return hireDate;
	}
	
	public double computeSalary() {
		return salary;
	}

}
