
public class power {
	
	
	public static int pow(int n, int exp) 
	{
		if(exp == 1) 
		{
			return n;
		}
		
		int ans = 0;
		ans = n *pow(n, exp-1);
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		int exp = 3;
		System.out.println(pow(2,4));
		
	}

}
