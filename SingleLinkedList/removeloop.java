public class findstartloop {
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
public void removeloop(){
    listnode slwptr = head;
    listnode fstptr = head;
    while(fstptr != null && fstptr.next != null){
        fstptr = fstptr.next.next;
        slwptr = slwptr.next;

        if(fstptr == slwptr){
            deleteloop(slwptr);
            return;
        }
    }
    

}

public void deleteloop(listnode slwptr){
    listnode temp = head;
    while(slwptr.next != temp.next){
        temp = temp.next;
        slwptr = slwptr.next;
    }
    slwptr.next = null;
}

// creating loop
public void CreatingLoop(){
    listnode first = new listnode(1);
    listnode second = new listnode(2);
    listnode third = new listnode(3);
    listnode fourth = new listnode(4);
    listnode fifth = new listnode(5);
    listnode sixth = new listnode(6);

    head = first;
    first.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = fifth;
    fifth.next = sixth;
    sixth.next = third;

}

public static void main(String[] args) {
    findstartloop sll = new findstartloop();
    sll.CreatingLoop();
    sll.removeloop();
    sll.display();

} 
}

