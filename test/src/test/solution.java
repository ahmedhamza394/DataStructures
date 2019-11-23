package test;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

class Solution {
	
	 HashMap<Double, int [] > map = new HashMap<>();
    public int[][] kClosest(int[][] points, int K) 
    {
         
          int col = points[0].length;
          for(int i =0; i<col; i++)
          {
        	  double power = ((double)points[i][0] * points[i][0]) + (points[i][1] * points[i][1]);
              double sqrt = Math.sqrt(power);
              System.out.println("distance form orgin: " + sqrt);
              int[] arr = new int[]{points[i][0], points[0][i]};
              if(!map.containsKey(sqrt))
              {
                  map.put(power, arr);
              } 
               
          }

       
          PriorityQueue<Double> q = new PriorityQueue<>(new Comparator<Double>() 
          {

			@Override
			public int compare(Double o1, Double o2) {
				
				return 
			}
        	  
          });

            for(double key : map.keySet())
            {
                q.add(key);
            }

            int [][] ans = null;

            for(int i =0; i<K; i++)
            {
                System.out.println(q.remove());
            }
            
            return ans;
    }
}