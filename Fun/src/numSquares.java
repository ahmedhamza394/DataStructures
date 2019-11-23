import java.util.LinkedList;
import java.util.Queue;

public class numSquares {

	public static void main(String[] args) 
	{
		System.out.println(perfectSquare(23));
	}
	
	
	public static int perfectSquare(int nums) 
	{
		Queue<Integer> q = new LinkedList<>();
		q.add(nums);
		int depth =0;
		while(!q.isEmpty()) 
		{
			depth++;
			int size = q.size();		
			for(int i =0; i<size; i++) 
			{
				int top = q.remove();
				int sqrt = (int) Math.sqrt(top);
				for(int j = sqrt; j >= 1; j--) 
				{
					int temp = top - j*j;
					if(temp == 0) 
					{
						return depth;
					}
					else 
					{
						q.add(temp);
					}
				}
				
			}
		}
		
		return 0;
	}

}
