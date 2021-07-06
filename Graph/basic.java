
public class indirectedgraph{
    private int V;
    private int E ;
    private int[][] adjMatrix;

    public indirectedgraph(int nodes){
        this.V = nodes;
        this.E = 0;
        this.adjMatrix = new int[nodes][nodes];
    }

    public static void main(String[] args) {
        indirectedgraph G = new indirectedgraph(4);

    }
}
