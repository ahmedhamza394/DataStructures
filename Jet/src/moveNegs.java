import java.util.HashSet;
import java.util.Random;

public class moveNegs {
	public static HashSet<Integer> set = new HashSet<>();
	public static void main(String[] args) 
	{
		int[] arr = new int[] {-10,3,-4,-5,1,9,15};
		
		int j =0;
		for(int i =0; i< arr.length; i++) 
		{
			if(arr[i] < 0) 
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		
		int[] tempArr = new int[arr.length];
		int curr = 0;
		for(int i =0; i<arr.length; i++) 
		{
			if(arr[i] < 0) 
			{
				tempArr[i] = arr[i];
				curr++;
			}
		}
		
		for(int i =0; i< arr.length; i++) 
		{
			if(arr[i] > 0) {
				tempArr[curr] = arr[i];
				curr++;
			}
		}
		
		
		for(int i =0; i<arr.length; i++) 
		{
			System.out.print(tempArr[i] + " ");
		}
		
		/*
		
		String number = "0200";
		int x = Integer.valueOf(number);
		System.out.print(x);
		
		int l = 1;
		System.out.println();
		l = recus(l, 0);
		System.out.println(l); */
	
	}
	
	
	
	public static int recus(int ans, int count) 
	{
		if(count >= 4) 
		{
			return 0;
		}
		
		count++;
		Random rand = new Random(); 
		  
        // Generate random integers in range 0 to 999 
        int rand_int1 = rand.nextInt(10);
        System.out.println("****: " + rand_int1);
        set.add(rand_int1);
        ans = recus(ans, count) + rand_int1;
       return ans; 
       
	}
	
	
	

}
