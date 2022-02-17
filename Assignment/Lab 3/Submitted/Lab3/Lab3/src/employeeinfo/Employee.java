package employeeinfo;

import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {

	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private LocalDate hireDate;
	
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire){
		this.name = name;
/* update, using LocalDate - DONE
		GregorianCalendar cal = new GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire);
		hireDate = cal.getTime();
*/
		this.hireDate= LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
	}

	public String getName() {
		return name;
	}
	
	public LocalDate getHireDate() {
		return hireDate;
	}
	
	public void createNewChecking(double startAmount) {
		// implement - DONE
		checkingAcct = new Account(this,AccountType.CHECKING,startAmount);
		
	}

	public void createNewSavings(double startAmount) {
		// implement - DONE
		savingsAcct = new Account(this,AccountType.SAVINGS,startAmount);
		
	}

	public void createNewRetirement(double startAmount) {
		// implement - DONE
		retirementAcct = new Account(this,AccountType.RETIREMENT,startAmount);
		
	}

	public String getFormattedAcctInfo() {
		// implement - DONE
		String output = String.format("%2s %n%n", "ACCOUNT INFO FOR " + name);
		output += (checkingAcct != null)? checkingAcct.toString() : "";
		output += (savingsAcct != null) ? savingsAcct.toString() : "";
		output += (retirementAcct != null) ? retirementAcct.toString(): "";
		output += String.format("%n", "");
		
		return output;
	}
	public void deposit(AccountType acctType, double amt){
		// implement - DONE
		if(acctType == AccountType.CHECKING) {
			checkingAcct.makeDeposit(amt);
		}else if(acctType == AccountType.SAVINGS) {
			savingsAcct.makeDeposit(amt);			
		}else if(acctType == AccountType.RETIREMENT) {
			retirementAcct.makeDeposit(amt);
		}
	}
	public boolean withdraw(AccountType acctType, double amt){
		// implement - DONE
		if(acctType == AccountType.CHECKING) {
			return checkingAcct.makeWithdrawal(amt);
		}else if(acctType == AccountType.SAVINGS) {
			return savingsAcct.makeWithdrawal(amt);
			
		}else if(acctType == AccountType.RETIREMENT) {
			return retirementAcct.makeWithdrawal(amt);
		}
		return false;
	}

}
