/*
 * THis is a Simple Stack Class
 * If you think about it, A Stack is Just a Linked List, but you are adding to the head each time
 * Remember stack is LIFO (Last in First out)
 * Always think stack of plates
 */
public class Hstack 
{
	
	private class Node
	{
		int data;
		Node next;
	}
	Node top;
	int size = 0;
	

	
	public void push(int data) 
	{
		Node node = new Node();		//create a new node
		node.data = data;			
		if(top == null) 		//if it is the first node make this the top		
		{
			top = node;
			size++;
		}
		else 
		{
			node.next = top; //make the new node next pointer be top. data  -> top of stack -> next element
			top = node;		// update top		
			size++;
		}
	}
	
	public int pop() 		//pop removes and return the top element
	{
		int x = top.data;	
		top = top.next;
		size--;
		return x;
	}
	
	public void print() 
	{
		Node h = new Node();
		h = top;
		while(h.next != null) 
		{
			System.out.print(h.data + "->");
			h=h.next;
		}
		System.out.print(h.data);
		System.out.println();
	}
	
	public int peek() 			//return the top element in the stack
	{
		int x = top.data;
		return x;
	}
	
	public boolean isEmpty() 
	{
		if(size > 0) 
		{
			return false;
		}
		return true;
	}
	
}
