package prog11_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Schur {
	private List<Integer> list;

	Schur(){
		this.list = new ArrayList<Integer>();
	}
	public static void main(String[] args) {
		Schur sh = new Schur();
		sh.list.add(9);
		sh.list.add(4);
		sh.list.add(5);
		sh.list.add(3);
		sh.list.add(1);
		
		System.out.print(sh.checkForSum(sh.list, 0));

	}
	public boolean checkForSum(List<Integer> list, Integer z) {
		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
		for(Integer i: list) {
			h.put(i, i);
		}
		
		for(Integer it: list) {
			Integer diff = z - it;
			if(h.containsValue(diff)) return true;
		}		
		return false;
	}
}
