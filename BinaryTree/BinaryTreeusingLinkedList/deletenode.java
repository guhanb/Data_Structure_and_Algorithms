package binarytree;

import java.util.LinkedList;
import java.util.Queue;



public class BinarytreeusingLL {
    public String value;
    public BinarytreeusingLL left;
    public BinarytreeusingLL right;
    public int height;

    public static class binarytreeLL{
        BinarytreeusingLL root;

        public binarytreeLL(){
            this.root = null;
        }
        
        
        //level order
        public void levelorder(){
            Queue<BinarytreeusingLL> queue = new LinkedList<BinarytreeusingLL>();
            if(queue.isEmpty()){
                System.out.println("The Bt is empty");
            }
            else{
            queue.add(root);
            while(!queue.isEmpty()){
                BinarytreeusingLL presentnode = queue.remove();
                System.out.print(presentnode.value + " ");

                if(presentnode.left != null){
                    queue.add(presentnode.left);
                }
                if(presentnode.right != null){
                    queue.add(presentnode.right);
                }
            }
        }
        }

       

        // get deepest node
        public BinarytreeusingLL getDeepestValue(){
            Queue<BinarytreeusingLL> queue = new LinkedList<BinarytreeusingLL>();
            queue.add(root);
            BinarytreeusingLL presentnode = null;
            while(!queue.isEmpty()){
                presentnode = queue.remove();
                if(presentnode.left != null){
                    queue.add(presentnode.left);
                }
                if(presentnode.right != null){
                    queue.add(presentnode.right);
                }
            }
            return presentnode;
        }

        public void deletedeepestnode(){
            Queue<BinarytreeusingLL> queue = new LinkedList<BinarytreeusingLL>();
            queue.add(root);
            BinarytreeusingLL previousnode , presentnode = null;
            while(!queue.isEmpty()){
                previousnode = presentnode;
                presentnode = queue.remove();
                if(presentnode.left == null){
                    previousnode.right = null;
                    return;

                }
                else if(presentnode.right == null){
                    presentnode.left = null;
                    return;
                }

                queue.add(presentnode.left);
                queue.add(presentnode.right);

            }
        }

        public void deletenode(String node){
            Queue<BinarytreeusingLL> queue = new LinkedList<BinarytreeusingLL>();
            queue.add(root);
            while(!queue.isEmpty()){
                BinarytreeusingLL presentnode = queue.remove();
                if(presentnode.value == node){
                    presentnode.value = getDeepestValue().value;
                    deletedeepestnode();
                    System.out.println("the node is Deleted Success");
                    return;
                }
                else{
                    if (presentnode.left != null)  queue.add(presentnode.left);
                    if (presentnode.right != null)  queue.add(presentnode.right);
                }
            }
        }

        public void deleteBT(){
            root = null;
            System.out.println("BT has been deleted successfully");
        }
    }

         
        

    public static void main(String[] args) {
        binarytreeLL BinaryTree = new binarytreeLL();
        BinarytreeusingLL N1 = new BinarytreeusingLL();
        N1.value = "N1";
        BinarytreeusingLL N2 = new BinarytreeusingLL();
        N2.value = "N2";
        BinarytreeusingLL N3 = new BinarytreeusingLL();
        N3.value = "N3";
        BinarytreeusingLL N4 = new BinarytreeusingLL();
        N4.value = "N4";
        BinarytreeusingLL N5 = new BinarytreeusingLL();
        N5.value = "N5";
        BinarytreeusingLL N6 = new BinarytreeusingLL();
        N6.value = "N6";
        BinarytreeusingLL N7 = new BinarytreeusingLL();
        N7.value = "N7";
        BinarytreeusingLL N8 = new BinarytreeusingLL();
        N8.value = "N8";
        BinarytreeusingLL N9 = new BinarytreeusingLL();
        N9.value = "N9";

        N1.left= N2;
        N1.right = N3;
        N2.left= N4;
        N2.right = N5;
        N3.left= N8;
        N3.right = N9;
        N4.left= N6;
        N4.right = N7;
        

        BinaryTree.root = N1;

        
        
        BinaryTree.deletenode("N3");
        System.out.println();
        BinaryTree.levelorder();
        BinaryTree.deleteBT();
        BinaryTree.levelorder();



        
    }

}
