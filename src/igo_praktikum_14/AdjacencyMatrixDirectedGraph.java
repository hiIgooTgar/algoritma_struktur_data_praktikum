package igo_praktikum_14;
import java.util.Arrays;

public class AdjacencyMatrixDirectedGraph {

    public static void main(String[] args) {
        int jumlahSimpul = 4;
        int[][] adjacencyMatrix = new int[jumlahSimpul][jumlahSimpul];
        
        for(int a = 0; a < jumlahSimpul; a++) {
            Arrays.fill(adjacencyMatrix[a], 0);
        }
        
        addEdge(adjacencyMatrix, 0, 1);
        addEdge(adjacencyMatrix, 0, 2);
        addEdge(adjacencyMatrix, 1, 2);
        addEdge(adjacencyMatrix, 2, 0);
        addEdge(adjacencyMatrix, 2, 3);
        addEdge(adjacencyMatrix, 3, 3);
        
        System.out.println("Adjacency Matrix : ");
        displayMatrix(adjacencyMatrix);
    }
    
    private static void addEdge(int[][] matrix, int source, int destination) {
        matrix[source][destination] = 1;
    }
    
    private static void displayMatrix(int[][] matrix) {
        for(int a = 0; a < matrix.length; a++) {
            for(int b = 0; b < matrix[a].length; b++) {
                System.out.print(matrix[a][b] + " ");
            }
            System.out.println("");
        }
    }
}
