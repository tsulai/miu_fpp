package prog9_1;
import prog9_1.MyStringLinkedList.Node;
public class MyStringStack {
	//linkedlist ကြီးတစ်ခုဆောက်တယ်
	//linkedlist ကြီးထဲကို list.add နဲ့ထည့်တာတွေက အထဲမှာ node အနေနဲ့ ထည့်ဆောက်သွားမယ် MyStringLinkedListကလုပ်တာ
	//ဒီ stack class က list ထဲကို node ထည့်တာ stack ပုံစံနဲ့ ထည့်ဖို့/ထုတ်ဖို့အတွက်ပဲ
	//node createလုပ်တာ link ချိတ်တာက MyStringLinkedList ထဲမှာလုပ်တာ
	//ဒီမှာက obj instance.(list.method) ခေါ်ပြီး ထည့်/ထုတ်ရုံပဲ - stack အတွက် top တစ်ခုတော့ list ထိပ်ဆုံးကကောင်ကို ချိတ်ရတယ် 
	private MyStringLinkedList list;
	private Node top;
	
	public MyStringStack() {
		this.list = new MyStringLinkedList();//ဒီ arr ထဲကိုလာထည့်မှာ - stack ပုံစံနဲ့ လာထည့်မှာ
		this.top = list.header.next;
	}
	
	public String pop() {
		//implement -DONE
		if(top != null) {
			String s = peek();
			list.remove(0);
			return s;
		}else {
			return null;
		}		
	}
	public String peek() {
		//implement - DONE
		if(top != null) {
			return list.get(0);
		}else {
			return null;
		}		
	}	
	//list ထဲကိုလာထည့်မှာ, လာထည့်မယ့် item က node ဖြစ်ရမယ်။ 
	//stack ပုံစံနဲ့ထည့်မှာဖြစ်တဲ့အတွက် ဒီstack class အတွက် topနေရာအတွက်ပဲ လာထည့်တဲ့ node next ကို ပြင်တာ
	//node create လုပ်တာ link လုပ်တာက MyStringLinkedList ကြီးကလုပ်တာ 
	public void push(String s) {
		//implement	- DONE
		Node newNode = list.add(s);
		newNode.next = top;
		top = newNode;
	}
	
	public String toString(){		
		return list.toString();
	}
	
	public static void main(String[] args) {
		MyStringStack stack = new MyStringStack();
		stack.push("Bob");
		stack.push("Harry");
		stack.push("Alice");
		//System.out.println("stack items: " + stack.toString());
		System.out.println("Popping…"+stack.pop());
		//System.out.println("stack items: " + stack.toString());
		System.out.println("Peeking…."+stack.peek());
		//System.out.println("stack items: " + stack.toString());
		System.out.println("Popping…"+stack.pop());
		//System.out.println("stack items: " + stack.toString());
	}

}
