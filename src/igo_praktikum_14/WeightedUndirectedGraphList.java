package igo_praktikum_14;
import java.util.ArrayList;
import java.util.List;

class Edge {
    int destination, weight;
    
    Edge(int destination, int weight) {
        this.destination = destination;
        this.weight = weight;
    }
}

class GraphList {
    int vertices;
    List<List<Edge>> adjacencyList;

    GraphList(int vertices) {
        this.vertices = vertices;
        adjacencyList = new ArrayList<>(vertices);
        
        for(int a = 0; a < vertices; a++) {
            adjacencyList.add(new ArrayList<>());
        }
    }
        
    void addEdge(int vertex1, int vertex2, int weight) {
        Edge edge1 = new Edge(vertex2, weight);
        adjacencyList.get(vertex1).add(edge1);
        
        Edge edge2 = new Edge(vertex1, weight);
        adjacencyList.get(vertex2).add(edge2);
    }
    
    void displayAdjacencyList() {
        for(int a = 0; a < vertices; a++) {
            System.out.print("Vertex " + a + " : ");
            for(Edge edge : adjacencyList.get(a)) {
                System.out.print("(" + edge.destination + ", " + edge.weight + ")");
            }
            System.out.println("");
        }
    }
}

public class WeightedUndirectedGraphList {

    public static void main(String[] args) {
        GraphList graph = new GraphList(4);
        
        graph.addEdge(0, 1, 2);
        graph.addEdge(0, 2, 4);
        graph.addEdge(1, 2, 1);
        graph.addEdge(2, 3, 3);
        
        graph.displayAdjacencyList();
    }
}