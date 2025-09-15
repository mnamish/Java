package Graphs;

public class GraphAM {
    int count;
    int [][] adj;

    GraphAM(int cnt) {
        count = cnt;
        adj = new int[count][count];
    }

    public void addDirectedEdge(int src, int dst, int cost) {
        adj[src][dst] = cost;
    }

    public void addDirectEdge(int src, int dst) {
        addDirectedEdge(src, dst, 1);
    }

    public void addUndirectedEdge(int src, int dst, int cost) {
        addDirectedEdge(src, dst, cost);
        addDirectedEdge(dst, src, cost);
    }

    public void addUndirectedEdge(int src, int dst) {
        addUndirectedEdge(src, dst, 1);
        addUndirectedEdge(dst, src, 1);
    }

    public void print() {
        for(int i = 0; i < count; j++) {
            System.out.print("Vertex " + i + " is connected to : ");
            for(int j = 0; j < count; j++) {
                if(adj[i][j] != 0){
                    System.out.print( j + "(cost: " + adj[i][j] + ") ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        GraphAM gph = new GraphAM(4);
        gph.addUndirectedEdge(0, 1);
        gph.addUndirectedEdge(0, 2);
        gph.addUndirectedEdge(1, 2);
        gph.addUndirectedEdge(2, 3);
        gph.print();
    }


}
