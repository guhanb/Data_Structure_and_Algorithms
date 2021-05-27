public class middlesearch {
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

public listnode middle(){
    listnode slwnode = head;
    listnode fastnode = head;
    while(fastnode != null && fastnode.next != null){
        slwnode = slwnode.next;
        fastnode = fastnode.next.next;
    }
    return slwnode;
}
public static void main(String[] args){
    middlesearch sll = new middlesearch();
 


    sll.insertfirst(11);
    sll.insertfirst(2);
    sll.insertfirst(8);
    sll.insertfirst(22);
    sll.display();
    System.out.println("length of singlelinkedlist :"+ sll.length());


    listnode middlelist = sll.middle();
    System.out.println("middle node :"+ middlelist.data);
}
}
