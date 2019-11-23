package snippet;

import java.util.HashSet;

public class Llist {
	public class Node {
		int data;
		Node next;
		
		public Node() {
		}

		public Node(int data) {
			this.data = data;

		}
	}

	Node head;
	Node tail; 

	public void add(int data) {
		Node node = new Node(data);
		node.next = null;
		if (head == null) {
			head = node;
			tail = node;
		}
		else 
		{
			tail.next = node;
			tail = node;
		}
	}

	public void print() {
		Node h = head;
		while (h != null) {
			System.out.print(h.data + " -> ");
			h = h.next;
		}
		System.out.println();
	}
	
	public void delete(Node a) 
	{
		a.data = a.next.data;
		a.next = a.next.next;
	}
	
	public void delDups() 
	{
		HashSet<Integer> set = new HashSet<>();
		Node h = head;
		Node prev= null;
		while(h != null) 
		{
			if(!set.contains(h.data)) 
			{
				set.add(h.data);
			}
			else 
			{
				delete(h);
			}
			h=h.next;
		}
	}
}
