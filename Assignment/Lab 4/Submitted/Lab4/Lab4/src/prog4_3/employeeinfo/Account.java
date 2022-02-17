package prog4_3.employeeinfo;

abstract public class Account {

	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;	
	private Employee employee;

	Account(Employee emp, double balance) {
		this.employee = emp;		
		this.balance = balance;
		
	}

	Account(Employee emp ) {
		this(emp, DEFAULT_BALANCE);
	}
	
	public abstract AccountType getAcctType();

	//for RetirementAccount Balance Update
	public void setBalance(double amount) {
		this.balance = amount;
	}
	
	public double getBalance() {
		return balance;
	}
	public void makeDeposit(double deposit) {
		balance += deposit;
	}

	public void makeWithdrawal(double amount) {
		if(amount <= balance) {
			balance -= amount;			
		}else {
			System.out.println("Insufficient funds");
		}		
	}
}
