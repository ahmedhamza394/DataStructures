
public class stringCompression {
	
	public static String recurse(String str, int idx) 
	{
		
		char curr = str.charAt(idx);
		int count = 0;
		String ans = "";
		for(int i = idx; i<str.length(); i++) 
		{
			if(str.charAt(i) != curr) 
			{
				String c = Integer.toString(count);
				ans = c + curr + recurse(str, i);
				return ans;
			}
			else 
			{
				count++;
			}
		}
		String q = Integer.toString(count);
		
		return q + curr;
	}

	public static void main(String[] args) 
	{
		String str = "aaabcca";
		System.out.println(recurse(str, 0));
		/*
		int i =0;
		int j =0;
		int count = 0;
		StringBuilder temp = new StringBuilder();
		while(j< str.length()) 
		{
			if(str.charAt(i) != str.charAt(j)) 
			{
				String c = Integer.toString(count);
				temp.append(c);
				temp.append(str.charAt(i));
				i = j;
				count = 0;
			}
			else 
			{
				j++;
				count++;
			}
		}
		temp.append(count);
		temp.append(str.charAt(j-1));
		System.out.print(temp.toString());*/

	}

}
