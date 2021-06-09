import java.util.NoSuchElementException;

public class remove {
    private listnode front;
    private listnode rear;
    private int length;

    private class listnode{
        private int data;
        private listnode next;

        public listnode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public int length(){
        return length;
    }

    private boolean isEmpty(){
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
        System.out.println("Null");
    }

    public int removenode(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        int result = front.data;
        front = front.next;
        if(front == null){
            rear = null;
        }
        
        length --;
        return result;
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
        length++;
    }

    public static void main(String[] args) {
        remove queue = new remove();
        queue.insert(1);
        queue.insert(4);
        queue.insert(7);
        queue.display();
        queue.removenode();
        queue.display();
    }
}
