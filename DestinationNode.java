package TicketToRide;

import java.util.*;

public class DestinationNode {
    String name;
    Map<DestinationNode, Route> connections;

    public DestinationNode(String name) {
        this.name = name;
        this.connections = new HashMap<>();
    }

    // Add connection with distance and time
    public void addConnection(DestinationNode destination, int distance, int time) {
        connections.put(destination, new Route(distance, time));
    }
}
