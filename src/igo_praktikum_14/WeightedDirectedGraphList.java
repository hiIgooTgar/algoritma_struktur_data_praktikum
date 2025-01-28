package igo_praktikum_14;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class GraphDirect {
    private final Map<Integer, List<Edge>> adjacencyList;
    
    public GraphDirect() {
        adjacencyList = new HashMap<>();
    }
    
    public void addVertex(int vertex) {
        adjacencyList.put(vertex, new ArrayList<>());
    }
    
    public void addEdge(int fromVertex, int toVertex, int weight) {
        Edge edge = new Edge(toVertex, weight);
        List<Edge> edges = adjacencyList.get(fromVertex);
        edges.add(edge);
    }
    
    public void displayAdjacencyList() {
        for(int vertex : adjacencyList.keySet()) {
            List<Edge> edges = adjacencyList.get(vertex);
            System.out.print("Vertex " + vertex + " is connected to : ");
            for(Edge edge : edges) {
                System.out.print(edge.toVertex + "(" + edge.weight + ")");
            }
            System.out.println("");
        }
    }
    
    private static class Edge {
        private int toVertex;
        private int weight;
        
        public Edge(int toVertex, int weight) {
            this.toVertex = toVertex;
            this.weight = weight;
        }
    }
}

public class WeightedDirectedGraphList {

    public static void main(String[] args) {
        GraphDirect graph = new GraphDirect();
        
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        
        graph.addEdge(1, 2, 3);
        graph.addEdge(2, 3, 5);
        graph.addEdge(3, 1, 2);
        
        graph.displayAdjacencyList();
    }
}