
public class HaiderList 
{
	class Node 
	{
		int data;
		Node next;
		Node (int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	private Node head;
	
	public void add(int x) {
		Node temp = new Node(x);
		if(head == null) head = temp;
		
		else {
			Node h = head;
			while(h.next != null)
			{
				h = h.next;
			}
			h.next = temp;
		}	
	}
	
	public void printList() 
	{
		Node h = head;
		while(h.next != null) 
		{
			
			System.out.print(h.data + "->");
			h = h.next;
		}
		System.out.print(h.data);
		System.out.println();
		
	}
	
	
	
	
}
