import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class freqComparer implements Comparator<Integer> {
	HashMap<Integer, Integer> map;

	public freqComparer(HashMap<Integer, Integer> m) {
		// this.map = new HashMap<>();
		this.map = m;
	}

	@Override
	public int compare(Integer a, Integer b) {
		
		//System.out.println("I am comparing: " + a + "," + map.get(a));
		//System.out.println("I am comparing: " + b + "," + map.get(b));
		if(!map.containsKey(a)) 
		{
			return 1;
		}
		else if(!map.containsKey(b)) 
		{
			return -1;
		}
		else if(map.get(a) < map.get(b)) 
		{
			return 1;
		}
		
		else if(map.get(a) > map.get(b)) 
		{
			
			return -1;
		}
		else 
		{
			return 0;
		}
	}
	
	
 }
