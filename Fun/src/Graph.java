import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Graph 
{
	HashMap<Integer, ArrayList<Integer>> nodeLookup = new HashMap<>();
	int Vertices;
	public Graph(int v) 
	{
		this.Vertices = v;
		for(int i =0; i<v; i++) 
		{
			ArrayList<Integer> l = new ArrayList<>();
			nodeLookup.put(i, l);
		}
	}

	public ArrayList getNode(int data) 
	{
		return nodeLookup.get(data);
	}
	
	public void addEdge(int src, int dest) 
	{
		List s= getNode(src);
		List d = getNode(dest);
		s.add(dest);
		d.add(src);
	}
}
