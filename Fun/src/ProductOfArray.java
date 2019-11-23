import java.util.Arrays;
import java.util.Comparator;

public class ProductOfArray {

	public static void main(String[] args) {
		int [] arr= {7,6,4,2};
		int [] output = new int [arr.length];
		
		for(int i =0; i< arr.length; i++) 
		{
			output[i] = 1;
		}
		for(int i =0; i<arr.length; i++) 
		{
			for(int j =0; j< arr.length; j++) 
			{
				if(i == j) 
				{
					continue;
				}
				else 
				{
					output[i] = output[i]*arr[j];
				}
			}
		}
		
		for(int i =0; i<output.length; i++) 
		{
			System.out.print(output[i] + " ");
		}

	}

}
