public class positionsll {
    private listnode head;
    private static class listnode{
        private int data;
        private listnode next;

        public listnode(int data){
            this.data = data;
            this.next = null;

        }

    }

public void display(){
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

public void insertat(int position , int value){
    listnode node = new listnode(value);

    if(position == 1){
        node.next = head;
        head = node;
    }
    else{
        listnode previous = head;
        int count = 1;
        while(count < position-1){
            previous = previous.next;
            count++;
        }
        listnode current = previous.next;
        node.next = current;
        previous.next = node;
    }   
}


public static void main(String[] args){
    positionsll sll = new positionsll();
    
    sll.insertat(1, 10); 
    sll.insertat(2, 11);
    sll.insertat(1, 5);
    
    sll.display();
    System.out.println("length of singlelinkedlist :"+ sll.length());
}
}
