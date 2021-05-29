public class insertnode {
    private listnode head;
    private static class listnode{
        private int data;
        private listnode next;

        public listnode(int data){
            this.data = data;
            this.next = null;
        }
    }

public void display() {
    listnode current = head;         
    while(current != null){
        System.out.print(current.data + "-->");
        current = current.next;
    }
    System.out.println("Null");
}    

public int length(){
    if(head == null){
        return 0;
    }
    int count = 0;
    listnode current = head;
    while (current != null){
        count ++;
        current = current.next;
    }

    return count;

    
}
// insert in first
public void insertfirst(int value){
    listnode newnode = new listnode(value);
    newnode.next = head;
    head = newnode;
}

// insert node from a sorted list
public listnode insertin(int value){
    listnode node = new listnode(value);
    listnode current = head;
    listnode temp = null;
    while(current != null && current.data < node.data){
        temp = current;
        current = current.next;
    }
    node.next = current;
    temp.next = node;
    return head;
}

public static void main(String[] args){
    insertnode sll = new insertnode();
 


    sll.insertfirst(5);
    sll.insertfirst(3);
    sll.insertfirst(2);
    sll.insertfirst(1);
    sll.display();
    System.out.println("length of singlelinkedlist :"+ sll.length());


    
    System.out.println(sll.insertin(4).data);
    sll.display();
    
}
}
