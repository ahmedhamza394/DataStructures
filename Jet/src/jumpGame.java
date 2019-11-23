import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class jumpGame {
	
	public static boolean canJump(int[] nums) 
	{
		Queue<Integer> index = new LinkedList<>(); //will keep track of what index i am
		Queue<Integer> jumps = new LinkedList<>(); //will keep track of what index i can go to
		HashSet<Integer> visited = new HashSet<>();
		index.add(0);
		jumps.add(nums[0]);
		
		
		while(!index.isEmpty()) 
		{
			int idx = index.remove();
			int jmp = jumps.remove();
			if(idx >= nums.length-1) 
			{
				return true;
			}
			
			for(int i = 0; i < jmp; i++) 
			{
				idx++;
				if(!visited.contains(idx)) 
				{
					visited.add(idx);
					index.add(idx);
					jumps.add(nums[idx]);
				}
				
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		int[] arr = new int[] {2,1,2,0,4};
		System.out.print(canJump(arr));

	}

}
