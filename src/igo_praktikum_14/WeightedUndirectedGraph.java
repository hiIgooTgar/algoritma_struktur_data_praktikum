package igo_praktikum_14;
import java.util.Arrays;

public class WeightedUndirectedGraph {
    private final int[][] adjacencyMatrix;
    private final int vertices;
    
    public WeightedUndirectedGraph(int vertices) {
        this.vertices = vertices;
        this.adjacencyMatrix = new int[vertices][vertices];
        for(int a = 0; a < vertices; a++) {
            Arrays.fill(adjacencyMatrix[a], Integer.MAX_VALUE);
        }
    }
    
    public void addEdge(int source, int destination, int weight) {
        adjacencyMatrix[source][destination] = weight;
        adjacencyMatrix[destination][source] = weight;
    }
    
    public void displayMatrix() {
        System.out.println("Weighted Adjacency Matrix : ");
        for(int a = 0; a < vertices; a++) {
            for(int b = 0; b < vertices; b++) {
                if(adjacencyMatrix[a][b] == Integer.MAX_VALUE) {
                    System.out.print("INF\t");
                } else {
                    System.out.print(adjacencyMatrix[a][b] + "\t");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int vertices = 4;
        WeightedUndirectedGraph graph = new WeightedUndirectedGraph(vertices);
        
        graph.addEdge(0, 1, 2);
        graph.addEdge(0, 2, 4);
        graph.addEdge(1, 2, 1);
        graph.addEdge(1, 3, 7);
        graph.addEdge(2, 3, 3);
        
        graph.displayMatrix();
    }
}