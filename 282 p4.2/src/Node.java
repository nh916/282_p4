public class Node {

    private int vertex;
    private int cost;
    private boolean visited;

    public Node(int vertex, int cost) {
        this.vertex = vertex;
        this.cost = cost;
        visited = false;
    }

    public int getVertex() {
        return vertex;
    }

    public int getCost() {
        return cost;
    }
    public void setVisited(boolean marked) {
        this.visited = marked;
    }
    public boolean getVisited(){
        return this.visited;
    }

    public void markIt(){
        if (!visited){
            this.visited = true;
        }
    }

    @Override
    public String toString() {
        return "Node:" + "\t" +
                "vertex=" + vertex + "\t" +
                "cost=" + cost + "\t";
    }
}
