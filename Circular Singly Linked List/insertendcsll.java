package circularsll;


public class insertendcsll {
    private listnode last;
    private int length;

    private class listnode{
        private listnode next;
        private int data;

        public listnode(int data){
            this.data = data;
        }
    }

public insertendcsll(){
    last = null;
    length = 0;
}

public int length(){
    return length;
}

public boolean isEmpty(){
    return length == 0;
}

public void insertend(int value){
    listnode node = new listnode(value);
    if(isEmpty()){
        last = node;
        last.next = last;
    }
    else{
        node.next = last.next;
        last.next = node;
        last = node;
    }
    
    length ++;
}

public void display(){
    if(isEmpty()){
        return;
    }
    listnode first = last.next;
    while(first != last){
        System.out.print(first.data + "-->");
        first = first.next;
    }
    System.out.println(first.data);
}

public static void main(String[] args) {
    insertendcsll csll = new insertendcsll();
    csll.insertend(1);
    csll.insertend(2);
    csll.insertend(3);
    csll.display();
    System.out.println("length of list:"+csll.length);

}
}


