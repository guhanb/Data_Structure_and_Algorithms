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
    //peek
    public int peek(){
        if(isEmpty()){
            System.out.println("Binary heap is empty");
            return -1;
        }
        return arr[1];
    }

    //sizeofheap
    public int sizeofheap(){
        return sizeoftree;
    }

    //levelorder traversal
    public void levelorder(){
        if(isEmpty()){
            System.out.println("the Heap is empty");
        }
        else{
            for(int i = 1 ; i <= sizeoftree ; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        binaryheap BHeap = new binaryheap(5);
        BHeap.peek();
        BHeap.levelorder();


    }

}
