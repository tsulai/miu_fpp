package prog9_4;

public class NodeQueue {
	/* stores the element at the front of the queue, if it exists */
	private Node head;//front
	
	/* stores the element at the end of the queue, if it exists */
	private Node tail;//rear
	
	/**
	 * Inserts a new node containing s at end of queue
	 */
	public void enqueue(String s) {//last in
		//implement
		Node newNode = new Node();
		newNode.data = s;
		if(head==null) {
			head = newNode;
			tail = newNode;
		}else {
			tail.next = newNode;
			tail = newNode;
		}
	}	
	/**
	 * Removes node from the front of the queue and returns its value if
	 * head is n
	 */
	public String dequeue() throws QueueException {//first/head out
		if(isEmpty()) throw new QueueException("Queue is empty!");
				
		String t = head.data;
		head = head.next;
		return t;
	}	
	/**
	 * Returns value stored at the front of the queue
	 * @return
	 * @throws QueueException
	 */
	public String peek() throws QueueException {
		if(isEmpty()) throw new QueueException("Queue is empty!");
		
		return head.data;
	}
	public boolean isEmpty() {
		return head == null;
	}
	@Override
	public String toString() {
		if(isEmpty()) return "<empty queue>";
		return head.toString();
	}
	public static void main(String[] args) throws QueueException {
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
		System.out.println("q peek " + q.peek());
		
	}
}


