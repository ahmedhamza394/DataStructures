
public class decodeStringRecurse {
	/*public static String decodeString(String s) {

		if (s.length() == 0)
			return "";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isDigit(c)) {
				int digit_begin = i;
				while (s.charAt(i) != '[')
					i++;
				int num = Integer.valueOf(s.substring(digit_begin, i));
				int count = 1;
				int str_begin = i + 1;
				i++;
				while (count != 0) {
					if (s.charAt(i) == '[')
						count++;
					else if (s.charAt(i) == ']')
						count--;
					i++;
				}
				i--;
				String str = decodeString(s.substring(str_begin, i));
				for (int j = 0; j < num; j++) {
					sb.append(str);
				}
			} else {
				sb.append(c);
			}
		}
		return sb.toString();
	}*/
	
	public static String decodeString(String str) 
	{
		StringBuilder sb = new StringBuilder();
		
		for(int i =0; i< str.length(); i++) 
		{
			if(Character.isDigit(str.charAt(i))) 
			{
				int start = i;
				while(str.charAt(i) != '[') 
				{
					i++;
				}
				int num = Integer.valueOf(str.substring(start, i));
				int bracketCount = 1;
				int strStart = i+1;
				i++;
				while(bracketCount != 0) 
				{
					if(str.charAt(i) == '[') bracketCount++;
					if(str.charAt(i) == ']') bracketCount--;
					i++;
				}
				i--;
				String strCopy = decodeString(str.substring(strStart, i));
				
				while(num > 0) 
				{
					sb.append(strCopy);
					num--;
				}
			}
			else 
			{
				sb.append(str.charAt(i));
			}
		}
		
		return sb.toString();
	}
	
	
	public static void main(String[] args) 
	{
		String str = "2[a2[b]1[c]]";
		System.out.print(decodeString(str));
	}

}
