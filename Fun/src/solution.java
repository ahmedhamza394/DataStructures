import java.util.HashMap;

/* 
 * You have a halal cart. Customers stand in a queue to buy a gyro for $5. 
 * They can pay in either $5, $10, or $20 bills. 
 * You must give them exact change
 * Given an input array of what each customer paid, return true if you can provide exact change. FAlse if you can't. 
 * 
 * [5,10,5,20] = true
 * [5,5,5,10] = true
 * [5,5,20] = false
 * [5,5,5,5,5,5,20] = true
 * 
 * 
 * 
 *
 * bool exactChange(ArrayList<int> change)
 */

public class solution {

	public static boolean exactChange(int[] nums) {

		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(5, 0);
		map.put(10,0);
		map.put(20,0);

		for (int i = 0; i < nums.length; i++) {
			if (!map.containsKey(nums[i])) {
				map.put(nums[i], 1);
			} else {
				map.put(nums[i], map.get(nums[i]) + 1);
			}
			if (nums[i] == 5) {
				continue;
			}
			if (nums[i] == 10 && map.get(5) >= 1) {
				map.put(5, map.get(5) - 1);
			}

			else if ((nums[i] == 20 && (map.get(5) >= 3))
					|| (nums[i] == 20 && ((map.get(5) >= 1) && map.get(10) >= 1))) {
				if ((map.get(5) >= 1) && map.get(10) >= 1) {
					map.put(5, map.get(5) - 1);
					map.put(10, map.get(10) - 1);
				} else if (map.get(5) >= 3) {
					map.put(5, map.get(5) - 3);
				}

			} else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] arr = {5, 5,5,5,5, 20};
		System.out.print(exactChange(arr));
	}

}