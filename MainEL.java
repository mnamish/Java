package Graphs;

public class MainEL {
    public static void main(String[] args) {
        GraphEL ourGraph = new GraphEL();

        // nodes
        Node v0 = new Node("0");
        Node v1 = new Node("1");
        Node v2 = new Node("2");
        Node v3 = new Node("3");

        ourGraph.AddVertex(v0);
        ourGraph.AddVertex(v1);
        ourGraph.AddVertex(v2);
        ourGraph.AddVertex(v3);

        // edges
        ourGraph.AddEdge(v0, v1, 2);
        ourGraph.AddEdge(v1, v2, 3);
        ourGraph.AddEdge(v2, v0, 1);
        ourGraph.AddEdge(v2, v3, 1);
        ourGraph.AddEdge(v3, v2, 4);

        ourGraph.printGraph();
    }
}
