package prog4_1_department;

public final class Secretary extends DeptEmployee{

	private double overtimeHours;
	
	Secretary(String name, double salary, int yearOfHire, int monthOfHire, int dayOfHire, double overtimeHours) {
		super(name, salary, yearOfHire, monthOfHire, dayOfHire);
		this.overtimeHours = overtimeHours;
	}
	
	public double getOvertimeHours() {
		return overtimeHours;
		
	}
	public void setOvertimeHours(double hour) {
		this.overtimeHours = hour;
	}
	
	@Override
	public double computeSalary() {
		return super.getSalary() + (12 * overtimeHours);
	}
 
}
