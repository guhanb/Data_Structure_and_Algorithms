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

    public void heapifyBottomtoTop(int index , String heaptype){
        int parent = index/2;
        if(index <= 1){
            return;
        }
        if(heaptype == "Min"){
            if(arr[index] < arr[parent]){
                int top = arr[index];
                arr[index] = arr[parent];
                arr[parent] = top;
            }
        }else if(heaptype == "Max"){
            if(arr[index] > arr[parent]){
                int top = arr[index];
                arr[index] = arr[parent];
                arr[parent] = top;
            }
        }
        heapifyBottomtoTop(parent, heaptype);
    }

    public void insert(int value,String heaptype){
        arr[sizeoftree + 1] = value;
        sizeoftree++;
        heapifyBottomtoTop(sizeoftree, heaptype);
        System.out.println("inserted "+value+" successfully inserted in heap");
    }

    // heapifytoptobattom
    public void heapifytoptobattom(int index , String heaptype){
        int left = index+2;
        int right = index*2+1;
        int swapchild = 0;
        if(sizeoftree < left){
            return;
        }
        if(heaptype == "Max"){
            if(sizeoftree == left){
                if(arr[index] < arr[left]){
                    int temp = arr[index];
                    arr[index] = arr[left];
                    arr[left] = temp;
                }
                return;
            }else{
                if(arr[left] > arr[right]){
                    swapchild = left;
                }else{
                    swapchild = right;
                }
                if(arr[index] < arr[swapchild]){
                    int temp = arr[index];
                    arr[index] = arr[swapchild];
                    arr[swapchild]= temp;
                }
            }
        }else if(heaptype == "Min"){
            if(sizeoftree == left){
                if(arr[index] > arr[left]){
                    int temp = arr[index];
                    arr[index] = arr[left];
                    arr[left] = temp;
                }
                return;
            }else{
                if(arr[left] < arr[right]){
                    swapchild = left;
                }else{
                    swapchild = right;
                }
                if(arr[index] > arr[swapchild]){
                    int temp = arr[index];
                    arr[index] = arr[swapchild];
                    arr[swapchild]= temp;
                }
            } 
        }
        heapifytoptobattom(swapchild, heaptype); 
    }

    public int extracthead(String heaptype){
        if(isEmpty()){
            return -1;
        }
        else{
             int extractvalue = arr[1];
             arr[1] = arr[sizeoftree];
             sizeoftree--;
             heapifytoptobattom(1, heaptype);
             return extractvalue;
        }
    }

    public void deleteBH(){
        arr = null;
        System.out.println("The heap is Successfully Deleted");
    }

    public static void main(String[] args) {
        binaryheap BHeap = new binaryheap(5);
        BHeap.peek();
        BHeap.levelorder();
        BHeap.insert(10, "Max");
        BHeap.insert(5, "Max");
        BHeap.insert(25, "Max");
        BHeap.insert(30, "Max");
        BHeap.levelorder();
    }
}
