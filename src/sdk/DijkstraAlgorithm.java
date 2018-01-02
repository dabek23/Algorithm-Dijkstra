package sdk;

import java.util.*;

public class DijkstraAlgorithm {

    public float calculateDistance(Graph graph, Vertex origin, Vertex destination) {

        Set<Vertex> vertices = new HashSet<>(graph.getVertices());

        vertices.forEach(v -> v.setCalculatedDistance(Float.MAX_VALUE));
        origin.setCalculatedDistance(0);

        Queue<Vertex> vertexQueue = new PriorityQueue<>(vertices);

        while (!vertexQueue.isEmpty()) {
            Vertex current = vertexQueue.remove();
            for (Edge edge : current.getEdges()) {
                Vertex neighbour = edge.other(current);
                float newValue = current.getCalculatedDistance() + edge.getValue();
                if (newValue < neighbour.getCalculatedDistance())
                {
                    neighbour.setCalculatedDistance(newValue);
                    vertexQueue.remove(neighbour);
                    vertexQueue.add(neighbour);
                }
            }
        }
        return destination.getCalculatedDistance();
    }
}