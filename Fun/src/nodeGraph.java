import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class nodeGraph
{
    HashMap<Integer, Node> map;

    public nodeGraph()
    {
        this.map = new HashMap<>();
    }
    public class Node
    {
        int data;
        ArrayList<Node> neighbours;
        boolean visited;
        public Node()
        {
            this.neighbours = new ArrayList<>();
            this.visited = false;
        }
        public Node(int d)
        {
            this.data = d;
            this.neighbours = new ArrayList<>();
            this.visited = false;
        }

        public void addNeighbour(Node a)
        {
            neighbours.add(a);
        }
        
        public void printEdges(Node a)
        {
            for(int i =0; i<a.neighbours.size(); i++)
            {
                System.out.print(a.neighbours.get(i).data + " ");
            }
            System.out.println();
        }

    }

    public Node add(int data) {
		Node node = new Node(data);
		map.put(data, node);
		return node;
	}

	public void addEdge(int src, int dest) {
		Node s = null;
		Node d = null;
		if (!map.containsKey(src)) {
			s = add(src);
		} else {
			s = map.get(src);
		}
		if (!map.containsKey(dest)) {
			d = add(dest);
		} else {
			d = map.get(dest);
		}
		s.addNeighbour(d);
		d.addNeighbour(s);

	}

    public boolean hasPath(int src, int dest)
    {
        //if map does not have this keys return null as in these values are not in the graph.

        Node s = map.get(src);
        Node d = map.get(dest);
        boolean ans = bfs(s, d);
        //boolean ansdfs = dfs(s, d, s.visited);

       // if(ans == ansdfs)
        //{
          //  return ans;
        //}
        return ans;
    }
    
    public boolean bfs(Node a, Node b) 
	{
		Queue<Node> q = new LinkedList<Node>();
		HashSet<Node> set = new HashSet<>();
		q.add(a);
		while(!q.isEmpty()) 
		{
			Node top = q.remove();
			set.add(top);
			for(int i =0; i<top.neighbours.size(); i++) 
			{
				if(!set.contains(top.neighbours.get(i))) 
				{
					q.add(top.neighbours.get(i));
					set.add(top.neighbours.get(i));
				}
				if(top.neighbours.get(i) == b) 
				{
					return true;
				}
			}
		}
		return false;
	}

    public boolean dfs(Node a, Node b, HashSet<Node> set) 
	{
		if(set.contains(a)) 
		{
			return false;
		}
		set.add(a);
		
		if(a == b) 
		{
			return true;
		}
		for(int i =0; i<a.neighbours.size(); i++) 
		{
			if(dfs(a.neighbours.get(i), b, set)) 
			{
				return true;
			}
		}
		
		return false;
	}


    public void print() 
    {
    	for(Integer keys : map.keySet()) 
    	{
    		Node a = map.get(keys);
    		System.out.print(keys + " : ");
    		a.printEdges(a);
    	}
    }



}