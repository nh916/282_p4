import java.util.*;

public class Graph {

//    im using the position of the array as the vertex and the list inside to hold the neighbors the vertex is adjacent to

    int numberOfNodes;
    private LinkedList<Node>[] vertex;


    public Graph(int numberOfNodes) {
        this.numberOfNodes = numberOfNodes;

        vertex = new LinkedList[numberOfNodes];

        for (int i = 0; i < numberOfNodes; i++) {
            vertex[i] = new LinkedList<>();
        }

    }

    //    was needed but now not really?
    public void addVertex(int index, Node vertexNode) {
        vertex[index].add(vertexNode);
    }

    // using this
    public void addNeighbor(int index, Node neighborNode) {
        vertex[index].add(neighborNode);
    }

    //    was needed but now not really?
    public boolean checkReachable(int checkFrom, int checkto) {

//        for (int i = 0; i < vertex.length; i++) {
//            for (int j = 0; j < vertex[i].size(); j++) {
//                if (vertex[i].get(j).getVertex() == checkto){
//                    return true;
//                }
//            }
//        }

        for (int i = 0; i < vertex[checkFrom].size(); i++) {
            if (vertex[checkFrom].get(i).getVertex() == checkto) {
                return true;
            }
        }

        return false;
    }


    /*public boolean connected() {
        int checkToSeeIfAnythingPointsToThis;
        boolean returnThis = true;

        for (int i = 0; i < vertex.length; i++) {
            if (vertex[i].isEmpty()) {
                returnThis = false;
                for (int j = 0; j < vertex.length; j++) {
                    for (int k = 0; k < vertex[j].size(); k++) {
                        if (vertex[j].get(k).getVertex() == vertex[i].get(i).getVertex()){
                            returnThis = true;
                        }
                    }
                }
            }
        }
        return returnThis;
    }*/

    //    checks to see if there is any node that has an empty list
    public boolean connected() {
        for (int i = 0; i < vertex.length; i++) {
            if (vertex[i].isEmpty()) {
                return false;
            }
        }
        return true;
    }

    // print
    public void print() {
        for (int i = 0; i < vertex.length; i++) {
            System.out.println("position " + i + vertex[i]);
        }
    }
// started on it but got stuck and stopped
 /*   public void MST() {
        ArrayList<Node> nodesToTake = new ArrayList<Node>();

        if (!connected()) {
            return;
        }

        for (int i = 0; i < vertex.length; i++) {
            for (int j = 0; j < vertex[i].size(); j++) {
                if (vertex[i].get(j).getCost() == i) {
                    nodesToTake.add(new Node(i, 0));
                    nodesToTake.add(vertex[i].get(j));
                    if (nodesToTake.contains(vertex)) {
                        System.out.println(nodesToTake);
                        return;
                    }
                }
            }
        }
    }*/




}
