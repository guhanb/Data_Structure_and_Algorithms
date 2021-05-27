public class reverse {
    
    private static class listnode{
        private int data;
        private listnode next;

        public listnode(int data){
            this.data = data;
            this.next = null;

        }

    }

public void display(listnode head) {
    listnode current = head;
    while(current != null){
        System.out.print(current.data + "-->");
        current = current.next;
    }
    System.out.println("Null");
}    

public int length(listnode head){
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
// reverse
public listnode reverseList(listnode head){
    if(head == null){
        return head;
    }
    listnode current = head;
    listnode previous = null;
    listnode next = null;
    while(current != null){
        next = current.next;
        current.next = previous;
        previous = current;
        current = next;
    }
    return previous;
}




public static void main(String[] args){
    
    listnode head = new listnode(10);
    listnode second = new listnode(1);
    listnode third = new listnode(8);
    listnode fourth = new listnode(11);

    // now we will connect together 
    head.next= second;
    second.next = third;
    third.next = fourth;
    
    reverse sll = new reverse();
    sll.display(head);;
    System.out.println("length of singlelinkedlist :"+ sll.length(head));
    listnode reverselist = sll.reverseList(head);
    sll.display(reverselist);
    
}
}
