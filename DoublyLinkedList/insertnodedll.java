package dll;

public class insertnodedll {
    private listnode head;
    private listnode tail;
    private int length;

    private class listnode{
        private int data;
        private listnode next;
        private listnode previous;


        public listnode(int data){
            this.data = data;
        }

    }

public insertnodedll(){
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

public void display(){
    if(head == null){
        return;
    }
    listnode current = head;
    while(current != null){
        System.out.print(current.data + "-->");
        current = current.next;
    }
    System.out.println("null");

}


// insert node at beginning

public void insertnode(int value){
    listnode newnode = new listnode(value);
    if(isEmpty()){
        head = newnode;
    }
    else{
        newnode.next = head;
    }
    head.previous = newnode;
    head = newnode;
    length ++;
}

public void insertlast(int value){
    listnode node = new listnode(value);
    if(isEmpty()){
        head = node;
    }
    else{
        tail.next = node;
        node.previous = tail;
    }
    
    tail = node;
    length ++;
}

public static void main(String[] args) {
    insertnodedll dll = new insertnodedll();
    //dll.insertnode(1);
    //dll.insertnode(10);
    
    //dll.display();
    //System.out.println("length of LIst:" + dll.length);
    dll.insertlast(3);
    dll.insertlast(4);
    dll.insertlast(5);
    dll.display();
    System.out.println("length of LIst:" + dll.length);

}
}