import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class runner {
	
	//LinkedList its a data structure 
	
	/*
	 * it's dynamic....it can go forever
	 * arr[10]
	 * arrayList = dynamic array
	 * arrayList<Integer> al = new arrayList<>();
	 * al.length() = 1;
	 * al.add(5);
	 * al.add(10);
	 * al.length = 4;
	 * 8
	 * 16
	 * 
	 * everytime you hit the capacity, it times it by 2
	 * 
	 * arrayList has 50 items this is max size right now
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		/*
		adnanList list = new adnanList();
		list.addFast(10);
		list.addFast(5);
		list.addFast(3);
		
		list.print();
		
		list.at(1);
		
		System.out.println(list.length()); */
		
		String str = "Kiwi loves plastic bags but hates the sound of plastic bags";
		String[] splited = str.split("\\s+");
		
		HashSet<String> set = new HashSet<>();
		
		for(int i =0; i< splited.length; i++) 
		{
			set.add(splited[i]);

		}
		
		String n = set.toString();
		System.out.println(n);
		
	}
	
	

}
