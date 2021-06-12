package binarytree;


public class BInarytreeusingArray {
    String[] arr;
    int lastusedindex;

    public BInarytreeusingArray(int size){
        arr = new String[size+1];
        this.lastusedindex = 0;
        System.out.println("BT using array is created with size "+size); 
    }

    //isfull
    public boolean isfull(){
        if(arr.length-1 == lastusedindex){
            return true;
        }
        else{
            return false;
        }
    }
    
    
    //levelorder
    public void levelorder(){
        for(int i = 1 ; i < lastusedindex ; i++){
            System.out.print(arr[i] + " ");
        }

    }

    }
    // delete node
    public void deletenode(String value){
        int location = search(value);
        if(location == -1){
            return;
        }
        else{
            arr[location] = arr[lastusedindex];
            lastusedindex--;
            System.out.println("the node is Deleted Successfully");
        }
    }

    public void deleteBT(){
        try{
            arr = null;
            System.out.println("The Bt has been succesfully deleted");
        }
        catch(Exception e){
            System.out.println("there is an error");
        }
    }

    public static void main(String[] args) {
        BInarytreeusingArray newBT = new BInarytreeusingArray(9);
        System.out.println(newBT.isfull());
        newBT.insert("N1");
        newBT.insert("N2");
        newBT.insert("N3");
        newBT.insert("N4");
        newBT.insert("N5");
        newBT.insert("N6");
        newBT.insert("N7");
        newBT.insert("N8");
        newBT.insert("N9");
        
        newBT.levelorder();
        newBT.deletenode("N8");
        newBT.deleteBT();

    }
}
