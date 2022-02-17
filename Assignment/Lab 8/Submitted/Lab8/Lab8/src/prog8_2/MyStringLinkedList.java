package prog8_2;

public class MyStringLinkedList {
	Node header;
	MyStringLinkedList(){
		header = new Node(null);
	}
	/***********insert ****************/
	void insert(String data, int pos) {
		int size = size();
		if(pos < 0 || pos > size) {
			throw new IllegalArgumentException("Illegal postion for new node");	
		}
		if(pos == size) addLast(data);
		else if(pos == 0) addFirst(data);
		else {
			Node n = new Node(data);
			if(header.next == null) //nothing insert yet
				{
				header.next = n;
				n.previous = header;
				}
			else {
				Node temp = header.next;
				int count = 1;
				while (count < pos) {
					temp = temp.next;
					count++;
				}
				//temp - ရှာတွေ့တဲ့နောက်မှာ ထည့်မှာ thats y start count from 1 ထားတာ
				Node last = temp.next;
				temp.next = n; 
				n.next = last;
				last.previous = n;
			}
		}		
	}	
	/************ remove *****************/
	boolean remove(String data) {
		if(data == null) return false;
		Node next = header.next;
		Node current = header;
		while(next != null) {
			if(data.equals(next.value)) {
				current.next = next.next;
				return true;
			}
			//if no equal found
			current = next;
			next = next.next;
		}
		return false;
	}
	
	/******* sorting methods ********/
	public void minSort(){
		//implement - DONE
		Node minNodeR = null;
		Node current = header.next;
		while(current != null) {
			minNodeR = minNode(current);
			swap(current, minNodeR);
			current = current.next;
		}			
	}
	void swap(Node n1, Node n2) {
		String temp = n1.value;
		n1.value = n2.value;
		n2.value = temp;
	}

	//find node which has min value
	Node minNode(Node n) {
		Node cur = n;	
		String min = cur.value;		
		Node next = cur.next;
		Node minNodeR = cur;
		while(next != null) {
			//System.out.println("Comparing " + next.value + " < " + min);
			if(next.value.compareTo(min) < 0) {
				//System.out.println(" is true.");
				min = next.value;				
				minNodeR = next;				
			}
			next = next.next;
		}
		return minNodeR;//one smallest node in whole list
	}

	/********* end sorting methods ********/
	//adds to the front of the list
	public void addFirst(String item){
		Node n = new Node(item);
		//place new node after header and 
		//establish links from new node to 
		//surrounding nodes
		n.next = header.next;
		n.previous = header;
		
		//establish links from surrounding 
		//nodes to the new node
		if(header.next != null){
			header.next.previous = n;
		}		
		header.next = n;	
	}
	
	//adds to the end of the list
	public void addLast(String item) {
		Node n = new Node(item);
		//find last node
		Node last = header;
		while(last.next != null) {
			last = last.next;
		}
		//now last.next == null
        last.next = n;
        n.previous = last;
	}
	
	//removes node in last position
	public void removeLast( ) {
		//if list is empty, return
		if(header.next == null) return;
		
		Node current = header;
		//traverse the list until current.next is 
		//null - then remove current
		while(current.next != null) {
			current = current.next;
		}
		//now current.next == null, so remove current
		Node previous = current.previous; 
		//previous is not null since current is not header
		previous.next = null;
		current.previous = null;
	}
	
	//determines whether the input string is in the list
	public boolean search(String s) {
		Node next = header.next;
		while(next != null && !next.value.equals(s)) {
			next = next.next;
		}
		//either next == null or next.value is s
		if(next == null) return false;
		else {//next.value.equals(s) 
			return true;
		}
	}
	public String toString() { 
		var sb = new StringBuffer();
		Node next = header.next;
		while(next != null) {
			sb.append(next.toString() + ", ");
			next = next.next;
		}
		var result = sb.toString().trim();
		if(result.length() == 0) return "<empty list>";
		if(result.charAt(result.length()-1) == ',') {
			return result.substring(0,result.length()-1);
		}
		return result;			
	}
	class Node {
		String value;
		Node next;
		Node previous;
		Node(String value){
			this.value = value;
		}
		
		public String toString() {
			return value == null ? "null" : value;
		}
	}
	
	/** size = the number of non-null nodes */
	int size() {
		if(header.next == null) return 0;
		Node temp = header.next;//ရှေ့ကကောင်ထည့်ထားတာ
		int count = 0;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		return  count;
	}
	public static void main(String[] args){
		var list = new MyStringLinkedList();
		//********** my test start *********
//		String[] stringData =  {"big", "small", "tall", "short", "round", "square", 
//                "enormous", "tiny","gargantuan", "lilliputian", 
//                "numberless", "none", "vast", "miniscule"};
//	
//		//populate
//		for(int i = stringData.length - 1; i>=0; i--) {
//			list.addFirst(stringData[i]);
//		}
//		System.out.println(list);
//		list.minSort();
//		System.out.println(list);
		
		//********** my test end *********
		list.addLast("Rich");
		System.out.println(list);//Rich
		list.removeLast();
		System.out.println(list);//<empty list>
		list.addFirst("Bob");
		list.addFirst("Harry");
		list.addFirst("Steve");
		System.out.println(list);//Steve, Harry, Bob		
		list.removeLast();
		System.out.println(list);//Steve, Harry
		System.out.println(list.search("Harry"));//true
		System.out.println(list.search("Bob"));//false
		list.addLast("Tom");
		System.out.println(list);
	}
}
