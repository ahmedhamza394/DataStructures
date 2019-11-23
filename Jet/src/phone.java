import java.util.LinkedList;
import java.util.Queue;

public class phone {
	
	private int count;
	private long startTime;
	Queue<Long> q = new LinkedList<>();
	Queue<Integer> value = new LinkedList<>();
	private long lastTime;
	
	phone()
	{
		this.count = 0;
		this.startTime = 0L;
		this.lastTime = 0L;
	}
	
	public int function() 
	{
		lastTime = startTime;
		startTime = System.currentTimeMillis();
		
		if(startTime -lastTime > 300) 
		{
			count = 0;
		}
		count++;
		q.add(startTime);
		value.add(count);
		return count;
	}
	
	public int countLast300() 
	{
		long currTime = System.currentTimeMillis();
		while(currTime - q.peek() > 300) 
		{
			q.remove();
			value.remove();
		}
		return value.peek();
		
	}
}
