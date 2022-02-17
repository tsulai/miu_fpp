package prog4_3.employeeinfo;

public final class SavingAccount extends Account {
	
	private static final double MONTHLY_INTEREST_RATE = 0.25;
	
	SavingAccount(Employee emp) {
		super(emp);
		// TODO Auto-generated constructor stub
	}
	
	SavingAccount(Employee emp, double balance) {
		super(emp, balance);
	}
	
	@Override
	public AccountType getAcctType() {
		return AccountType.SAVINGS;
	}
	
	public String toString() {
		String output = "";
		output += String.format("%s %s %n", "Account type: ", AccountType.SAVINGS.toString());
		output += String.format("%s %s %n", "Current bal: ", super.getBalance());
		return output;
	}
	
	@Override
	public double getBalance() {
		double baseBalance = super.getBalance();
		double interest = (MONTHLY_INTEREST_RATE/100)*baseBalance;
		return baseBalance + interest;
	}

}
