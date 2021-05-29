public class removekey {
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


// remove agiven key from a list
public void removenode(int value){
    listnode current = head;
    listnode temp = head;
    while(current != null && current.data != value){
        temp = current;
        current = current.next;
    }
    if(current == null) return;
    temp.next = current.next;
}
public static void main(String[] args){
    removekey sll = new removekey();
 


    sll.insertfirst(5);
    sll.insertfirst(3);
    sll.insertfirst(2);
    sll.insertfirst(1);
    sll.display();
    System.out.println("length of singlelinkedlist :"+ sll.length());


    
    
    sll.removenode(2);
    sll.display();
}
}


