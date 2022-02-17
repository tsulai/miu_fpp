package employeeinfo;

class Account {

	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;
	private Employee employee;

	Account(Employee emp, AccountType acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		String output = "";
		output += String.format("%s %s %n", "Account type: ",acctType);
		output += String.format("%s %s %n", "Current bal: ", balance);
		return output;
	}
	public AccountType getAccountType() {
		return acctType;
	}
	public double getBalance() {
		return balance;
	}
	public void makeDeposit(double deposit) {
		balance += deposit;
	}

	public boolean makeWithdrawal(double amount) {
		if(amount <= balance) {
			balance -= amount;
			return true;
		}
		return false;
	}
}
