package prog4_3;

import prog4_3.employeeinfo.Account;

public class AccountList {
	private final int INITIAL_LENGTH = 2;
	private Account[] strArray;
	private int size;
	
	public AccountList() {		
		strArray = new Account[INITIAL_LENGTH];
		size = 0;
	}	
	public void add(Account s) {
		if(size == strArray.length) {
			resize();
		}		
		strArray[size] = s;
		size++;		
	}
	public Account get(int i) { 	
		return strArray[i];
	}
	public boolean find(Account s) {	
		for(Account test : strArray){
			if(test.equals(s)) return true;
		}
		return false;
	}
	public void insert(Account s, int pos){
		if(pos > size) {
			System.out.println("Pls choose the position in existing list.");
		}else {			
			if(size == strArray.length-1) {
				resize();
			}			
			Account[] newArr = new Account[strArray.length];
						
			if(pos == 0) {
				System.arraycopy(strArray,0, newArr, 1, size+1);
				newArr[0]=s;
				size++;
			}else {				
				System.arraycopy(strArray,0, newArr, 0, pos);
				newArr[pos] = s;	
				size++;
				System.arraycopy(strArray,pos, newArr, pos+1, size-pos);
			}			
			strArray = newArr;
		}
	
	}
	public boolean remove(Account s) {		
		Account[] newArr = new Account[strArray.length];			
		size--;		
		for(int i = 0; i<size; i++) {			
			if(s== strArray[i]) {				
				System.arraycopy(strArray, 0, newArr, 0, i);
				System.arraycopy(strArray, i+1, newArr,i , size-i);				
				strArray = newArr;				
				return true;
			}
		}
		return false;	
	}
	
	public String toString() {
		String output = "[";
		for(int i = 0; i <size; i++) {
			output += strArray[i];
			if(i < size - 1) {
				output += ",";
			}else {
				output += "]";
			}
		}
		return output;		
	}
	
	public int size() {
		return size;			
	}
	
	private void resize() {
		//System.out.println("Resizing...");
		Account[] arrClone = new Account[size * 2];
		System.arraycopy(strArray, 0, arrClone, 0, size);
		strArray = arrClone;					
	}
	
}
