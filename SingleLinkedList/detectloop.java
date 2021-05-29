public class detectloop {
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
// detect loop in list
public boolean detectloopin(){
    listnode fstptr = head;
    listnode slwptr = head;

    while(fstptr != null && fstptr.next != null){
        fstptr = fstptr.next.next;
        slwptr = slwptr.next;

        if(slwptr == fstptr){
            return true;
        }
    }
    return false;
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
    detectloop sll = new detectloop();
    sll.CreatingLoop();
    if(sll.detectloopin()){
        System.out.println("loop is find!!");
    }
    else{
        System.out.println("loop doesnot find!!");
    }
}

}
