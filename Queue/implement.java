public class implement {

    private listnode front;
    private listnode rear;
    private int length;

    private class listnode{
        private listnode next;
        private int data;

        public listnode(int data){
            this.data = data;
            this.next = null;
        }


    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void display(){
        if(isEmpty()){
            return;
        }
        listnode current = front;
        while(current != null){
            System.out.print(current.data + "|");
            current = current.next;
        }
        System.out.println("null");
    }

    public void insert(int value){
        listnode node = new listnode(value);
        if(isEmpty()){
            front = node;
        }
        else{
            rear.next = node;
        }
        rear = node;
        length ++;
    }

    

     
    public static void main(String[] args) {
        implement queue = new implement();
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(7);

        queue.display();
        
    }
}
