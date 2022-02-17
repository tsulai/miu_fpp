package prog4_3.employeeinfo;

public final class RetirementAccount extends Account{
	
	private static final double WITHDRAWAL_PENALTY = 2;
	
	RetirementAccount(Employee emp) {
		super(emp);
		// TODO Auto-generated constructor stub
	}
	RetirementAccount(Employee emp, double balance) {
		super(emp, balance);
	}
	@Override
	public AccountType getAcctType() {
		return AccountType.RETIREMENT;
		}
	
	public String toString() {
		String output = "";
		output += String.format("%s %s %n", "Account type: ", AccountType.RETIREMENT.toString());
		output += String.format("%s %s %n", "Current bal: ", super.getBalance());
		return output;
	}
	
	@Override
	public void makeWithdrawal(double amount) {		
		double bal = super.getBalance();
		if(amount <= bal) {
			bal -= amount;
			super.setBalance(bal - bal *(WITHDRAWAL_PENALTY/100));
						
		}else {
			System.out.println("Insufficient funds");
		}	
		
		
	}
}
