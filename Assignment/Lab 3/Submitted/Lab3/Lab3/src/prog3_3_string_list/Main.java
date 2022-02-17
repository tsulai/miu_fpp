package prog3_3_string_list;

public class Main {

	public static void main(String[] args) {
		//test cases lines from prog3_3_startup folder
		MyStringList l = new MyStringList();
	
		l.add("Bob");
		l.add("Steve");
		l.add("Susan");
		l.add("Mark");
		l.add("Dave");
		System.out.println("The list of size "+l.size()+" is "+l);
		l.remove("Mark");
		l.remove("Bob");
		System.out.println("The list of size "+l.size()+" after remove Mark & Bob is "+l);
		l.insert("Richard",3);
		System.out.println("The list of size "+l.size()+" after inserting Richard into pos 3 is "+l);
		l.insert("Tonya",0);
		System.out.println("The list of size "+l.size()+" after inserting Tonya into pos 0 is "+l);	
				
		
		//test cases lines from pdf instruction
//		MyStringList l = new MyStringList();
//		l.add("Bob");
//		System.out.println("The list of size " + l.size() + " is " + l);
//		l.add("Steve");
//		System.out.println("The list of size " + l.size() + " is " + l);
//		l.add("Susan");
//		System.out.println("The list of size " + l.size() + " is " + l);
//		l.add("Mark");
//		System.out.println("The list of size " + l.size() + " is " + l);
//		l.add("Dave");
//		System.out.println("The list of size " + l.size() + " is " + l);
//		l.remove("Mark");
//		System.out.println("The list of size " + l.size() + " is " + l);
//		l.remove("Bob");
//		System.out.println("The list of size " + l.size() + " is " + l);
	}

}
