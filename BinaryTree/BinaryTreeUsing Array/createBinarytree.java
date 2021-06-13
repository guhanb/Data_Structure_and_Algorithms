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

    public static void main(String[] args) {
        BInarytreeusingArray newBT = new BInarytreeusingArray(9);
        

    }
}
