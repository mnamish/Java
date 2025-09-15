package TicketToRide;

public class LinkedList {
    private DestinationNode head;
    private java.util.LinkedList<DestinationNode> nodes;

    public LinkedList() {
        this.head = null;
        this.nodes = new java.util.LinkedList<>();
    }

    public DestinationNode addDestination(String name) {
        DestinationNode newNode = new DestinationNode(name);
        if (head == null) {
            head = newNode;
        }
        nodes.add(newNode);
        return newNode;
    }

    public DestinationNode findDestination(String name) {
        for (DestinationNode node : nodes) {
            if (node.name.equals(name)) {
                return node;
            }
        }
        return null;
    }

    public java.util.LinkedList<DestinationNode> getNodes() {
        return nodes;
    }

    public void printConnections(DestinationNode node) {
        System.out.println("Connections for " + node.name + ":");
        for (DestinationNode connectedNode : node.connections.keySet()) {
            Route route = node.connections.get(connectedNode);
            System.out.println(" - " + connectedNode.name + " (Distance: " + route.distance + " km)");
        }
    }
}
