package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class freqQueue {
	static HashMap<Integer, Integer> map = new HashMap<>();

	public class Node implements Comparator<Integer> {
		@Override
		public int compare(Integer a, Integer b) {

			return map.get(b) - map.get(a);
		}
	}

	public List<Integer> topKFrequent(int[] nums, int k) {
		PriorityQueue<Integer> queue = new PriorityQueue<>(new Node());

		for (int i = 0; i < nums.length; i++) {
			if (!map.containsKey(nums[i])) {
				map.put(nums[i], 1);
			} else {
				map.put(nums[i], map.get(nums[i]) + 1);
			}
		}

		for (Integer key : map.keySet()) {
			queue.add(key);
		}

		List<Integer> answer = new ArrayList<>();
		for (int i = 0; i < k; i++) {
			answer.add(queue.remove());
		}
		for (int i = 0; i < answer.size(); i++) {
			System.out.println(answer.get(i));
		}

		return answer;

	}

}
