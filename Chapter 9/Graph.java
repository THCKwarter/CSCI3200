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
	public String sort(){
		ArrayList<Vertex> arr = new ArrayList<>();
		Queue<Vertex> q = new LinkedList<>();
		Vertex temp;
		String output = "";
		sortHelper(q);
		while(!q.isEmpty()){
			temp = q.remove();
			output += temp + ", | ";
		}
		return "Sorted: " + output;
	}
	private String sortHelper(Queue q){
		findZeroIndegree(q);
		if(q.isEmpty()){
			return "Queue is empty.";
		}else{
			findZeroIndegree(q);
			sortHelper(q);
		}
		return "Sort complete.";
	}
	private void findZeroIndegree(Queue q){
		for(Map.Entry<String,Vertex> vertex : graph.entrySet()){
			if(vertex.getValue().getIndegree() == 0){
				q.add(vertex.getValue());
				System.out.println("Value: " + vertex.getValue());
				graph.remove(vertex);//I have no idea how to manipulate this
			}
		}
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