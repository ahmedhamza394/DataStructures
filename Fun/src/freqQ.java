import java.util.HashMap;
import java.util.PriorityQueue;

public class freqQ {

	public static void main(String[] args) 
	{
		
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		String a = "aabbazhggffffftreeewaa";
		
		
		for(int i =0; i< a.length(); i++) 
		{
			int temp = map.getOrDefault(a.charAt(i), 0) +1;
			map.put(a.charAt(i), temp);
		}
		
		PriorityQueue<Character> q = new PriorityQueue<>((x,z) -> map.get(z) - map.get(x));
		
		for(Character Keys : map.keySet()) 
		{
			System.out.println(Keys + " : " + map.get(Keys));
			q.add(Keys);
		}
		
		while(!q.isEmpty()) 
		{
			System.out.println(q.remove());
		}
		
		// TODO Auto-generated method stub

	}

}
