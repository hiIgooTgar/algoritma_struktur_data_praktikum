package igo_praktikum_14;

public class AdjacencyMatrixUndirectGraph {

    public static int[][] createGraph(int numVertices) {
        return new int[numVertices][numVertices];
    }
    
    public static void addEdge(int[][] graph, int vertex1, int vertex2) {
        graph[vertex1][vertex2] = 1;
        graph[vertex2][vertex1] = 1;
    }
    
    public static void displayGraph(int[][] graph) {
        for(int a = 0; a < graph.length; a++) {
            for(int b = 0; b < graph[0].length; b++) {
                System.out.print(graph[a][b] + " ");
            } 
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        int numVertices = 5;
        int[][] myGraph = createGraph(numVertices);
        
        addEdge(myGraph, 0, 1);
        addEdge(myGraph, 0, 2);
        addEdge(myGraph, 1, 3);
        addEdge(myGraph, 2, 4);
        
        displayGraph(myGraph);
    }
}