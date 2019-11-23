
public class dLinkedList 
{
	
	public class Node
	{
		int data;
		Node next;
		Node prev;
		
		Node(int x)
		{
			this.data = x;
		}
	}
	
	Node head;
	Node tail;
	
	public void add(int data) 
	{
		Node temp = new Node(data);
		if (head == null) 
		{
			head = temp;
			tail = temp;
		}
		else 
		{
			tail.next = temp;
			temp.prev = tail;
			tail = temp;
		}
	}
	
	public void print() 
	{
		Node h = head;
		while(h != null) 
		{
			System.out.print(h.data + " -> ");
			h = h.next;
		}
	}

}
