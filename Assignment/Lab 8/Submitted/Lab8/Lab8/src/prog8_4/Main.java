package prog8_4;

import java.util.ArrayList;
import java.util.List;

public class Main {
	//List<Address> ဆိုရင် အဲ့အတိုင်းပဲ return ပြန်တာ - List<String> ကိုမပြန်
	private List<Address> listOfAddresses;
	private StringBuilder output = new StringBuilder();
	public static void main(String[] args) {
		Main m = new Main();
		m.loadData();
		m.printAsUpperCase();
	}
	private void loadData(){
		listOfAddresses = new ArrayList<>();
		listOfAddresses.add(new Address("Jim", "101 Adams", "Fairfield", "IA", "52556"));
		listOfAddresses.add(new Address("Tom", "30 W. Burlington", "Fairfield", "IA", "52556"));
		listOfAddresses.add(new Address("Hal", "14 E. Court", "Fairfield", "IA", "52556"));
		listOfAddresses.add(new Address("Sally", "410 W. Jefferson", "Fairfield", "IA", "52556"));
		listOfAddresses.add(new Address("MUM", "1000 N. 4th St", "Fairfield", "IA", "52556"));		

	}
	
	public void printAsUpperCase() {
		listOfAddresses.forEach(add -> output.append(formatFields(add.toUpper())));//calling toUpper method of Address
		System.out.println(output.toString());
	}
	
	private String formatFields(List<String> list) {//received arrayList of addresses
		//System.out.println(String.format("%s%n%s%n%s%s%s%s%s%n%n", list.get(0), list.get(1), list.get(2), ",",list.get(3),",",list.get(4) ).toString());
		return String.format("%s%n%s%n%s%s%s%s%s%n%n", list.get(0), list.get(1), list.get(2), ",",list.get(3),",",list.get(4) ).toString();
	}
	
	
	

}
