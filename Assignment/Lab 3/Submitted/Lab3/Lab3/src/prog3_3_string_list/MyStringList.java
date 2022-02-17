package prog3_3_string_list;

public class MyStringList {
	private final int INITIAL_LENGTH = 2;
	private String[] strArray;
	private int size;
	
	public MyStringList() {		
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}	
	public void add(String s) {
		if(size == strArray.length) {
			resize();
		}		
		strArray[size] = s;
		size++;		
	}
	public String get(int i) { 	
		return strArray[i];
	}
	public boolean find(String s) {	
		for(int i = 0; i<size; i++) {
			if(s == strArray[i]) return true;
		}
		return false;
	}
	public void insert(String s, int pos){
		if(pos > size) {
			System.out.println("Pls choose the position in existing list.");
		}else {			
			if(size == strArray.length-1) {
				resize();
			}			
			String[] newArr = new String[strArray.length];
						
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
	public boolean remove(String s) {		
		String[] newArr = new String[strArray.length];			
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
		System.out.println("Resizing...");
		String[] arrClone = new String[size * 2];
		System.arraycopy(strArray, 0, arrClone, 0, size);
		strArray = arrClone;					
	}
	
}
