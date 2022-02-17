package prog8_1;

public class MyStringList {
	private final int INITIAL_LENGTH = 4;
	private String[] strArray; 
	private int size;
	
	public MyStringList() {
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}
	
	/******* sorting methods ********/
	public void minSort(){
		//implement - DONE
		int minIndex = 0;
		for(int i = 0; i <size; i++) {
			minIndex = minpos(i, size-1);
			swap(i, minIndex);
		}
	}
	void swap(int i, int j){
		//implement - DONE
		String temp = strArray[i];
		strArray[i] = strArray[j];
		strArray[j] = temp;
		
	}
	//find minimum of arr between the indices bottom and top
	public int minpos(int bottom, int top){		
		//implement - DONE
		String min = strArray[bottom];
		int index = bottom;//not 0, bottom - as args define range
		for(int i = bottom + 1; i<=top; i++) {
			if(strArray[i].compareTo(min) < 0) {
				min = strArray[i];//assign latest min value
				index = i;//know the place of smallest
			}
		}
		
		return index;
	}

	/********* end sorting methods ********/
	
	/******** binary search methods ********/
	
	//search a sorted array
	boolean binSearchIt(String val) {
	    //implement - DONE
		int lower = 0;
		int upper = size -1;
		while(true) {
			if(lower> upper) return false;
			int mid = (lower + upper)/2;
			if(val == strArray[mid]) return true;//check in mid pos
			if(val.compareTo(strArray[mid]) < 0) {//-1 - less than
				upper = mid -1;				
			}else {
				lower = mid +1;
			}
		}
	}

	/********* end binary search methods *****/
	
	public void add(String s){
		if(size == strArray.length) resize();
		strArray[size++] = s;
	}
	
	public String get(int i){
		if(i < 0 || i >= size){
			return null;
		}
		return strArray[i];
	}
	
	public boolean find(String s){
		for(String test : strArray){
			if(test.equals(s)) return true;
		}
		return false;
	}
	
	public void insert(String s, int pos){
		if(pos > size) return;
		if(pos >= strArray.length||size+1 > strArray.length) {
			resize();
		}
		String[] temp = new String[strArray.length+1];
		System.arraycopy(strArray,0,temp,0,pos);
		temp[pos] = s;
		
		System.arraycopy(strArray,pos,temp,pos+1, strArray.length - pos);
		strArray = temp;
		++size;
		
	}
	
	public boolean remove(String s){
		if(size == 0) return false;
		int index = -1;
		for(int i = 0; i < size; ++i ){
			if(strArray[i].equals(s)){
				index = i;
				break;
			}
		}
		if(index==-1) return false;
		String[] temp = new String[strArray.length];
		System.arraycopy(strArray,0,temp,0,index);
		System.arraycopy(strArray,index+1,temp,index,strArray.length-(index+1));
		strArray = temp;
		--size;
		return true;
	}	
	
	private void resize(){
		System.out.println("resizing");
		int len = strArray.length;
		int newlen = 2*len;
		String[] temp = new String[newlen];
		System.arraycopy(strArray,0,temp,0,len);
		strArray = temp;
	}
	public String toString(){
		StringBuilder sb = new StringBuilder("[");
		for(int i = 0; i < size-1; ++i){
			sb.append(strArray[i]+", ");
		}
		sb.append(strArray[size-1]+"]");
		return sb.toString();
	}
	public int size() {
		return size;
	}

	public static void main(String[] args){
		//String[] testArr = {"big", "small", "tall", "short", "round", "square", "enormous", "tiny","gargantuan", "lilliputian", "numberless", "none", "vast", "miniscule"};
		String[] testArr = {"big", "small", "tall", "short", "round", "square", 
		                    "enormous", "tiny","gargantuan", "lilliputian", 
		                    "numberless", "none", "vast", "miniscule"};

		MyStringList list = new MyStringList();
		for(int i = 0; i < testArr.length; ++i) {
			list.add(testArr[i]);
		}
		list.minSort();
		System.out.println("The list in sorted order:");		
		System.out.println(list.toString());
		//result: [big, enormous, gargantuan, lilliputian, miniscule, none, numberless, round, short, small, square, tall, tiny, vast]
		System.out.println();
		System.out.println("\"number\" is in the list? "+list.binSearchIt("number"));
		System.out.println("\"tiny\" is in the list? "+list.binSearchIt("tiny"));
	}

}
