package prog4_3.employeeinfo;

public final class CheckingAccount extends Account {
	
	private static final double MONTHLY_SERVICE_CHARGE = 5;
	/**
	 * 
	 * @param emp 
	 */
	CheckingAccount(Employee emp) {
		super(emp);
	}
	CheckingAccount(Employee emp, double balance) {
		super(emp, balance);
	}
	
	public String toString() {
		String output = "";
		output += String.format("%s %s %n", "Account type: ", AccountType.CHECKING.toString());
		output += String.format("%s %s %n", "Current bal: ", super.getBalance());
		return output;
	}

	@Override
	public AccountType getAcctType() {
		return AccountType.CHECKING;
		}
	@Override
	public double getBalance() {
		double baseBalance = super.getBalance();		
		return baseBalance - MONTHLY_SERVICE_CHARGE;
	}
}
