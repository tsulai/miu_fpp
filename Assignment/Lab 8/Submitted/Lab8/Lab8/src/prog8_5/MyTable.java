package prog8_5;

public class MyTable {
	private Entry[] entries = new Entry[26];
	
	//returns the String that is matched with char c in the table
	public String get(char c){
		//implement - DONE		
		return entries[getCharIndex(c)].toString();
	}
	//adds to the table a pair (c, s) so that s can be looked up using c 
	public void add(char c, String s) {
		//implement - DONE
		if(c == ' ' || s == "") return;				
		Entry e = new Entry(s,c);	
		
		entries[getCharIndex(c)] = e;		
	}
	//a=97 .. z = 122
	private int getCharIndex(char c) {
		return (int)c - 97;
	}
	//returns a String consisting of nicely formatted display
	//of the contents of the table
	public String toString() {//Array တစ်ခုလုံးရဲ့ toString မို့လို့ array item လေးတွေကို loop ပတ်ပြီးထုတ်ပေးရမယ်
		//implement - DONE
		String output ="";
		for(int i = 0; i< 26; i++) {
			if(entries[i] != null) {
				output += String.format("%s%n", entries[i].toString());              
            }
		} 
		return output;
	}
	
	//'a',"Andrew"
	//'b', "Billy"
	private class Entry {
		char ch;
		String str;
		
		Entry(String str, char ch){
			//implement - DONE
			this.ch = ch;
			this.str = str;
		}
		//returns a String of the form "ch->str" 
		public String toString() {
			//implement - DONE
			return (ch + "->" + str);
		}
	}
	
	public static void main(String[] args) {
		
		MyTable t = new MyTable();
		t.add('a', "Andrew");
		t.add('b',"Billy");
		t.add('w',"Willie");

		System.out.println(t);		
	}

}