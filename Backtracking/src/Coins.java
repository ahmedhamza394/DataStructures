import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Coins {
	HashSet<Integer> set = new HashSet<>();

	public void money(int n) {
		int[] arr = new int[] { 25, 10, 5, 1 };
		List<Integer> ans = new ArrayList<>();

		backtrack(arr, ans, 0, n);
	}

	public void backtrack(int[] nums, List<Integer> list, int start, int target) {
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}

		if (sum > target)
			return;

		if (sum == target) {
			if (!set.contains(list.size())) {
				for (int i = 0; i < list.size(); i++) {
					System.out.print(list.get(i));
				}
				System.out.println();
				set.add(list.size());
			}

			return;
		}

		for (int i = 0; i < nums.length; i++) {
			list.add(nums[i]);

			backtrack(nums, list, i, target);

			list.remove(list.size() - 1);
		}
	}
	
	
	public void maxProd(int [] nums, List<Integer> list, int start, int maxprd) 
	{
		int prod = 1;
		for(int i =0; i<list.size(); i++) 
		{
			prod = prod * list.get(i);
		}
		if(prod > maxprd) { 
			maxprd = prod;
			System.out.println(maxprd);
		}
		for(int i =start; i<nums.length; i++) 
		{
			list.add(nums[i]);
			
			maxProd(nums, list, i+1, maxprd);
			list.remove(list.size() -1);
		}
		
	}
}
