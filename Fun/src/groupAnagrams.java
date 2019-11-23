import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupAnagrams {

	public static void main(String[] args) 
	{
		String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
		
		HashMap<String, List<String>> map = new HashMap<>();
		
		for(int i =0; i<str.length; i++) 
		{
			char[] charArray = str[i].toCharArray();
			Arrays.sort(charArray);
			String s = new String(charArray);
		    if(map.containsKey(s)) 
		    {
		    	map.get(s).add(str[i]);
		    }
		    else 
		    {
		    	List<String> list = new ArrayList<>();
		    	list.add(str[i]);
		    	map.put(s, list);
		    }
		}
		
		List<List<String>> ans = new ArrayList<>();
		ans.addAll(map.values());
	}

}
