public class posidel {
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
    int count = 0;
    listnode current = head;
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
    System.out.println("null");
}

public void deleteat(int position){
    if(position == 1){
        head = head.next;
    }
    else{
        listnode previous = head;
        int count = 1;
        while(count < position -1){
            previous = previous.next;
            count ++;
        }
        listnode current = previous.next ;
        previous.next = current.next;
    }
}

public void insert(int position , int value){
    listnode node = new listnode(value);
    if(position == 1){
        node.next = head;
        head = node;
    }
    else{
        listnode previous = head;
        int count = 1;
        while(count < position -1){
            previous = previous.next;
            count ++;
        }
        listnode current = previous.next;
        node.next = current;
        previous.next = node;
    }
}  

public static void main(String[] args) {
    posidel sll = new posidel();

    sll.insert(1, 10);
    sll.insert(2, 11);
    sll.insert(3, 12);
    sll.insert(4, 13);
    sll.insert(5, 15);

    sll.display();
    System.out.println("Length of list :"+sll.length());
    sll.deleteat(3);
    System.out.println("Length of list :"+sll.length());
    sll.display();

}
}
