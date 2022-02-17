package practise_final;

public class NodeStack {//LIFO
	private Node top;
	
	public int pop() {			
		int val = peek();
		top = top.next;
		return val;		
	}
	
	public int peek() {		
		return top.data;			
	}
	
	public void push(int val) {
		Node newNode = new Node();
		newNode.data = val;
		
		newNode.next = top;
		top = newNode;		
	}
	
	public class Node{
		Node next;
		int data;	
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
