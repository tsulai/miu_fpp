package prog10_1.employeebst;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeBST {
	/** The tree root. */
	private Node root;
	//start with an empty tree
		public EmployeeBST() {
			root = null;
		}
	
	/**
	 * Prints the values in the nodes of the tree in sorted order.
	 */
	public void printTree() {
		if (root == null)
			System.out.println("Empty tree");
		else
			printTree(root);
	}

	private void printTree(Node t) {
		if (t != null) {
			printTree(t.left);
			System.out.println(t.element);
			printTree(t.right);
		}
	}
	public void printAsDiagram() {
		BTreePrinter.printNode(root);
	}
	
	public boolean find(Employee x) {
		if(x==null) return false;
		return find(x,root);
	}
	private boolean find(Employee x, Node n){
		NameComparator eComp = new NameComparator();
		if(n == null) return false;
		if(n != null && n.element.equals(x)) return true;
		return (eComp.compare(x, n.element) < 0) ?
				find(x,n.left) :
				find(x,n.right);
		//return find(x,n.left) || find(x,n.right);
	}
	
	public void insert(Employee x) {
		if (root == null) {
			root = new Node(x, null, null);
		}
		else {
			Node n = root;
			boolean inserted = false;
			NameComparator eComp = new NameComparator();
			while(!inserted){
				if(eComp.compare(x,n.element)<0) {//ငယ်တဲ့ဆီဘက် (left)ကိုသွား
					//space found on the left
					if(n.left == null){
						n.left = new Node(x,null,null);
						inserted = true;
					}
					else {
						n = n.left;
					}
				}
				
				else if(eComp.compare(x,n.element)>=0){ //ကြီးတဲ့ဆီဘက် (right)ကိုသွား
					//space found on the right					
					if(n.right==null){
						n.right = new Node(x,null,null);
						inserted = true;
					}
					else {
						n = n.right;
					}
				}
				
			}

		}
	}
	
	private class Node {

		// Constructors
		Node(Employee theElement) {
			this(theElement, null, null);
		}

		Node(Employee element, Node left, Node right) {
			this.element = element;
			this.left = left;
			this.right = right;
		}
		private Employee element; // The data in the node
		private Node left; // Left child
		private Node right; // Right child
	}
	
	static class BTreePrinter {

	    public static void printNode(Node root) {
	        int maxLevel = BTreePrinter.maxLevel(root);

	        printNodeInternal(Collections.singletonList(root), 1, maxLevel);
	    }

	    private static void printNodeInternal(List nodes, int level, int maxLevel) {
	        if (nodes.isEmpty() || BTreePrinter.isAllElementsNull(nodes))
	            return;

	        int floor = maxLevel - level;
	        int endgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
	        int firstSpaces = (int) Math.pow(2, (floor)) - 1;
	        int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

	        BTreePrinter.printWhitespaces(firstSpaces);

	        List newNodes = new ArrayList();
	        for (Object node : nodes) {
	            if (node != null) {
	                System.out.print(((Node)node).element);
	                newNodes.add(((Node)node).left);
	                newNodes.add(((Node)node).right);
	            } else {
	                newNodes.add(null);
	                newNodes.add(null);
	                System.out.print(" ");
	            }

	            BTreePrinter.printWhitespaces(betweenSpaces);
	        }
	        System.out.println("");

	        for (int i = 1; i <= endgeLines; i++) {
	            for (int j = 0; j < nodes.size(); j++) {
	                BTreePrinter.printWhitespaces(firstSpaces - i);
	                if (nodes.get(j) == null) {
	                    BTreePrinter.printWhitespaces(endgeLines + endgeLines + i + 1);
	                    continue;
	                }

	                if (((Node)nodes.get(j)).left != null)
	                    System.out.print("/");
	                else
	                    BTreePrinter.printWhitespaces(1);

	                BTreePrinter.printWhitespaces(i + i - 1);

	                if (((Node)nodes.get(j)).right != null)
	                    System.out.print("\\");
	                else
	                    BTreePrinter.printWhitespaces(1);

	                BTreePrinter.printWhitespaces(endgeLines + endgeLines - i);
	            }

	            System.out.println("");
	        }

	        printNodeInternal(newNodes, level + 1, maxLevel);
	    }

	    static void printWhitespaces(int count) {
	        for (int i = 0; i < count; i++)
	            System.out.print(" ");
	    }

	    static int maxLevel(Node node) {
	        if (node == null)
	            return 0;

	        return Math.max(BTreePrinter.maxLevel(node.left), BTreePrinter.maxLevel(node.right)) + 1;
	    }

	    static boolean isAllElementsNull(List list) {
	        for (Object object : list) {
	            if (object != null)
	                return false;
	        }

	        return true;
	    }
	}
}