import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class runner {

	static List<List<String>> powersets = new ArrayList<>();
	static List<Character> subset = new ArrayList<>();
	static int count  = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Graph g = new Graph(5); g.addEdge(0, 1); g.addEdge(0, 3); g.addEdge(1, 2);
		 * g.addEdge(2, 0); g.addEdge(3, 1); //g.addEdge(4, 3);
		 * 
		 *  
		 * 
		 * for(int i =0; i<5; i++) { System.out.println(i + " is connect to: "+
		 * g.getNode(i)); }
		 */
		/*
		 * nodeGraph g = new nodeGraph(); g.addEdge(0, 1); g.addEdge(0,2); g.addEdge(3,
		 * 2); g.add(4); //g.addEdge(4, 3); g.print(); System.out.println(g.hasPath(1,
		 * 3));
		 */
		
		//int [] num = new int[] {1,2,3};
		//backtrack(num, 0);
		
		//String a = "abcdef";
		//phonepad(a, 0);
		
		
		//Queue<Integer> q = new LinkedList<>();
		//q.po
		
		/*LinkedL_List list = new LinkedL_List(); list.add(1); list.add(2); list.add(3); list.add(6);
		 list.add(4); list.add(9); list.print(); list.reverse(); list.print();*/
	/*	
		FreqStack f = new FreqStack();
		f.push(4);
		f.push(5);
		f.push(3);
		f.push(3);
		f.push(3);
		f.push(5);
		f.push(5);
		f.push(5);f.push(5);
		f.push(5);*/
		
		tracker t = new tracker();
		t.function();
		t.function();
		t.function();
		t.function();
		
		int z = t.function();
		System.out.println(" tracker has been called " + z + " times ");
		
		
		int[][] arr = new int[][] {{2,3},{5,7}, {1,4}, };
		Stack<int[]> s = new Stack<>();
	
		
		Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
		
		s.push(arr[1]);
		
		for(int i =0; i< arr.length; i++) 
		{
			for(int j =0; j< arr[0].length; j++) 
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		s.push(arr[0]);
		for(int i =1; i< arr.length; i++) 
		{
			int[] top = s.peek();
			int[] tempArr = arr[i];
		
			if(top[1] < tempArr[0]) 
			{
				s.push(tempArr);
				//System.out.println("I AM IN HERE");
			}
			else if(top[1] < tempArr[1]) 
			{
				s.pop();
				top[1] = tempArr[1];
				//System.out.print("I am replacing: " + top[1] + " with " + arr[i][1]);
				s.push(top);
			}
		}
		
		int[][] ans = new int[s.size()][2];
		for(int i = s.size()-1; i>= 0; i--) 
		{
			ans[i] = s.pop();
		}
		
		System.out.println("-------------------------------");
		
		for(int i =0; i< ans.length; i++) 
		{
			for(int j =0; j< ans[0].length; j++) 
			{
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	

	
	
	/*
	public static void backtrack (int [] nums, int start) 
	{
		powersets.add(subset);
		for(int i = start; i<nums.length; i++) 
		{
			subset.add(nums[i]);
			count++;
			backtrack(nums, i+1);
			for(int j =0; j< subset.size(); j++) 
			{
				System.out.print(subset.get(j));
			}
			System.out.println();
			subset.remove(subset.size()-1);
			
		}
		
	}*/
	
	public static void phonepad (String a, int start) 
	{
		//powersets.add(subset);
		for(int i = start; i< 2; i++) 
		{
			subset.add(a.charAt(i));
			count++;
			phonepad(a, i+1);
			for(int j =0; j< subset.size(); j++) 
			{
				System.out.print(subset.get(j));
			}
			System.out.println();
			subset.remove(subset.size()-1);
			
		}
		
	}

}
