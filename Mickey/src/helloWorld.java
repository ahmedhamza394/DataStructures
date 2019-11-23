import java.util.*;

public class helloWorld {

	
	public static void testing (List<Integer> x) 
	{
		System.out.println("------------" + x + " " + System.identityHashCode(x));
		
		x.remove(1);
		System.out.println(x.size());
	}
	
	public static void main(String[] args) //main class
	{
		List<Integer> x = new ArrayList<>();
		
		x.add(1);
		x.add(2);
		x.add(7);
		
		
		System.out.println("                " + x + " " + System.identityHashCode(x));
		testing(x);
		System.out.println("fjdhfdifd " + x.size());
	
		
	}

}
