public class deletesll {
    private listnode head;
    private static class listnode{
        private int data;
        private listnode next;

        public listnode(int data){
            this.data = data;
            this.next = null;


        }
    }

public void display(){                      //this function is used to display value
    listnode current = head;
    while(current != null){
        System.out.print(current.data + "-->");
        current = current.next;
    }
    System.out.println("Null");             //after diplaying the value in continue of this will display null  
}

public int length(){
    if(head == null){                       // if node is empty it returns 0
        return 0;
    }
    int count = 0;
    listnode current = head;
    while(current != null){
        count++;                            // current = current + 1
        current = current.next;
    }
    return count;
}

public void insert(int position , int value){
    listnode node = new listnode(value);
    if(position == 1){
        node.next = head;                   // if position 1 
        head = node;
    }
    else{
        listnode previous = head;
        int count = 1;
        while( count< position-1){
            previous = previous.next;        // if position is something
            count++;
        }
        listnode current = previous.next;
        node.next = current;
        previous.next = node;

        
    }
}

// delete at first
public listnode deletefirst(){
    if(head == null){
    return null;
    }
    listnode temp = head;
    head =  head.next;
    temp.next = null;
    return temp;
}

// delete at last
public listnode deleteend(){
    if(head == null || head.next == null){
        return head;
    }
    listnode current = head;
    listnode previous = null;
    while(current.next != null){
        previous = current;
        current = current.next;
    }
    previous.next = null;
    return current;

}

public static void main(String[] args) {
    deletesll sll = new deletesll();
    sll.insert(1, 10);
    sll.insert(2, 11);
    sll.insert(3, 12);
    sll.insert(4, 13);
    sll.insert(5, 15);
    sll.display();
    System.out.println("Length of sll :"+sll.length());
    System.out.println(sll.deletefirst().data);
    sll.display();
    System.out.println("Length of sll :"+sll.length());
    System.out.println(sll.deleteend().data);
    sll.display();
    System.out.println("Length of sll :"+sll.length());

}
}

