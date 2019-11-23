 import java.util.*;
 import java.util.Collections;
 import java.util.Comparator; 


 

class TestPriorityQueue
{  
   public static void main(String args[])
    {  
	   HashMap<Integer, Integer> map = new HashMap<>();
	   PriorityQueue<Integer> queue=new PriorityQueue<Integer>(new freqComparer(map));
	   /*
	   PriorityQueue<Integer> queue=new PriorityQueue<Integer>(new Comparator<Integer>() 
	   {

		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			return 0;
		}
		   
	   }); */
	   int[] arr= new int[] {1,1,1,1,3,4,4,5,5,5, 7,7,7,7,7,7,19,19};
	  
	   for(int i =0; i< arr.length; i++) {
		   
		   if(!map.containsKey(arr[i])) 
		   {
			   map.put(arr[i], 1);
		   }
		   else 
		   {
			   map.put(arr[i], map.get(arr[i]) + 1);
		   }
	   }
     
	   for(Integer Keys : map.keySet()) 
	   {
		   queue.add(Keys);
		   
	   }
	  queue.add(10);
	  queue.add(19);
	  queue.add(3);
	  queue.add(3); 
	  
	  while(!queue.isEmpty()) 
	  {
		  System.out.println(queue.remove());
	  }
	  
	
   }  
} 