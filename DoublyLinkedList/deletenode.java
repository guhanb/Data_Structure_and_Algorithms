import java.util.NoSuchElementException;

public class deletenode {
    private listnode head;
    private listnode tail;
    private int length;

    private  class listnode{
        private int data;
        private listnode previous;
        private listnode next;

        public listnode(int data){
            this.data = data;
        }

    }

public  deletenode(){
    this.head = null;
    this.tail = null;
    this.length = 0;
}

public boolean isEmpty(){
    return length == 0;
}

public int length(){
    return length;
}
// print forward
public void printforward(){
    if(head == null){
        System.out.println("List is empty");
    }
    listnode temp = head;
    while(temp != null){
        System.out.print(temp.data + "==>");
        temp = temp.next;
    }
    System.out.println("null");
}
// print backward
public void printbackward(){
    if(tail == null){
        System.out.println("List is empty");
    }
    listnode ref = tail;
    while(ref != null){
        System.out.print(ref.data + "==>");
        ref = ref.previous;
    }
    System.out.println("Null");
}

public void insertlast(int value){
    listnode node = new listnode(value);
    if(isEmpty()){
        head = node;
    }
    else{
        tail.next = node;
    }
    node.previous = tail;
    tail = node;
    length ++;
}

// delete a first node
public listnode deletefirst(){
    if(isEmpty()){
        throw new NoSuchElementException();
    }
    listnode current = head;
    if(current == tail){
        tail = null;
    }
    else{
        head.next.previous = null;
    }
    head = head.next;
    current.next = null;
    return current;

}

// delete last node
public listnode deletelast(){
    if(isEmpty()){
        throw new NoSuchElementException();
    }
    listnode temp = tail;
    if(tail == head){
        head = null;
    }
    else{
        tail.previous.next = null;
    }
    tail = tail.previous;
    temp.previous = null;
    return temp;
    
}
    
    

public static void main(String[] args) {
    deletenode dll = new deletenode();
    dll.insertlast(1);
    dll.insertlast(2);
    dll.insertlast(3);
    dll.insertlast(4);

    dll.printforward();
    System.out.println("length of LIst:" + dll.length);
    //dll.deletefirst();
    dll.deletelast();
    dll.printforward();
}
}
