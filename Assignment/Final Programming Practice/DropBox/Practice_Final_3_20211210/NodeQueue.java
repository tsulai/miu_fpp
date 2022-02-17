package practise_final;

public class NodeQueue {
	Node head;
	Node tail;
	
	public void enqueue(String s){
		Node newNode = new Node();
		newNode.data = s;
		
		if(head == null) {
			head = newNode;
			tail = newNode;
		}else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	public String dequeue() {
		if(!isEmpty()) {
			String t = head.data;
			head = head.next;
			return t;
		}else {
			return null;
		}
	}
	
	public String peek() {
		//if(isEmpty()) throw new QueueException("Queue is empty!");
		return head.data;
	}

	public boolean isEmpty() {
		return head == null;
	}
	
	private class Node{
		Node next;
		String data;
		
		public String toString() {
			if(data == null ) return "";
			StringBuilder sb = new StringBuilder(data + " ");
			sb = toString(sb, next);
			return sb.toString();
		}
		
		private StringBuilder toString(StringBuilder sb, Node n) {
			if(n == null) return sb;
			sb.append(n.data + " ");
			return toString(sb, n.next);
		}
	}
	
	public String toString() {
		if(isEmpty()) return "<empty queue>";
		return head.toString();
	}
	
	public static void main(String[] args) {
		NodeQueue q = new NodeQueue();
		
		q.enqueue("A");
		q.enqueue("B");
		q.enqueue("C");
		q.enqueue("D");
		q.enqueue("E");
		q.enqueue("F");
		
		System.out.println(q.toString());
		
		q.dequeue();
		System.out.println(q.toString());
		q.enqueue("G");
		System.out.println(q.toString());
		System.out.println("q peek " + q.peek());

	}

}
