import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;

public class DissapearingNumber {

	public static ArrayList findNumber(int[] arr) 
	{
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i =0; i<arr.length; i++) 
		{
			if(!map.containsKey(arr[i])) 
			{
				map.put(arr[i], arr[i]);
			}
		}
		ArrayList<Integer> list = new ArrayList<>();
		for(int i =1; i<arr.length; i++) 
		{
			if(!map.containsKey(i)) 
			{
				System.out.print(i +" ");
				list.add(i);
			}
		}
		return list;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] arr = new int[] {4,3,2,5,8,2,3,1};
		findNumber(arr);
		
	}

}
