package Graphs;
import java.util.HashSet;

class GraphEL {
private HashSet <Node> nodes;

public GraphEL() {
    nodes = new HashSet < > ();
}

public boolean AddEdge(Node v1, Node v2, int weight) {
    return v1.getEdges().add(new Edge(v2, weight)) && v2.getEdges().add(new Edge(v1, weight));
}

public boolean AddVertex(Node v) {
    return nodes.add(v);
}

public void printGraph() {
    for (Node v: nodes) {
        System.out.print("vertex name: " + v.getName() + ":\n");
        for (Edge e: v.getEdges()) {
            System.out.print("destVertex: " + e.getDestVertex().getName() + ", weight: " + e.getWeight() + "\n");
        }
        System.out.print("\n");
    }
}
}

