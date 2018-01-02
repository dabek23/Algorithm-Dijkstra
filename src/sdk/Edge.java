package sdk;

public class Edge {
    private final float value;
    private Vertex[] vertices = new Vertex[2];

    public Edge(Vertex first, Vertex second, float value) {
        if (first == second) {
            throw new IllegalArgumentException("Edge must link different vertices");
        }
        this.value = value;
        this.vertices[0] = first;
        this.vertices[1] = second;
    }
    public Vertex other (Vertex other) {
        if (other == vertices[0]) {
            return vertices[1];
        } else if (other == vertices[1]) {
            return vertices[0];
        } else {
            throw new IllegalArgumentException("You passed vertex that do not belong to the graph");
        }
    }

    public float getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "value=" + value;
    }
}