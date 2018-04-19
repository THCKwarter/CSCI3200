import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class Graph {
/*
Store: Map of vertex name/vertex object
Constructor
addEdge
addVertex
toString
 */
	private TreeMap<String, Vertex> graph;
	public Graph()
	{
		graph = new TreeMap<>();
	}
	public void addEdge(String v1, String v2, Integer w)
	{
		addVertex(v1);
		addVertex(v2);

		graph.get(v1).addEdge(v2, w);
		graph.get(v2).modifyIndegree(1);;
	}
	public void addEdge(String v1, String v2)
	{
		addEdge(v1, v2, 1);
	}
	public void addEdgeUndirected(String v1, String v2, Integer w)
	{
		addEdge(v1, v2, w);
		addEdge(v2, v1, w);
	}
	public void addEdgeUndirected(String v1, String v2)
	{
		addEdgeUndirected(v1, v2, 1);
	}
	private void addVertex(String v)
	{
		if(!graph.containsKey(v))
		{
			graph.put(v, new Vertex(v));
		}
	}
	
	// =====================
	//Begin topological sort
	public String sort(){ //Big oh of sort() = O(N^2)
		Queue<Vertex> q = new LinkedList<>(); //+1
		int counter = 0; //+2
		String output = ""; //+2
		
		for(Map.Entry<String,Vertex> vertex : graph.entrySet()){ //N
			if(vertex.getValue().getIndegree() == 0){
				q.add(vertex.getValue());
			}
		}
		
		while(!q.isEmpty()){ //N + N^2
			Vertex v = q.remove(); //+2
			v.setTopNum((counter++)); //+2
			
			TreeMap<String, Integer> adjacent = v.getAdj(); //+2
			for(Map.Entry<String,Integer> adj : adjacent.entrySet()){ //N*N
				if(graph.containsKey(adj.getKey())){
					if((graph.get(adj.getKey()).getIndegree()-1) == 0){
						q.add(graph.get(adj.getKey()));
					}
				}
			}
		}
		
		for(Map.Entry<String,Vertex> v : graph.entrySet()){ //N
			output += v.getKey() + ", ";
		}
		
		return output;
	}
	//End topological sort
	// =====================
	
	public String toString()
	{
		String output = "";
		for(Map.Entry<String,Vertex> vertex : graph.entrySet())
		{
			output += vertex.getValue().toString();
		}
		return output;
	}

}