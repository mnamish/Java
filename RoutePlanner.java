package TicketToRide;

import java.util.*;

public class RoutePlanner {
    public static void findShortestPath(LinkedList ll, String startName, String endName, int choice) {
        DestinationNode start = ll.findDestination(startName);
        DestinationNode end = ll.findDestination(endName);

        if (start == null || end == null) {
            System.out.println("Invalid start or end destination.");
            return;
        }

        Map<DestinationNode, Integer> distances = new HashMap<>();
        Map<DestinationNode, DestinationNode> previous = new HashMap<>();
        Set<DestinationNode> visited = new HashSet<>();

        for (DestinationNode node : ll.getNodes()) {
            distances.put(node, Integer.MAX_VALUE);
        }
        distances.put(start, 0);

        PriorityQueue<DestinationNode> queue = new PriorityQueue<>(Comparator.comparingInt(distances::get));
        queue.add(start);

        while (!queue.isEmpty()) {
            DestinationNode current = queue.poll();

            if (visited.contains(current)) continue;
            visited.add(current);

            for (Map.Entry<DestinationNode, Route> entry : current.connections.entrySet()) {
                DestinationNode neighbor = entry.getKey();
                Route route = entry.getValue();

                int weight = (choice == 1) ? route.distance : route.time;

                if (distances.get(current) + weight < distances.get(neighbor)) {
                    distances.put(neighbor, distances.get(current) + weight);
                    previous.put(neighbor, current);
                    queue.add(neighbor);
                }
            }
        }

        List<String> path = new ArrayList<>();
        for (DestinationNode at = end; at != null; at = previous.get(at)) {
            path.add(at.name);
        }
        Collections.reverse(path);

        if (distances.get(end) == Integer.MAX_VALUE) {
            System.out.println("No path exists.");
        } else {
            System.out.println("Shortest path from " + startName + " to " + endName + ":");
            for (String city : path) {
                System.out.print(city + " ");
            }
            System.out.println("\nTotal " + (choice == 1 ? "distance" : "time") + ": " + distances.get(end));
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        DestinationNode paris = ll.addDestination("Paris");
        DestinationNode berlin = ll.addDestination("Berlin");
        DestinationNode madrid = ll.addDestination("Madrid");
        DestinationNode rome = ll.addDestination("Rome");

        paris.addConnection(berlin, 300, 3);
        berlin.addConnection(madrid, 1500, 12);
        madrid.addConnection(rome, 1400, 14);
        paris.addConnection(madrid, 1000, 10);
        paris.addConnection(rome, 1200, 11);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose pathfinding type: ");
        System.out.println("1 - Find the shortest distance");
        System.out.println("2 - Find the shortest time");
        int choice = scanner.nextInt();

        System.out.println("Enter the starting destination:");
        String startName = scanner.next();
        System.out.println("Enter the ending destination:");
        String endName = scanner.next();

        findShortestPath(ll, startName, endName, choice);
    }
}