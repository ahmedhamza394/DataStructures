package test;

public class runner {

	public static void main(String[] args) {
		
		/*
		freqQueue freq = new freqQueue();
		int[] arr = new int[] {-1,-1};
		int k =1;
		freq.topKFrequent(arr, k);*/
		
		Solution s = new Solution();
		int[][] arr = new int[][] {{1,1} , {2,1}, {-1,2}};
		
		int[][] a = s.kClosest(arr, 1);

	}

}
