public class insertsll {
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
// insert at end
public void insertend(int value){
    listnode newnode =  new listnode(value);
    if(null == head){
        head = newnode;
        return;
    }
    listnode current = head;
    while (null != current.next){
        current = current.next;
    }
    current.next = newnode;
    
}
public static void main(String[] args){
    insertsll sll = new insertsll();
 


    //sll.insertfirst(11);
    //sll.insertfirst(2);
    //sll.insertfirst(8);
    //sll.insertfirst(22);
    //sll.display();
    //System.out.println("length of singlelinkedlist :"+ sll.length());;


    sll.insertend(10);
    sll.insertend(20);
    sll.insertend(30);
    sll.insertend(40);
    sll.display();
    System.out.println("length of singlelinkedlist :"+ sll.length());;
    

}


}