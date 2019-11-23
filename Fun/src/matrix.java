import java.util.LinkedList;
import java.util.Queue;
/*
 *    0  1  2
 * 0 [1  2  3 ]
 * 1 [5  6  7 ]
 * 2 [8  9  10]
 * 
 */
public class matrix {
	
	public static class Points
	{
		int x;
		int y;
		
		public Points(int a, int b) 
		{
			this.x = a;
			this.y = b;
			
		}
		
		public Points() {this.x =x; this.y =y;}
	}
	public static int matrixBfs(int[][] nums) 
	{
		int min = Integer.MAX_VALUE;
		int row = nums.length;
		int col = nums[0].length;
		Queue<Points> q = new LinkedList<>();
		 Points point = new Points(0, 0);
		point.x = 0;
		point.y=0;
		q.add(point);
		Queue<Integer> sums = new LinkedList<>();
		sums.add(nums[0][0]);
		
		while(!q.isEmpty()) 
		{
			Points top = q.remove();
			int sum = sums.remove();
			System.out.println("[" + top.x + " , " + top.y + "]");
			if(top.x == row-1 && top.y == col-1) 
			{
				System.out.println("I AM IN HERE");
				min = Math.min(min, sum);
			}
			
			if(top.x+1 < row) 
			{
				Points temp = new Points(top.x+1, top.y);
				q.add(temp);
				int tx = top.x;
				sum += nums[top.x+1][top.y];
				sums.add(sum);
				System.out.println("Inside columns, added: " +  sum);
				sum -= nums[top.x+1][top.y];
				
			}
			
			if(top.y+1 < col) 
			{
				Points temp = new Points(top.x, top.y+1);
				q.add(temp);
				int ty = top.y;
				sum += nums[top.x][top.y+1];
				sums.add(sum);
				System.out.println("Inside Row added: " + sum);
				sum -= nums[top.x][top.y+1];
				
			}
		}
		
		return min;
	}
	
	/*    0 1 2
	 * 0 [1 3 5]
	 * 1 [2 1 0]
	 * 
	 *     0 1 2
	 *  0 [0,1,0],
  		1 [0,0,1],
  		2 [1,1,1],
  		3 [0,0,0]
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		int[][] arr = new int[][] {{0,1,0}, {0,0, 1}, {1,1,1}, {0,0,0}};
		
		int row = arr.length;
		int col = arr[0].length;
		
		for(int i =0; i<row; i++) 
		{
			for(int j =0; j< col; j++) 
			{
				if(i - 1 < 0 || j-1 < 0) 
				{
					
				}
			}
		}
	}
}
