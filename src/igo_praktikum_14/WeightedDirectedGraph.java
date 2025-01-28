package igo_praktikum_14;
import java.util.Scanner;

public class WeightedDirectedGraph {

    private final int vertices;
    private final int[][] adjacencyMatrix;
    
    public WeightedDirectedGraph(int vertices) {
        this.vertices = vertices;
        this.adjacencyMatrix = new int[vertices][vertices];
    }
    
    public void addEdge(int source, int destination, int weight) {
        adjacencyMatrix[source][destination] = weight;
    }
    
    public void displayMatrix() {
        System.out.println("Adjacency Matrix : ");
        for(int a = 0; a < vertices; a++) {
            for(int b = 0; b < vertices; b++) {
                System.out.print(adjacencyMatrix[a][b] + " ");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of vertices : ");
        int vertices = input.nextInt();
        
        WeightedDirectedGraph graph = new WeightedDirectedGraph(vertices);
        
        System.out.println("Enter the edges (source, destination, weight)");
        while(true) {
            System.out.print("Enter source (-1 to exit) : ");
            int source = input.nextInt();
            if(source == -1) break;
            
            System.out.print("Enter destination : ");
            int destination = input.nextInt();
            
            System.out.print("Enter weight : ");
            int weight = input.nextInt();
            
            graph.addEdge(source, destination, weight);
        }
        
        graph.displayMatrix();
   }
}