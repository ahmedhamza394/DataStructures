import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;

public class maxIsland {

	public static int findIsland(int[][] arr, int i, int j) 
	{
		int count = 0;
		
		Queue<Point> q= new LinkedList<>();
		Point p = new Point(i,j);
		q.add(p);
		
		while(!q.isEmpty()) 
		{
			Point top = q.remove();
			int x = top.x;
			int y = top.y;
			if(arr[top.x][top.y] == 1)
			{
				arr[top.x][top.y] = 0;
				count++;
			}
			
			if((top.x +1) < arr.length && arr[top.x+1][top.y] == 1 ) 
			{
				Point temp = new Point(top.x + 1, top.y);
				q.add(temp);
			}
			
			if(top.x-1 > 0 && arr[top.x-1][top.y] == 1 ) 
			{
				Point temp = new Point(top.x - 1, top.y);
				q.add(temp);
			}
			
			
			if((top.y+1) < arr[0].length && arr[top.x][top.y+ 1] == 1) 
			{
				Point temp = new Point(top.x, top.y+1);
				q.add(temp);
			}
			
			if(top.y-1 > 0 && arr[top.x][top.y- 1] == 1 ) 
			{
				Point temp = new Point(top.x, top.y-1);
				q.add(temp);
			}
		}
		return count;
	}
	
	
	
	
	
	public static void main(String[] args) 
	{
		int[][] arr = new int[][] {{1,0,0,0,0},{1,0,1,0,0}, {1,1,1,0,0}};
		
		int ans = 0;
		for(int i =0; i< arr.length; i++) 
		{
			for(int j = 0; j<arr[0].length; j++) 
			{
				if(arr[i][j] == 1) 
				{
					ans = Math.max(ans, findIsland(arr, i, j));
				}
			}
		}
		
		System.out.println(ans);
	}

}
