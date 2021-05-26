public class singlelinkedlist{
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



public static void main(String[] args){
    singlelinkedlist sll = new singlelinkedlist();
    sll.head = new listnode(10);
    listnode second = new listnode(1);
    listnode third = new listnode(8);
    listnode fourth = new listnode(11);

    // now we will connect together 
    sll.head.next= second;
    second.next = third;
    third.next = fourth;
    
    
    sll.display();
    System.out.println("length of singlelinkedlist :"+ sll.length());
}
}