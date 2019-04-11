
public class LinkedL_List {

	
	public class Node {
		int data;
		Node next;
		//constructor 
		public Node(int d) {
			this.data = d;
		}

		public Node() {
		}; //in java if you make a constructor, you override the defualt one.
	}

	Node head; 
	Node tail; //its always good to keep track of these 2 pointers

	public void add(int data) {
		Node h = new Node(data);
		h.next = null;
		if (head == null) {
			head = h;
			tail = h;
		} else {
			tail.next = h;  //you could do this without the tail pointer aswell, but it is far slower
			tail = h;
		}
	}

	public void print() {
		Node h = head;
		while (h.next != null) {
			System.out.print(h.data + "->");
			h = h.next;
		}
		System.out.print(h.data);
		System.out.println();
	}

	public Node reverse() {
		Node prev = null;
		Node runner = head.next;		//this technique of using multiple pointers comes in handy
		while (head.next != null) {
			head.next = prev;
			prev = head;
			head = runner;
			runner = runner.next;

		}
		head.next = prev;
		return head;
	}

}
