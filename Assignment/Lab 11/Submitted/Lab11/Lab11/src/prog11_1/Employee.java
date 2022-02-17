package prog11_1;

import java.util.HashMap;
import java.util.Iterator;

public class Employee {
	private String firstName;
	private String lastName;
	private HashMap salaryRecord;
	//use wrapper class
	Employee(){
		this.salaryRecord = new HashMap<String, Double>();
	}
	
	public void addEntry(String date, double salary) {
		//implement - DONE
		salaryRecord.put(date, salary);//hash ထဲထည့်မှာက date နဲ့ salary နှစ်ခုပဲထည့်ပြီး process လုပ်မှာ မြန်အောင် ကျန်တာတွေက object values တွေ အနေနဲ့ပဲ access လုပ်မှာ
		
	}
	//Jim Jones was paid 3085.0 on 3/15/2006
	//Jim Jones did not receive a paycheck on 5/15/2005
	public void printPaymentAmount(String date) {
		//implement - DONE
		System.out.println(salaryRecord.containsKey(date)?
				firstName + " " + lastName + " was paid " + salaryRecord.get(date)  + " on " + date
				: firstName + " " + lastName + " did not receive a paycheck on " + date);
		
	}
	//Average paycheck for Jim Jones was 3097.5
	public void printAveragePaycheck() {
		//implement - DONE
		double sum = 0;
		//have to loop with Object type for HashMap values
		for(Object sal : salaryRecord.values()) {
			sum += (Double) sal;
		}
		System.out.println("Average paycheck for " + firstName + " " + lastName + " was " + sum);
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setFirstName("Jim");
		e.setLastName("Jones");
		for(int i = 1; i <= 12; ++i) {
			e.addEntry(i+"/15/2011", 3070+5*i);
		}
		e.printPaymentAmount("3/15/2011");
		e.printPaymentAmount("5/15/2010");
		e.printAveragePaycheck();
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
