package igo_praktikum_13;
public class Node {
    public int id;
    public String data;
    public Node leftChild;
    public Node rightChild;
    
    public void displayNode() {
        System.out.println("{" + id + ", " + data + " } ");
    }
}