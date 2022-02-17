package prog5_3;

import java.util.Comparator;
//gotta implement Comparator interface
public class StringLengthComparator implements Comparator<String>{

    boolean ascending;
	StringLengthComparator(boolean ascending) {
		this.ascending = ascending;
	}
	@Override
	public int compare(String o1, String o2) {
		if(o1.length() < o2.length()) return -1;
		else if(o1.length() > o2.length()) return 1;
		else return 0;
//		//easier way:
//		return ascending ? (o1.length() - o2.length())   :
//			(o2.length() - o1.length());
	}
}
