package binarytree;

import java.util.ArrayList;

public class createbasictree {
    String data;
    ArrayList<createbasictree> children;

    private createbasictree(String data){
        this.data = data;
        this.children = new ArrayList<createbasictree>();
    }

    public void addchild(createbasictree node){
        this.children.add(node);
    }

    public String print(int level){
        String ret;
        ret = "  ".repeat(level)+data+"\n";
        for(createbasictree node : this.children){
            ret += node.print(level+1);
        }
        return ret;
    }

    public static void main(String[] args) {
        createbasictree drinks = new createbasictree("Drinks");
        createbasictree hot = new createbasictree("Hot");
        createbasictree cold = new createbasictree("Cold");
        createbasictree tea = new createbasictree("tea");
        createbasictree black = new createbasictree("Black");
        createbasictree beer = new createbasictree("Beer");
        createbasictree wine = new createbasictree("Wine");
        drinks.addchild(hot);
        drinks.addchild(cold);
        hot.addchild(tea);
        hot.addchild(black);
        cold.addchild(wine);
        cold.addchild(beer);
        System.out.println(drinks.print(0));
    }
}
