package igo_praktikum_14;
import java.util.*;

class Graph {
    private final List<Integer> vertices;
    private final Map<Integer, List<Integer>> adjacencyList;
    
    public Graph() {
        vertices = new ArrayList<>();
        adjacencyList = new HashMap<>();
    }
    
    public void addVertex(int vertex) {
        if(!vertices.contains(vertex)) {
            vertices.add(vertex);
            adjacencyList.put(vertex, new ArrayList<>());
        }
    }
    
    public void addEdge(int vertex1, int vertex2) {
        if(vertices.contains(vertex1) && vertices.contains(vertex2)) {
            List<Integer> list1 = adjacencyList.get(vertex1);
            list1.add(vertex2);
        } else {
            System.out.println("Vertex not found!");
        }
    }
    
    public void displayGraph() {
        for(int vertex : vertices) {
            List<Integer> neighbors = adjacencyList.get(vertex);
            System.out.print(vertex + " -> ");
            for(int neighbor : neighbors) {
                System.out.print(neighbor + " ");
            }
            System.out.println("");
        }
    }
}

public class ListDirectedGraph {

    public static void main(String[] args) {
        Graph graph = new Graph();
        
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        
        graph.displayGraph();
    }
}