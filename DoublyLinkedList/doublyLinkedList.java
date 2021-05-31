package dll;
public class doublyLinkedList {
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

public  doublyLinkedList(){
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

public static void main(String[] args) {
    doublyLinkedList dll = new doublyLinkedList();
    dll.insertlast(1);
    dll.insertlast(2);
    dll.insertlast(3);
    dll.insertlast(4);

    dll.printforward();
    System.out.println("length of LIst:" + dll.length);
    dll.printbackward();
}
}
