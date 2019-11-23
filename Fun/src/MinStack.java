import java.util.Stack;

public class MinStack 
{
	Stack stack1 = new Stack<>();
	Stack minStack = new Stack<>();
	int min = Integer.MAX_VALUE;
	
	public void push(int data) 
	{
		if(data < min) 
		{
			min = data;
		}
		stack1.push(data);
		minStack.push(min);
	}
	
	public void pop() 
	{
		stack1.pop();
		minStack.pop();
	}
	
	public void min() 
	{
		System.out.println(minStack.peek());
	}
}
