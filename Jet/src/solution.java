import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class solution {
	
	public static int knight(int n, int hop, HashMap<Integer, String> map, String pos) 
	{
		if(hop == n) 
		{
			return 1;
		}
		int count = 0;
		for(int i=0; i<pos.length(); i++) 
		{
			int c = Character.getNumericValue(pos.charAt(i));			
			String nextPos = map.get(c);
			count += knight(n, hop+1, map, nextPos);
		}
		return count;
	}
	
	
	public static int backtrack(int n, HashMap<Integer, String> map, List<Character> list, int index, int count) 
	{
		if(list.size() == n-1) 
		{
			return 1;
		}
		
		for(int i = index; i<= 9; i++) 
		{
			if(i == 5) continue;
			String temp = map.get(i);
			for(int j =0; j<temp.length(); j++) 
			{
				list.add(temp.charAt(j));
				int x = Integer.valueOf(Character.getNumericValue(temp.charAt(j)));
				count += backtrack(n, map, list, x, count);
				list.remove(list.size()-1);
				
			}
			
		}
		
		return count;
	}
	

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(0, "46");
		map.put(1, "68");
		map.put(2, "97");
		map.put(3, "84");
		map.put(4, "039");
		map.put(5, " ");
		map.put(6, "710");
		map.put(7, "26");
		map.put(8, "13");
		map.put(9, "42");
		
		int n = 7;
		List<Character> list = new ArrayList<>();
		//System.out.print(backtrack(n,map,list,0,0));
		System.out.print(knight(n,0,map, "012346789"));

	}

}
