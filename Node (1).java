package Graphs;

import java.util.HashSet;
import java.util.LinkedList;

class Node {
    private String name;
    private LinkedList <Edge> edgeList;

    public Node(String name) {
        this.name = name;
        edgeList = new LinkedList < > ();
    }

    public String getName() {
        return name;
    }

    public LinkedList <Edge> getEdges() {
        return edgeList;
    }
}
