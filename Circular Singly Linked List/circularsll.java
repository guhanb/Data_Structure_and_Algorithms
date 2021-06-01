public class circulalarsll {
    private listnode last;
    private int length;

    private class listnode{
        private listnode next;
        private int data;

        public listnode(int data){
            this.data = data;
        }
    }

public circulalarsll(){
    last = null;
    length = 0;
}

public int length(){
    return length;
}

public boolean isEmpty(){
    return length == 0;
}

// diplay 
public void display(){
    if(last == null){
        return;
    }
    listnode first = last.next;
    while(first != last){
        System.out.print(first.data + "-->");
        first = first.next;
    }
    System.out.println(first.data);
}



public void circulalarsllist(){
    listnode first = new listnode(1);
    listnode second = new listnode(2);
    listnode third = new listnode(3);
    listnode forth = new listnode(4);

    first.next = second;
    second.next = third;
    third.next = forth;
    forth.next = first;

    last = forth;
}

public static void main(String[] args) {
    circulalarsll csll = new circulalarsll();
    csll.circulalarsllist();
    csll.display();
}
}
