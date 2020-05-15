package testing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class permutation {
	HashMap<Character, Integer> map = new HashMap<>();
	HashMap<Character, Integer> used = new HashMap<>();
	HashSet<String> set = new HashSet<>();
	
	public void createMap(String s) {
		for(int i =0; i< s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		}
	}
	
	public void printMap(HashMap<Character, Integer> m) {
		for(Character keys: m.keySet()) {
			System.out.println(keys + " : " + m.get(keys));
		}
	}
	
	public void generatePermutation(String s) throws IOException {
		List<Character> ans = new ArrayList<>();
		createMap(s);
		for(Character keys: map.keySet()) {
			used.put(keys, 0);
		}
		File file = new File("D:\\fakeDesktop\\english-words\\words_alpha.txt");   
	    BufferedReader br = new BufferedReader(new FileReader(file)); 
		try {
		    String line;
		    while ((line = br.readLine()) != null) {
		       if(line.length() > 2 && line.length() <= s.length()){
		    	   //System.out.println("adding: " + line + " to set");
		    	   set.add(line);}
		    }
		} 
		finally {
		    br.close();
		}
		
		
		backtrack(0, s, ans);
	}
	
	
	public void backtrack(int start, String s, List<Character> ans) {
		if(ans.size() == s.length()) {
			StringBuilder dontBreak = new StringBuilder();
			for(int i =0; i<ans.size(); i++) {
				dontBreak.append(ans.get(i));
			}
			if(set.contains(dontBreak.toString()))
				System.out.println(dontBreak.toString());		
			return;
		}
		else 
		{	
			StringBuilder dontBreak = new StringBuilder();
			for(int i =0; i<ans.size(); i++) {
				dontBreak.append(ans.get(i));
			}
			if(set.contains(dontBreak.toString()))
				System.out.println(dontBreak.toString());	
		}
		
		//System.out.println();
		for(int i = 0; i < s.length(); i++) {
				
			if(used.get(s.charAt(i)) < map.get(s.charAt(i))) {
				if(!used.containsKey(s.charAt(i)) || used.get(s.charAt(i)) < map.get(s.charAt(i))) {
					used.put(s.charAt(i), used.getOrDefault(s.charAt(i), 0) +1);
					//printMap(used);
				}
				//System.out.println("Adding: " + s.charAt(i));
				ans.add(s.charAt(i));
				backtrack(i+1, s, ans);
				ans.remove(ans.size() -1);
				used.put(s.charAt(i), used.get(s.charAt(i))-1);
				//printMap(used);
				//System.out.println("************");
			}

		}
	}

}
