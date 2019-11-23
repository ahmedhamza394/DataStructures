import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class listInterval {

	  public class Interval {
	      int start;
	      int end;
	      Interval() { start = 0; end = 0; }
	      Interval(int s, int e) { start = s; end = e; }
	  }
	 
	
	    public List<Interval> merge(List<Interval> intervals) 
	    {
			intervals.sort(new Comparator<Interval>() 
			{
				public int compare(Interval a, Interval b) 
				{
					return a.end - b.end;
				}
			});
			
			for(int i =0 ; i<intervals.size(); i++) 
			{
				for(int j = intervals.size() -1; j > i; j++) 
				{
					if(intervals.get(i).end > intervals.get(j).start && intervals.get(i).end < intervals.get(j).end) 
					{
						HashSet<String> set = new HashSet<>();
						
					}
				}
			}
	    	return intervals;
	    	
	    }
	}


