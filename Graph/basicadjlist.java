

import java.util.LinkedList;


public class adjlist {
    public LinkedList<Integer>[] adj;
    private int V;
    private int E;

    public adjlist(int nodes){
        this.E = 0;
        this.V = nodes;
        this.adj = new LinkedList[nodes];
        for(int v = 0 ; v < V ; v++){
            this.adj[v] = new LinkedList<>(); 
        }
    }

    
    public static void main(String[] args) {
        adjlist G = new adjlist(4);

    }
}
