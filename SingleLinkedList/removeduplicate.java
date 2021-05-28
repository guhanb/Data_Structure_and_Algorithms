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
  
  

// Remove the duplicate node from a list
public void RemoveDuplicate(){
    listnode current = head;
    while(current != null && current.next != null){
        if(current.data == current.next.data){
            current.next = current.next.next;
        }
        else{
            current = current.next;
        }
    }
}

public static void main(String[] args) {
    findn sll = new findn();
    sll.insertfirst(1);
    sll.insertfirst(2);
    sll.insertfirst(3);
    sll.insertfirst(4);
    sll.insertfirst(4);
    sll.insertfirst(6);
    sll.display();
    System.out.println("length of list ="+ sll.length());
    sll.RemoveDuplicate();
    sll.display();
