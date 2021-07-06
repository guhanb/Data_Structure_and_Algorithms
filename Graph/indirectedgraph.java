
public class indirectedgraph{
    private int V;
    private int E ;
    private int[][] adjMatrix;

    public indirectedgraph(int nodes){
        this.V = nodes;
        this.E = 0;
        this.adjMatrix = new int[nodes][nodes];
    }

    public void addedge(int u ,int v){
        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1;
        E++;
    }

    public String toString(){
        StringBuilder SB = new StringBuilder();
        SB.append(V +"  Vertices ," + E + " Edges"+"\n");
        for(int v = 0 ; v < V ; v++){
            SB.append(V + ": ");
            for(int w : adjMatrix[v]){
                SB.append(w +" ");
            }
            SB.append("\n");
        }
        return SB.toString();
        
    }

    public static void main(String[] args) {
        indirectedgraph G = new indirectedgraph(4);
        G.addedge(0, 1);
        G.addedge(1, 2);
        G.addedge(2, 3);
        G.addedge(3, 1);
        System.out.println(G);
    }
}
