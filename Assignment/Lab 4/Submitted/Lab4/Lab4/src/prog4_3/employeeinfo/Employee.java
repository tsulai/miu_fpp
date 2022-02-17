package prog4_3.employeeinfo;

import java.time.LocalDate;
import prog4_3.AccountList;

public class Employee {

	private AccountList accounts = new AccountList();
	private String name;
	private LocalDate hireDate;
	
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire){
		this.name = name;
		this.hireDate= LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
			
	}

	public String getName() {
		return name;
	}
	
	public LocalDate getHireDate() {
		return hireDate;
	}
	
	public String getNamesOfAccounts() {
		String output = "";
		for(int i = 0;i<accounts.size(); i++) {
			output += String.format("%2s %n", i+1 + ". " + accounts.get(i).getAcctType().toString());
			
		}
		return output;
	}
	
	public String getAccountName(int accountIndex) {
		return accounts.get(accountIndex).getAcctType().toString();
	}
	
	public void createNewChecking(double startAmount) {		
		accounts.add(new CheckingAccount(this, startAmount));		
	}

	public void createNewSavings(double startAmount) {
		accounts.add(new SavingAccount(this, startAmount));		
	}

	public void createNewRetirement(double startAmount) {
		accounts.add(new RetirementAccount(this, startAmount));			
	}	
	

	public String getFormattedAcctInfo() {	
		
		String output = String.format("%n%n%2s %n%n", "ACCOUNT INFO FOR " + name);
		
		for(int i = 0;i<accounts.size(); i++) {
			output += accounts.get(i).toString();
		}
		
		return output;
	}
	
	public void deposit(int accountIndex, double amt){	
		System.out.println("account is :" + accounts.get(accountIndex));
		Account selected = accounts.get(accountIndex);
		selected.makeDeposit(amt);		
	}
	public void withdraw(int accountIndex, double amt){
		Account selected = accounts.get(accountIndex);
		selected.makeWithdrawal(amt);
	}

}
