import java.util.Map;
import java.util.TreeMap;

public class Vertex {
/*
Store: vertex name, adjacent vertices with weights
Constructor
addEdge
toString
 */
	private String name;
	private TreeMap<String, Integer> adjacent;
	private int indegree;
	public Vertex(String n)
	{
		name = n;
		adjacent = new TreeMap<>();
		indegree = 0;
	}
	public void addEdge(String vertex, Integer weight)
	{
		if(!adjacent.containsKey(vertex) || (adjacent.containsKey(vertex) && adjacent.get(vertex) > weight))
		{
			adjacent.put(vertex, weight);
		}
	}
	public void addEdge(String vertex)//unweighted add
	{
		addEdge(vertex, 1);
	}
	public void modifyIndegree(int i)
	{
		indegree += i;
	}
	public int getIndegree()
	{
		return indegree;
	}
	public String toString()
	{
		String output = "Vertex:"+name+"| Indegree: " + indegree + "\n";
		output += "Adjacent:\n";
		for(Map.Entry<String,Integer> vertex : adjacent.entrySet())
		{
			output += vertex.getKey() + ":"+ vertex.getValue()+"\n";
		}
		return output+"\n";

	}
}