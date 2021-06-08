public class queuell {
    public listnode head;
    public int length;

    private class listnode{
        private listnode next;
        private int data;

        public listnode(int data){
            this.data = data;
        }
    }

    public queuell(){
        head = null;
        length = 0;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void insert(int value){
        listnode node = new listnode(value);
        if(isEmpty()){
            head = node;
        }
        else{
            listnode current = head;
            
            while(null != current.next){
                current = current.next;
            }
            current.next = node;
        }
        length++;
        
    }

    public void delete(){
        if(isEmpty()){
            System.out.println("The Queue is empty");
        }
        else{
            listnode temp = head;
            head = head.next;
            temp.next = null;
            length--;
        }
        

    }

    public void deleteall(){
        if(isEmpty()){
            System.out.println("the Queue is already empty");
        }
        else{
            head = null;
            System.out.println("Successfully deleted");
        }
    }

    public static class queuelinked{
        queuell Queue;

        public queuelinked(){
            Queue = new queuell();
        }

        public void enqueue(int value){
            Queue.insert(value);
            System.out.println("the "+ value+ " is inserted");
        }

        public void dequeue(){
            System.out.println("The deleted value is "+ Queue.head.data);
            Queue.delete();
            
        }

        public boolean isEmptyQueue(){
            if(Queue.isEmpty()){
                System.out.println("The queue is empty");
                return true;
            }
            else{
                System.out.println("the List is not empty");
                return false;
            }
        }

        public int peek(){
            int result = Queue.head.data;
            System.out.println("The value peeked is "+result);
            return result;
        }

        public void deletequeue(){
            Queue.deleteall();

        }
    }

    public static void main(String[] args) {
        queuelinked Myqueue = new queuelinked();
        Myqueue.enqueue(1);
        Myqueue.enqueue(3);
        Myqueue.enqueue(4);
        Myqueue.dequeue();
        Myqueue.peek();
        Myqueue.isEmptyQueue();
        Myqueue.deletequeue();
        Myqueue.deletequeue();
    }
}
