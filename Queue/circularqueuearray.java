package Queue;



public class circularqueuearray {
    int arr[] ;
    int topOfqueue;
    int BeginningOfQueue;
    int size;

    public circularqueuearray(int size){
        this.arr = new int[size];
        this.topOfqueue = -1;
        this.BeginningOfQueue = -1;
        this.size = size;
        System.out.println("The Queue is created with size "+size);
    }

    
    public boolean isempty(){
        if(topOfqueue == -1){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isFull(){
        
        if(topOfqueue+1 == BeginningOfQueue){
            return true;

        }
        else if(BeginningOfQueue ==0 && topOfqueue+1 == size){
            return true;
        }
        else{
            return false;
        }
    }

    public void enQueue(int value){
        if(isFull()){
            System.out.println("The Queue is full!!");
        }
        else if(isempty()){
            BeginningOfQueue = 0;
            topOfqueue++;
            arr[topOfqueue] = value;
            System.out.println("the "+ value+" is inserted successfully");
        }
        else{
            if(topOfqueue+1 == size){
                topOfqueue = 0;
            }else{
                topOfqueue++;
            }
            arr[topOfqueue] = value;
            System.out.println("The "+value+" is inserted successfully");
        }
    }

    public int deQueue(){
        if(isempty()){
            System.out.println("The Queue is empty");
            return -1;
        }
        else{
            int result = arr[BeginningOfQueue];
            arr[BeginningOfQueue] = 0;
            if(BeginningOfQueue == topOfqueue){
                BeginningOfQueue = topOfqueue = -1;
            }
            else if(BeginningOfQueue +1 == size){
                BeginningOfQueue = 0;
            }
            else{
                BeginningOfQueue++;
            }
            System.out.println("The removed value is "+result);
            return result;
        }
    }

    public int peek(){
        if(isempty()){
            System.out.println("The queue is empty!!");
            return -1;
        }
        else{
            System.out.println("The begginning value is "+arr[BeginningOfQueue]);
            return arr[BeginningOfQueue] ; 
        }
    }

    public static void main(String[] args) {
        circularqueuearray queue = new circularqueuearray(4);
        boolean result = queue.isempty();
        System.out.println(result);
        queue.enQueue(1);
        queue.enQueue(3);
        queue.enQueue(9);
        queue.deQueue();
        queue.deQueue();
        queue.peek();

    }

}
