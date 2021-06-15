package binaryheap;

public class binaryheap {
    int arr[];
    int sizeoftree;


    public binaryheap(int size){
        arr = new int[size + 1];
        this.sizeoftree = 0;
        System.out.println("The BinaryHeap is created Successfully");
    }

    public boolean isEmpty(){
        if(sizeoftree == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static void main(String[] args) {
        binaryheap BHeap = new binaryheap(5);
        

    }

}
