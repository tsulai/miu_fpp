package prog9_3;

public class ArrayQueueImpl {
	private int[] arr = new int[10];
	private int size = 0;
	private int front = -1;
	private int rear = 0;
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int size() {
		return size;
	}
	
	public void resize() {
		int[] newArr = new int[arr.length * 2];
		for(int i = 0; i<arr.length; i++) {
			newArr[i] = arr[i];
		}
		arr = newArr;
	}	
	public void enqueue(int val) {//last in	
		if(front <0) {
			front ++;
		}
		size++;
		if(rear > arr.length-1) {
			resize();
		}
		arr[rear] = val;
		rear++;		
	}
	
	public void dequeue() {//first out
		if(front == rear) {
			return ; 
		}else {						
			front ++;
			size--;			
		}	
	}	
	public int peek() {
		if(isEmpty()) throw new IllegalStateException("Cannot peek because Queue is empty!");
		if (front == -1) front = 0;
		return arr[front];
	}
	public static void main(String[] args) {
		ArrayQueueImpl q = new ArrayQueueImpl();
		
		//uncomment when ready
		for(int i = 0; i < 15; i ++)
			q.enqueue(i);
		for(int i = 0; i < 14; i ++)
			q.dequeue();
		System.out.println(q.size());
		System.out.println(q.peek());
	}
}

