import java.util.HashSet;

public class adnanList 
{
	public class Node 
	{
		int data;
		Node next;
		Node(int x)
		{
			this.data =x;
		}
	}
	
	
	private Node head;
	private Node tail;
	private int length;
	
	adnanList()
	{
		this.head = null;
		this.tail = null;
		this.length = 0;
	}
	
	public void add(int x) 
	{
		Node node = new Node(x);
		node.next = null;
		
		if(head == null) 
		{
			head = node;
			length++;
		}
		else 
		{										//time complexity O(n)
			Node h = head;
			while(h.next != null) 
			{
				h=h.next;
			}
			h.next = node;
			length++;
		}
		
	}
	
	public void addFast(int x)   //O(1) 
	{
		//if the list is empty
		Node node = new Node(x);
		node.next = null;
		if(head == null) 
		{
			head = node;
			tail = node; 	
			length++;
		}
		else 
		{
			//if list is not empty
			tail.next = node;
			tail = tail.next;
			length++;
		}
		
		
	}
	
	
	public void print() 
	{
		Node h = head;
		while(h != null) 
		{
			System.out.print(h.data + " -> ");
			h=h.next;
		}
		System.out.println("null");
		
	}
	
	public void at(int pos) 
	{
		int count  = 0;
		Node h = head;
		while(h.next != null) 
		{
			if(count == pos) break;
			h = h.next;
			count++;
			
		}
		System.out.println(h.data);
	}
	
	public int length() 
	{
		return length;
	}
	
	
	public void removeDups() 
	{
		Node h = head;
		Node runner = head.next;
		HashSet<Integer> set = new HashSet<>();
		set.add(h.data);
		while(runner.next !=null) 
		{
			if(!set.contains(h.data)) 
			{
				set.add(runner.data)
			}
			else 
			{
				h.next = runner.next;
			}
			runner = runner.next;
			h = h.next;
		}
		
		
	}

}
