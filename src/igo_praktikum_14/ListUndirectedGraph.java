package igo_praktikum_14;
import java.util.*;

public class ListUndirectedGraph {
    private final Map<Integer, List<Integer>> adjacencyList;
    
    public ListUndirectedGraph() {
        adjacencyList = new HashMap<>();
    }
    
    public void addEdge(int vertex1, int vertex2) {
        adjacencyList.computeIfAbsent(vertex1, k -> new ArrayList<>()).add(vertex2);
        adjacencyList.computeIfAbsent(vertex2, k -> new ArrayList<>()).add(vertex1);
    }
    
    public void displayGraph() {
        for(Map.Entry<Integer, List<Integer>> entry : adjacencyList.entrySet()) {
            int vertex = entry.getKey();
            List<Integer> neighbors = entry.getValue();
            
            System.out.print("Vertex " + vertex + " : ");
            for(int neighbor : neighbors) {
                System.out.print(neighbor + " ");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        ListUndirectedGraph graph = new ListUndirectedGraph();
        
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.addEdge(3, 5);
        
        System.out.println("Adjacency List : ");
        graph.displayGraph();
    }
}