import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Threesum 
{
	HashSet<List<Integer>> set = new HashSet<>();
	 final List<List<Integer>>answer = new ArrayList<>();
	public void function(int[] nums, List<Integer> list, int start, int sum) 
	{
		if(list.size() == 3 && sum == 0 && !set.contains(list)) 
		{
			set.add(list);
			answer.add(list);
			for(int i =0; i< answer.size(); i++) 
			{
				for(int j =0; j< answer.get(0).size(); j++) 
				{
					System.out.print(answer.get(i).get(j));
				}
				System.out.println();
			}
			System.out.println(answer.size());
			return;
		}
		if(list.size() >=3) 
		{
			return;
		}
		for(int i =start; i< nums.length; i++) 
		{
			list.add(nums[i]);
			sum+=nums[i];
			function(nums, list, i+1, sum);
			sum-=nums[i];
			list.remove(list.size()-1);
		}
	}
}
