import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    final static Map<Character, List<String>> map = new HashMap<>();

    public static List<String> letterCombinations(String digits) {
        final List<String> rst = new ArrayList<String>();
        if (digits == null || digits.length() == 0) {
            return rst;
        }
        
        //Prepare map
        map.put('2', Arrays.asList("a","b","c"));
        map.put('3', Arrays.asList("d","e","f"));
        map.put('4', Arrays.asList("g","h","i"));
        map.put('5', Arrays.asList("j","k","l"));
        map.put('6', Arrays.asList("m","n","o"));
        map.put('7', Arrays.asList("p","q","r","s"));
        map.put('8', Arrays.asList("t","u","v"));
        map.put('9', Arrays.asList("w","x","y","z"));
        
        List<String> list = new ArrayList<>();
        dfs(rst, list, digits.toCharArray(), 0);
        
        return rst;
    }
    
    public static void dfs(List<String> rst, List<String> list, char[] digit, int level) {
        if (list.size() == digit.length) {
            StringBuffer sb = new StringBuffer();
            for (String str : list) {
                sb.append(str);
            }
            rst.add(sb.toString());
            
            for(String str : list) 
            {
            	System.out.print(str);
            }
            System.out.println();
            return;
        }
        
        List<String> letters = map.get(digit[level]);
        for (String letter : letters) {
            list.add(letter);
            dfs(rst, list, digit, level + 1);
            list.remove(list.size() - 1);
        }
    }
    
    
    
    public static void main(String[] args) 
    {
    	letterCombinations("23");
    }
}
