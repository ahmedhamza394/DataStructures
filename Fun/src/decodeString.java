import java.util.Stack;


/*
 * Given an encoded string, return it's decoded string.
 * The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being 
 * repeated exactly k times. Note that k is guaranteed to be a positive integer.
 * You may assume that the input string is always valid; No extra white spaces, square brackets are well-formed, etc.
 * Furthermore, you may assume that the original data does not contain any digits and that digits 
 * are only for those repeat numbers, k. For example, there won't be input like 3a or 2[4].
 * 	
 * Examples:
 *	s = "3[a]2[bc]", return "aaabcbc".
 *	s = "3[a2[c]]", return "accaccacc".
 *	s = "2[abc]3[cd]ef", return "abcabccdcdcdef".
 *
 */
public class decodeString 
{
	public static String decodeStrings(String s) 
	{
		String result = "";
		//int index = 0;
		Stack<Integer> intStack = new Stack<>();
		Stack<String> strStack = new Stack<>();
		
		//char[] arr = s.toCharArray();
		for(int i =0; i<s.length(); i++ ) 
		{
			if (Character.isDigit(s.charAt(i))) 
			{
                int x = Character.getNumericValue(s.charAt(i));
                intStack.push(x);
            }
			else if(s.charAt(i) == '[' ) 
			{
				strStack.push(result);
				result = "";
				
			}
			else if(s.charAt(i) == ']')
			{
				StringBuilder temp = new StringBuilder(strStack.pop());
				int x = intStack.pop();
				for(int j= 0; j < x ; j++) 
				{
					temp.append(result);
				}
				result = temp.toString();
			}
			else 
			{
				result += s.charAt(i);
			}
		}
		return result;
    }	
	
	public static void main(String[] args) 
	{
		String a = "3[a2[b]]";
		System.out.print(decodeStrings(a));
		
		
		
	}
}
