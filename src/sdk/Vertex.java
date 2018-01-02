package sdk;

import java.util.ArrayList;
import java.util.List;

public class Vertex implements Comparable<Vertex> {
    private final ArrayList<Edge> edges = new ArrayList<>();
    private final String name;
    private float calculatedDistance;

    public Vertex(String name) {
        this.name = name;
    }

    public void addEdge(Edge edge) {
        edges.add(edge);
    }

    public void link(Vertex other, float value) {
        Edge edge = new Edge(this, other, value);
        edges.add(edge);
        other.edges.add(edge);
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public String getName() {
        return name;
    }

    public float getCalculatedDistance() {
        return calculatedDistance;
    }

    public void setCalculatedDistance(float calculatedDistance) {
        this.calculatedDistance = calculatedDistance;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'';
    }

    @Override
    public int compareTo(Vertex o) {
        return Float.compare(calculatedDistance, o.calculatedDistance);
    }
}