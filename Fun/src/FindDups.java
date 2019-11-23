import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int [] arr = {1,2,4,2,5};
		
		Arrays.sort(arr);
		
		for(int i =0; i<arr.length; i++) 
		{
			if(arr[i] == arr[i+1]) 
			{
				System.out.println(arr[i]);
				break;
			}
		}
	}

}
