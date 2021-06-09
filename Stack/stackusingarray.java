public class stackusingarray {
    int[] arr ;
    int topOfStack;

    public stackusingarray(int size){
        this.arr = new int[size];
        this.topOfStack = 0;
        System.out.println("The stack is created with size "+size);
    }

    public boolean isEmpty(){
        if(topOfStack == 0){

            return true;
        }
        else{
            return false;
        }
    }

    public boolean isfull(){
        if(topOfStack == arr.length){
            System.out.println("The stack is full");
            return true;
        }
        else{
            
            return false;
        }

    }

    public void push(int value){
        if(isfull()){
            System.out.println("This stack is already filled");
        }
        else{
            arr[topOfStack] = value;
            topOfStack++;
            System.out.println("successfully inserted");
        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("The stack is empty");
            return 0 ;
        }
        else{
            int topstack = arr[topOfStack-1];
            topOfStack--;
            return topstack;
        }
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("The stack is empty");
            return 0;
        }
        else{
            return arr[topOfStack - 1];
        }
    }

    public void deletestack(){
        arr = null;
        System.out.println("the Stack is deleted successfully");
    }

    public static void main(String[] args) {
        stackusingarray stack = new  stackusingarray(4);
        stack.push(1);
        stack.push(2);
        stack.push(4);
        stack.push(5);
        stack.pop();
        if(stack.isEmpty()){
            System.out.println("the stack is empty");
        }
        else{
            System.out.println("Stack is not empty");
        }
        stack.isfull();
        System.out.println("The last value that is inserted :"+stack.peek());
        stack.deletestack();
        
    }
}
