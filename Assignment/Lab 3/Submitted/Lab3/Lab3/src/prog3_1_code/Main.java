package prog3_1_code;

public class Main {

	public static void main(String[] args) {
		Employee Randoph = new Employee("Randoph", "Randy", 20000, 1989, 10, 1);
		Account RandophChecking = new Account(Randoph, AccountType.CHECKING, 300.00);
		Account RandophSaving = new Account(Randoph, AccountType.SAVINGS, 300.00);
		Account RandophRetirement = new Account(Randoph, AccountType.RETIREMENT, 300.00);
		
		System.out.println("Randoph Checking Account : " + RandophChecking.toString());
		System.out.println("Randoph Saving Account : " + RandophSaving.toString());
		System.out.println("Randoph Retirement Account : " + RandophRetirement.toString());
	}

}
