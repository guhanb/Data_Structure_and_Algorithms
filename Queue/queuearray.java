public class queuearray {
    int[] arr;
    int topOfqueue;
    int BeginningOfQueue;
    
    public queuearray(int size){
        this.arr = new int[size];
        this.topOfqueue = -1;
        this.BeginningOfQueue = -1;
        System.out.println("Queue is successfully created with size "+ size);
    }

    public boolean isFull(){
        if(topOfqueue == arr.length-1){
            System.out.println("The queue is full!!");
            return true;
        }
        else{
            
            return false;
        }
    }

    public boolean isEmpty(){
        if(BeginningOfQueue == -1 || BeginningOfQueue == arr.length){
            System.out.println("It is empty");
            return true;
        }
        else{
            
            return false;
        }
    }

    public void enqueue(int value){
        if(isFull()){
            System.out.println("Queue is full");
        }
        else if(isEmpty()){
            BeginningOfQueue = 0;
            topOfqueue++;
            arr[topOfqueue] = value;
            System.out.println("The "+value+" is inserted");
        }
        else{
            topOfqueue++;
            arr[topOfqueue] = value;
            System.out.println("The "+value+" is inserted");
        }

    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("the Queue is empty");
            return -1; 
        }
        else{
            int result = arr[BeginningOfQueue];
            BeginningOfQueue++;
            if(BeginningOfQueue > topOfqueue){
                BeginningOfQueue = topOfqueue = -1;
            }
            System.out.println("The removed value is "+result);
            return result;
        }
    }

    public int peek(){
        if(!isEmpty()){
            return arr[BeginningOfQueue];
        }
        else{
            System.out.println("the queue is empty");
            return -1;
        }
    }

    public void delete(){
        
        arr = null;
        System.out.println("The Queue is deleted Successfullt!!");
        
    }

    public static void main(String[] args) {
        queuearray queue = new queuearray(4);
        
        queue.enqueue(1);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(8);
        queue.enqueue(5);
        queue.isFull();
        queue.dequeue();
        queue.dequeue();
        System.out.println("The value is peeked is "+ queue.peek());
        queue.delete();
        
    }
}
