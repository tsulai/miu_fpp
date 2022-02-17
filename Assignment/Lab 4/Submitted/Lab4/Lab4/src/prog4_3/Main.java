package prog4_3;

import java.util.Scanner;

import prog4_3.employeeinfo.Employee;

public class Main {
	Employee[] emps = null;
	public static void main(String[] args) {
		new Main();
	}
	Main(){
		emps = new Employee[3];
		emps[0] = new Employee("Jim Daley", 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", 1997, 2,13);
		
		emps[0].createNewChecking(10500);
		emps[0].createNewSavings(1000);
		emps[0].createNewRetirement(9300);
		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);
		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(12600);
		emps[2].createNewRetirement(9000);	
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("A. See a report of all accounts. \nB. Make a deposit. \nC. Make a withdrawal.\r\n"
				+ "Make a selection (A/B/C):");
		String answer = sc.next();
		if(answer.equalsIgnoreCase("a")){
			String info = getFormattedAccountInfo();
			System.out.println(info);
		}else if(answer.equalsIgnoreCase("b")){//deposit
			cashInOutService("d");	
			
		}else if(answer.equalsIgnoreCase("c")) {//withdrawal
			cashInOutService("w");
		}
		else {
			//do nothing..the application ends here
		}	
		sc.close();
	}
	
	void cashInOutService(String flag) {
		Scanner sc = new Scanner(System.in);
		//
		for(int i= 0; i< emps.length; i++) {
			System.out.println(i+1 + ". " + emps[i].getName());
		}
		System.out.print("Select an employee: (type a number) ");
		int empNum = sc.nextInt();
		int selectedEmp = empNum -1;
		
		
			System.out.println("");
			System.out.println(emps[selectedEmp].getNamesOfAccounts());
			System.out.println("Select an account: (type a number) ");
			int accNum = sc.nextInt();
			int selectedAcc = accNum -1;
			
			double amt;
			
				if(flag == "d") {
					System.out.println("Deposite Amount: ");
					amt = sc.nextDouble();
					emps[selectedEmp].deposit(selectedAcc, amt);
					System.out.println(amt +" has been deposited in the " + emps[selectedEmp].getAccountName(selectedAcc) + " account of " + emps[selectedEmp].getName());
				}else if(flag == "w") {
					System.out.println("Withdraw Amount: ");
					amt = sc.nextDouble();
					emps[selectedEmp].withdraw(selectedAcc, amt);
					System.out.println(amt +" has been withdraw from " + emps[selectedEmp].getAccountName(selectedAcc) + " account of " + emps[selectedEmp].getName());
				}
		
		sc.close();
		
	}
	
	String getFormattedAccountInfo(){
		//loop through employees array and get formatted
		//account info for each employee, and assemble into a string
		String output ="";
		for(Employee e : emps) {
			output+= e.getFormattedAcctInfo();
		}	
		return output;
	}
}



