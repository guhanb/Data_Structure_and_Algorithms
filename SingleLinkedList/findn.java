public class findn {
    private listnode head;
    private static class listnode{
        private int data;
        private listnode next;

        public listnode(int data){
            this.data = data;
            this.next = null;
        }
    }

public int length(){
    if(head == null){
        return 0;
    }
    listnode current = head;
    int count = 0;
    while(current != null){
        count ++;
        current = current.next;
    }
    return count;
}

public void display(){
    listnode current = head;
    while(current != null){
        System.out.print(current.data + "-->");
        current = current.next;
    }
    System.out.println("Null");
}

public void insertfirst(int value){
    listnode node = new listnode(value);
    node.next = head;
    head = node;
}
// finding nth fron first pos
public listnode findnfrm(int position){
    listnode current = head;
    
    int count = 1;
    while(count < position){
        
        current = current.next;
        count++;
    }
    return current;
}
// finding nth from end of the list
public listnode findnth(int n){
    listnode mainptr = head;
    listnode refptr = head;
    int count = 0;
    while(count < n){
        mainptr = mainptr.next;
        count ++;
    }
    while(mainptr != null){
        mainptr = mainptr.next;
        refptr = refptr.next;
    }
    return refptr;
}

public static void main(String[] args) {
    findn sll = new findn();
    sll.insertfirst(1);
    sll.insertfirst(2);
    sll.insertfirst(3);
    sll.insertfirst(4);
    sll.insertfirst(5);
    sll.insertfirst(6);
    sll.display();
    System.out.println("length of list ="+ sll.length());
    System.out.println("the value of 2th position from end of list:"+ sll.findnth(2).data);
    System.out.println("the value of 2th position from start of list:"+ sll.findnfrm(2).data);
}
}
