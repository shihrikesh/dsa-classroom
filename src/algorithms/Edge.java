package algorithms;

import java.util.Objects;

class Edge {
    public final int fromNode;
    public final int toNode;

    private Edge(int fromNode, int toNode){
        this.fromNode = fromNode;
        this.toNode = toNode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edge edge = (Edge) o;
        return fromNode == edge.fromNode && toNode == edge.toNode;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "fromNode=" + fromNode +
                ", toNode=" + toNode +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(fromNode, toNode);
    }

    public static Edge createEdge(int fromNode, int toNode){
return  null;
    }
}
