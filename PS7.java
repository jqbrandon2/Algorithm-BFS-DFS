/* Student Name: Brandon Evans
* Date: 11-14-2023
* Class: CS 3103 - Algorithms
* Filename: PS7.java
* Description: Implementation of BFS DFS algorithms.
*/
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;



public class PS7 {
	
	private static int V;                              
    private static LinkedList<Integer> adj[];              
    private static Queue<Integer> queue;

	public static void main(String[] args) {
		
		String studentName = "Brandon Evans";
		
		System.out.println("*******************************************************");
		System.out.printf( "*  Problem Set 7:  Graph Algorithms                   *%n");
		System.out.printf( "*  Student Name:   %-30s     *%n", studentName);
		System.out.println("*******************************************************\n");
		
	
		if ( args.length != 3 ) {
			System.out.println("Invalid command syntax.");
			System.out.println("Syntax:   java PS7 <bfs/dfs> <inputfile> <outputfile>");
			System.exit(1);
		}
		
		args = new String[]{ "abc", "def", "abc"};
		
		String algorithm = args[0];
		String infile    = args[1];
		String outfile   = args[2];
		
		Graph G = new Graph();
		
		
		/********************************************
		 * Constructing the graph
		 ********************************************/
		
		System.out.printf("[Step 1]:  Constructing the graph for input file:  %s %n", infile);
		
		PS7.buildGraph(G, infile);
		
		System.out.printf("[Step 1]:  Complete.  There are %d vertices. %n%n", G.getVertices().size());
		
		
		
		/********************************************
		 * Run algorithm
		 ********************************************/
		System.out.printf("[Step 2]:  Calling graph algorithm.%n" );
		
		// Call runBFS or runDFS
		
		System.out.printf("[Step 2]:  Complete.%n%n" );
		
		
		/********************************************
		 * Print Output
		 ********************************************/
		System.out.printf("[Step 3]:  Building graph output.%n" );
		
		// Build the output as indicated in the problem set.
		
		System.out.printf("[Step 3]:  Complete.%n" );
		
		
		
	}
	
	
	
	public static void buildGraph(Graph G, String inputFile ) {
		
	}

	
	public static void runBFS(Graph g, Vertex s) {
		
		System.out.printf("[Step 2]:  Running BFS algorithm.%n" );
		
		String start = "S";
    	String stop = "M";
    	s = start.indexOf(start);
    	int m = stop.indexOf(stop);
    	boolean nodes[] = new boolean[V];
    	int a = 0;
    	
    	nodes[s] = true;
    	queue.add(s);
    	
    	while (queue.size() != 0) {
    		s = queue.poll();
    		System.out.print("x"+" ");
    		
    		for (int i = 0; i<adj[m].size(); i++) {
    			a = adj[s].get(i);
    			if(!nodes[a]) {
    				nodes[a] = true;
    				queue.add(a);
    			}
    		}
    	}
		
	}
	
	public static void runDFS(Graph g, Vertex s) {
		System.out.printf("[Step 2]:  Running DFS algorithm.%n" );
		
		String start = "S";
    	String stop = "M";
    	s = start.indexOf(start);
    	int m = stop.indexOf(stop);
    	boolean nodes[] = new boolean[V];
    	int a = 0;
    	
    	nodes[s] = true;
    	queue.add(s);
    	
    	while (queue.size() != 0) {
    		s = queue.poll();
    		System.out.print("x"+" ");
    		
    		for (int i = 0; i<adj[m].size(); i++) {
    			a = adj[s].get(i);
    			if(!nodes[a]) {
    				nodes[a] = true;
    				queue.add(a);
    			}
    		}
    	}
    	
    	
    }
		
}
	


class Graph {
	
	private HashSet<Vertex> vertices;
	private HashMap<Vertex, List<Vertex>> adjList;
	
	private Vertex source;

	public Graph() {
		this.vertices = new HashSet<Vertex>();
		this.adjList = new HashMap<>();
	}

	
	
	/**
	 * This method will add a vertex to the graph.
	 */
	public void addVertex(Vertex u) {
		
	}
	
	
	/**
	 * This method will remove a vertex from the graph. 
	 */
	
	public void removeVertex(Vertex u) {
		
	}
	
	/**
	 * This method will add an edge to vertex src to destination vertex dest.
	 * 
	 */
	public void addEdge(Vertex src, Vertex dest) {
		
		adj[v].add(w);
		
	}
	
	/**
	 * This method will remove the edge from vertex src to destination vertex dest.
	 */
	
	public void removeEdge(Vertex src, Vertex dest) {
		
	}
	
	
	
	/**
	 * This method will set the source vertex
	 */
	public void setSourceVertex(Vertex u) {
		this.source = u;
	}
	
	/**
	 * This method will return the source vertex
	 */
	public Vertex getSourceVertex() {
		return this.source;
	}
	
	
	/**
	 * This method will return the adjacency list for vertex u.
	 */
	public HashSet<Vertex> getAdjacencyList(Vertex u) {
		
		return null;
	}
	
	public HashSet<Vertex> getVertices() {
		return this.vertices;
	}
	
	
	
	
	
}


