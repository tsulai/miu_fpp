package prog4_1_department;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Professor micheal = new Professor("Micheal", 150000, 2000, 06, 15, 10 );
		Professor paul = new Professor("Paul", 200000, 1987, 11, 20, 10 );
		Professor obina = new Professor("Obina", 180000, 1997, 07, 6, 10 );
		
		Secretary amy = new Secretary("Amy", 50000, 2003, 01, 05, 200);
		Secretary thandar = new Secretary("Thandar", 45000, 2012, 10, 01, 200);
		
		DeptEmployee[] department = new DeptEmployee[5];
		department[0] = micheal;
		department[1] = paul;
		department[2] = obina;
		department[3] = amy;
		department[4] = thandar;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Do you want to see the sum of all salaries in the department?(y/n)");
		String answer = sc.next();
		double sumSalary = 0;
		if(answer.equalsIgnoreCase("y")){			
			for(DeptEmployee e: department) {
				//System.out.println(e.getName() +": " + e.computeSalary());
				sumSalary += e.computeSalary();
			}
			System.out.println(sumSalary);
		}
		else {
			//do nothing..the application ends here
		}	
		sc.close();
				
				

	}

}
