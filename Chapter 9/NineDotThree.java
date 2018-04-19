public class NineDotThree{
	public static void main(String[] args) {
		//Image of graph layout:
		//https://qph.fs.quoracdn.net/main-qimg-0563516a0d43b1653e59ce5c838d9b46
		Graph g = new Graph();
		g.addEdge("V1", "V2");
		g.addEdge("V1", "V3");
		g.addEdge("V1", "V4");
		g.addEdge("V2", "V4");
		g.addEdge("V2", "V5");
		g.addEdge("V3", "V6");
		g.addEdge("V4", "V3");
		g.addEdge("V4", "V6");
		g.addEdge("V4", "V7");
		g.addEdge("V5", "V4");
		g.addEdge("V5", "V7");
		g.addEdge("V7", "V6");
		System.out.println("Before sort: ");
		System.out.println(g);
		
		System.out.println("Sorted order: (Done in O(N^2)) ");
		System.out.println(g.sort());
	}
}